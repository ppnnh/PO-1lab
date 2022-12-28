package NPO.Test;

import NPO.Page.EvrosetHome;
import NPO.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoToChat {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Go to chat and send message")
    public void Chat() throws InterruptedException {
        EvrosetHome evrosetHome = new EvrosetHome(driver);
        evrosetHome.OpenMainPage();


        Thread.sleep(5000);
        evrosetHome.FindElementAndClick("//*[@id=\"jvlabelWrap\"]/jdiv[1]");
        logger.info("go to chat");
        Thread.sleep(5000);

        WebElement textarea=driver.findElement(By.xpath("//*[@id=\"jcont\"]/jdiv[3]/jdiv/jdiv[3]/jdiv/jdiv[1]/jdiv[1]/textarea"));
        textarea.sendKeys("Testing...");
        textarea.sendKeys(Keys.ENTER);
        Thread.sleep(3000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
