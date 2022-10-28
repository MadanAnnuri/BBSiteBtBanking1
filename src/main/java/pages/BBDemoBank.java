package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBDemoBank {
    WebDriver driver;
    @FindBy(xpath = "//*[@id=\"mainContainer\"]/div/table/tbody/tr[3]/td/a")
    WebElement clickhere;
    public BBDemoBank (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void enterClickhere(){
        clickhere.click();
    }




}
