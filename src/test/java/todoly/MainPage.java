package todoly;

import controls.Button;
import controls.Image;
import controls.TextBox;
import org.openqa.selenium.By;

public class MainPage {
    public Image loginButton = new Image(By.xpath("//img[@src='/Images/design/pagelogin.png']"));

    public MainPage() {
    }
}
