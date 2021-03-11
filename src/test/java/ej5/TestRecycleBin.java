package ej5;

import org.junit.Assert;
import singletonSession.Session;
import todoly.CenterSection;
import todoly.LeftSection;
import todoly.LoginModal;

public class TestRecycleBin {
    LoginModal loginModal = new LoginModal();
    LeftSection leftSection = new LeftSection();
    CenterSection centerSection = new CenterSection();

    String user = "jordi@ugarte.com";
    String pwd = "123456789";

    @org.junit.Test
    public void verify_recycle_bin_todoist() throws InterruptedException {
        Session.getSession().getDriver().get("https://todoist.com/");
        loginModal.loginButton.click();
        loginModal.loginAction(user, pwd);
        leftSection.recycleBinButton.click();
        leftSection.recycleBinOptions.click();
        leftSection.emptyRecycleBinButton.click();
        String message = centerSection.infoDialogLabel.getText();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR!! recycle bin wasn't emptied", message, "Recycle Bin has been Emptied.");
    }
}