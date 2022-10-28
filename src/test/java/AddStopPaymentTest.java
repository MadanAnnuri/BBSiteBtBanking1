import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.AddStopPayment;
import pages.BBDemoBank;
import pages.Email;

import javax.swing.plaf.TableHeaderUI;
import java.util.concurrent.TimeUnit;

public class AddStopPaymentTest {
    WebDriver driver;

    @Test
    public void StopPaymentTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://bbsitedemo.btbanking.com/onlineserv/CM/");
        BBDemoBank bb = new BBDemoBank(driver);
        bb.enterClickhere();
        Email email = new Email(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        /*email.clickpaymentandTrans();
        email.clickRevACHTrasaction();*/
        email.clickAccActandReporting();
        email.clickaddStopPayment();

        Thread.sleep(5000);

        AddStopPayment asp = new AddStopPayment(driver);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //asp.setCompany(1);
        //asp.setContactName("teja");
       // asp.setPhoneNumber("(603) 501-6775");
        //Thread.sleep(5000);
        asp.setFaxNumber("1234567890");
     //asp.setEmailAddress("abcd@gmail.com");
       asp.enterSelectAccount("01110001 - TEST1234");
       asp.setStopReason(1);
       asp.setStopIndividualCheck();
       asp.setcheckNumber("123");
       asp.setcheckAmount("20000");
       asp.entercallender("07062021");
        //Thread.sleep(5000);
       asp.setpayee("5000");
       asp.setAdd();
       //asp.setReset();
        Thread.sleep(3000);
        //driver.close();

    }
}
