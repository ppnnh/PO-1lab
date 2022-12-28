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

public class AddToComprasion {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Add to comprasion")
    public void Compare() throws InterruptedException {
        driver.get("https://evroset.by/product/smartfon-apple-iphone-14-pro-max-1tb-kosmiceskij-cernyj");
        logger.info("the first page opened");


        Thread.sleep(5000);
        WebElement comprasion = driver.findElement(By.xpath("//div[@class='cc_i_outer']"));
        comprasion.click();
        logger.info("press comprasion button");
        Thread.sleep(3000);

        driver.get("https://evroset.by/product/smartfon-apple-iphone-13-pro-256gb-al-pijskij-zelenyj");
        logger.info("the second page opened");

        Thread.sleep(3000);
        comprasion = driver.findElement(By.xpath("//div[@class='cc_i_outer']"));
        comprasion.click();
        logger.info("press comprasion button");
        Thread.sleep(3000);

        WebElement compare=driver.findElement(By.xpath("/html/body/div[10]/div[2]/div/div[2]/div/div[2]/button[1]"));
        compare.click();
        logger.info("compare page");
        Thread.sleep(5000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
