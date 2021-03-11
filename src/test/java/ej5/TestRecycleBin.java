package ej5;

import org.junit.Assert;
import singletonSession.Session;
import todoly.LeftSection;
import todoly.LoginModal;

public class TestRecycleBin {
    LoginModal loginModal = new LoginModal();
    LeftSection leftSection = new LeftSection();

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

        Thread.sleep(2000);
        Assert.assertEquals("ERROR !!Cuenta no creada", newName, name);
    }
}

}
