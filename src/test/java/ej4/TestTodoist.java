package ej4;

import org.junit.Assert;
import singletonSession.Session;
import todoist.LoginModal;

public class TestTodoist {

    LoginModal loginModal = new LoginModal();

    String user = "jordi12345@gmail.com";
    String pwd = "123456789abc";

    @org.junit.Test
    public void verify_login_todoist() throws InterruptedException {
        String newName = "Martin";
        Session.getSession().getDriver().get("https://todoist.com/");
        loginModal.loginButton.click();
        loginModal.loginAction(user, pwd);
        loginModal.userButton.click();
        loginModal.settingsButton.click();
        loginModal.editNameButton.click();
        loginModal.nameTextBox.clear();
        loginModal.nameTextBox.set(newName);
        loginModal.saveButton.click();
        String name = loginModal.nameLabel(newName).getText();

        Thread.sleep(2000);
        Assert.assertEquals("ERROR !!Cuenta no creada", newName, name);
    }
}
