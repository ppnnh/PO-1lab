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

public class Sort {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Sort items")
    public void Sort() throws InterruptedException {
        EvrosetHome evrosetHome=new EvrosetHome(driver);
        evrosetHome.OpenMainPage();
        evrosetHome.FindElementAndClick("/html/body/div[6]/section[1]/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div/div/div/div[2]/a");
        logger.info("catalog of products");
        Thread.sleep(2000);
        evrosetHome.FindElementAndClick("/html/body/div[6]/div/div[3]/div/div/div/div[2]/div/div/section/div/div/div/div[3]/div/div/div/div/div/div/div/div/div/span/span");
        logger.info("choose type of sort");
        Thread.sleep(1000);
        evrosetHome.FindElementAndClick("/html/body/ul/div[1]/span[2]");
        logger.info("sort by cost");
        Thread.sleep(2000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
