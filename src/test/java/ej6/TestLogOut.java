package ej6;

import org.junit.Assert;
import singletonSession.Session;
import todoly.CenterSection;
import todoly.LeftSection;
import todoly.LoginModal;

public class TestLogOut {
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();

    String user = "jordi@ugarte.com";
    String pwd = "123456789";

    @org.junit.Test
    public void verify_recycle_bin_todoist() throws InterruptedException {
        Session.getSession().getDriver().get("https://todoist.com/");
        loginModal.loginButton.click();
        loginModal.loginAction(user, pwd);
        centerSection.logOutButton.click();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR!! Did not logout", "message", "Recycle Bin has been Emptied.");
    }
}
