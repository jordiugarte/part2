package todoly;

import controls.Button;
import controls.Label;
import org.openqa.selenium.By;

public class CenterSection {
    public Label infoDialogLabel = new Label(By.xpath("//span[@id='InfoMessageText']"));
    public Button logOutButton = new Button(By.xpath("//a[@id='ctl00_HeaderTopControl1_LinkButtonLogout']"));

    public CenterSection() {
    }
}
