package ej5;

import org.junit.Assert;
import singletonSession.Session;
import todoly.CenterSection;
import todoly.LeftSection;
import todoly.LoginModal;
import todoly.MainPage;

public class TestRecycleBin {
    LoginModal loginModal = new LoginModal();
    LeftSection leftSection = new LeftSection();
    CenterSection centerSection = new CenterSection();
    MainPage mainPage = new MainPage();

    String user = "jordi@ugarte.com";
    String pwd = "123456789";

    @org.junit.Test
    public void verify_recycle_bin_todoly() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginButton.click();
        loginModal.loginAction(user, pwd);
        leftSection.recycleBinButton.click();
        leftSection.recycleBinOptions.click();
        leftSection.emptyRecycleBinButton.click();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR!! recycle bin wasn't emptied", centerSection.infoDialogLabel.getText(), "There are no items to display");
    }
}