package todoly;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class LeftSection {
    public Button recycleBinOptions= new Button(By.xpath("//div[@style='display: none;']/img[@src='/Images/dropdown.png']"));
    public Button recycleBinButton = new Button(By.xpath("//td[@class='FilterItemContent' and contains(.,'Recycle Bin')]"));
    public Button emptyRecycleBinButton = new Button(By.xpath("//a[@href='#emptyRecycle']"));

    public LeftSection(){

    }

}
