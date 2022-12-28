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

public class DeleteFromCart {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Delete from cart")
    public void Cart() throws InterruptedException {
        EvrosetHome evrosetHome = new EvrosetHome(driver);
        evrosetHome.OpenMainPage();


        Thread.sleep(5000);
        evrosetHome.FindElementAndClick("//div[@class='product-button-col-mini']");
        logger.info("press cart button");
        Thread.sleep(5000);

        evrosetHome.FindElementAndClick("//*[@id=\"update_cart_form\"]/div[1]/table/tbody/tr/td[6]/span");
        logger.info("delete from cart");
        Thread.sleep(5000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
