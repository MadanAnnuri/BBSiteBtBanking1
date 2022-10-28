package pages;

import org.bouncycastle.jcajce.provider.asymmetric.X509;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class AddStopPayment {
    WebDriver driver;

    @FindBy(xpath = "//div[@class='headerSection multiCif']")
    WebElement companyframe0;
    @FindBy(xpath = "//*[@id=\"cifSelector\"]")
    WebElement companyframe1;

    //select in method

    @FindBy(xpath = "//*[@id=\"contactInformation\"]/tbody/tr[1]/td[2]/input")
    WebElement contactName;

    @FindBy(xpath = "//*[@id=\"contactInformation\"]/tbody/tr[2]/td[2]/input")
    WebElement phoneNumber;

    @FindBy(xpath = "//input[@onchange=\"valPhone(this, 'Fax Number', true);\"]")
    WebElement faxNumber;

    @FindBy(xpath = "//*[@id=\"contactInformation\"]/tbody/tr[4]/td[2]/input")
    WebElement emailAddress;

    @FindBy(xpath = "//*[@id=\"stopInformation\"]/tbody/tr[1]/td[2]/select")
    WebElement selectAccount;

    @FindBy(xpath = "//*[@id=\"stopInformation\"]/tbody/tr[2]/td[2]/select")
    WebElement selectReason;

    //Select selReason =new Select(selectReason);  in method we need to select

    @FindBy(xpath = "//*[@id=\"stopType0\"]")
    WebElement stopIndividualCheck;
    @FindBy(xpath = "//*[@id=\"individualStopDetails\"]/table/tbody/tr[1]/td[2]/input")
    WebElement checkNumber;
    @FindBy(xpath = "//*[@id=\"individualStopDetails\"]/table/tbody/tr[2]/td[2]/input")
    WebElement checkAmount;

    //calender
    @FindBy(xpath = "//input[@id='datepicker']")
    WebElement callender;

    @FindBy(xpath = "//*[@id=\"individualStopDetails\"]/table/tbody/tr[4]/td[2]/input")
    WebElement payee;

    @FindBy(xpath = "//*[@id=\"addButton\"]/span")
    WebElement add;

    @FindBy(xpath = "//button[contains(@role,'button')]//span[contains(@class,'ui-button-text')][normalize-space()='Add']")
    WebElement finaladd;

    @FindBy(xpath = "//*[@id=\"resetButton\"]/span")
    WebElement reset;

    public AddStopPayment(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

/*    public void setCompany(int com){
        //driver.switchTo().frame(companyframe0);
      //  Select sel=new Select(companyframe1);
        //sel.selectByVisibleText(com);
       // sel.selectByIndex(com);
        //driver.switchTo().defaultContent();
    }*/

    public void setContactName(String conName) {
        contactName.sendKeys(conName);
    }

    public void setPhoneNumber(String phNo) {
        phoneNumber.sendKeys(phNo);
    }

    public void setFaxNumber(String faxNo) {
        faxNumber.sendKeys(faxNo);
    }

    public void setEmailAddress(String email) {
        emailAddress.sendKeys(email);
    }
    //need to update dropdown method for acc and reason
    public void enterSelectAccount(String acc) {
        Select selacc = new Select(selectAccount);
        selacc.selectByVisibleText(acc);
    }

    public void setStopReason(int reason) {
        Select selacc = new Select(selectReason);
        selacc.selectByIndex(reason);
    }

    public void setStopIndividualCheck() {
        stopIndividualCheck.click();
    }

    public void setcheckNumber(String checkNum) {
        checkNumber.sendKeys(checkNum);
    }

    public void setcheckAmount(String checkMoney) {
        checkAmount.sendKeys(checkMoney);
    }

    public void entercallender(String date) {
        callender.sendKeys(date);
    }

    public void setpayee(String paye) {
        payee.sendKeys(paye);
    }

    public void setAdd() throws InterruptedException {
        add.click();
        finaladd.click();
    /*Thread.sleep(3000);
    Alert alt=driver.switchTo().alert();
    alt.accept();
    Thread.sleep(3000);*/
    }

    public void setReset() {
        reset.click();
    }

}
    //    @FindBy(xpath = "//*[@id=\"stopType1\"]")
//    WebElement stopRangeofChecks;

















   /* // 1. find the web element
    WebElement drpList = driver.findElement(By.xpath("//select[@id='cifSelector']"));
    // 2. create the object of the select class
    Select selList = new Select(drpList);

    selList.selectByIndex(0);*/


