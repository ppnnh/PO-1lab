package NPO.Test;

import NPO.model.User;
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

public class AddReview {

    private static Logger logger = LogManager.getRootLogger();
    private WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void browserSetup() {
        driver = DriverSingleton.getDriver();

    }


    @Test(description = "Add review")
    public void Review() throws InterruptedException {
        EvrosetHome evrosetHome = new EvrosetHome(driver);
        evrosetHome.OpenMainPage();


        User user = new User("leraburanko@gmail.com", "lera12345");
        logger.info("Create user");

        evrosetHome.FindElementAndClick("/html/body/header/section[1]/div/div/div[2]/div/div[3]/div");
        logger.info("press authorization button");

        Thread.sleep(1000);
        WebElement inputEmail = driver.findElement(By.xpath("//*[@id=\"email\"]"));
        inputEmail.click();
        inputEmail.sendKeys(user.getEmail());
        logger.info("Enter email");

        Thread.sleep(1000);
        WebElement inputPassword = driver.findElement(By.xpath("//*[@id=\"name\"]"));
        inputPassword.click();
        inputPassword.sendKeys(user.getPassword());
        logger.info("Enter password");

        Thread.sleep(1000);
        evrosetHome.FindElementAndClick("//*[@id=\"login_tr\"]/form/a");
        logger.info("authorized");
        Thread.sleep(5000);

        driver.get("https://evroset.by/product/smartfon-apple-iphone-13-pro-max-512gb-zolotoj");
        evrosetHome.FindElementAndClick("//*[@id=\"_com63ac8106b5809\"]/div/div/section[1]/div/div/div/div/div/div[2]/div/div[1]/div[4]/a");
        evrosetHome.FindElementAndClick("//*[@id=\"pane-reviews\"]/div/div/div/button");
        logger.info("add review data");

        WebElement name=driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[1]/div/input"));
        name.click();
        name.sendKeys("Lera");

        WebElement header=driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[2]/div/input"));
        header.click();
        header.sendKeys("header");

        WebElement text=driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[3]/div/textarea"));
        text.click();
        text.sendKeys("good");

        WebElement advantages=driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[4]/div[1]/div/div/textarea"));
        advantages.click();
        advantages.sendKeys("good");

        WebElement disadvantages=driver.findElement(By.xpath("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[4]/div[2]/div/div/textarea"));
        disadvantages.click();
        disadvantages.sendKeys("-");

        evrosetHome.FindElementAndClick("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[6]/div/label[1]/span");
        Thread.sleep(3000);
        evrosetHome.FindElementAndClick("/html/body/div[11]/div/div[2]/div/div/div/form/div[1]/div[7]/button[1]");
        Thread.sleep(5000);
    }


    @AfterMethod(alwaysRun = true)
    public void browserTearDown() {
        DriverSingleton.closeDriver();

    }

}
