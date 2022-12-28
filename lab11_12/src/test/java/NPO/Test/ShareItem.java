package NPO.Test;

import NPO.Page.EvrosetHome;
import NPO.driver.DriverSingleton;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShareItem {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Share item")
    public void Share() throws InterruptedException {
        driver.get("https://evroset.by/product/smartfon-apple-iphone-13-pro-max-512gb-zolotoj");
        EvrosetHome evrosetHome=new EvrosetHome(driver);
        evrosetHome.FindElementAndClick("/html/body/div[6]/div/div/div/div/section[1]/div/div/div/div/div/div[2]/div/div[1]/div[5]/div");
        logger.info("press share button");
        Thread.sleep(2000);
        evrosetHome.FindElementAndClick("/html/body/div[6]/div/div/div/div/section[1]/div/div/div/div/div/div[2]/div/div[1]/div[5]/div/div/div[2]/div/ul/li[1]/a");
        logger.info("share in vk");
        Thread.sleep(5000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
