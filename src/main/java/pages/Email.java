package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Email {
    WebDriver driver;
    @FindBy(xpath = "//a[@id='topTabAAR']")
    WebElement AccActandReporting;

    @FindBy(xpath = "//a[contains(text(),'Add Stop Payment')]")
    WebElement addStopPayment;

    @FindBy(xpath = "//a[@id='topTabFT']")
    WebElement paymentandTrans;

    @FindBy(xpath = "//a[normalize-space()='Reverse ACH Transaction']")
    WebElement revACHTrasaction;


    public Email (WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    public void clickAccActandReporting(){
        AccActandReporting.click();
    }

       public void clickaddStopPayment( ) {
        addStopPayment.click();

//           Actions act =new Actions(driver);
//           act.moveToElement(addStopPayment).click();
       }
       public void clickpaymentandTrans (){
        paymentandTrans.click();
       }

       public void clickRevACHTrasaction(){
        revACHTrasaction.click();
       }




   }
