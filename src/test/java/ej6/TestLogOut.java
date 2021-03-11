package ej6;

import org.junit.Assert;
import singletonSession.Session;
import todoly.CenterSection;
import todoly.LeftSection;
import todoly.LoginModal;
import todoly.MainPage;

public class TestLogOut {
    LoginModal loginModal = new LoginModal();
    CenterSection centerSection = new CenterSection();
    MainPage mainPage = new MainPage();

    String user = "jordi@ugarte.com";
    String pwd = "123456789";

    @org.junit.Test
    public void verify_logout_todoly() throws InterruptedException {
        Session.getSession().getDriver().get("http://todo.ly/");
        mainPage.loginButton.click();
        loginModal.loginAction(user, pwd);
        centerSection.logOutButton.click();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR!! Did not logout", "http://todo.ly/", Session.getSession().getDriver().getCurrentUrl());
    }
}
