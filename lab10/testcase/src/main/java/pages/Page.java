package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Page extends BasePage {
    public Page(WebDriver driver) {
        super(driver);
    }

    private By pasteFindItem = By.xpath("//div[@class='main-site-product-block-mini']");
    private By pasteAddToFavourites = By.xpath("//div[@class='fc_i_outer']");

    public void openPage(){
        driver.get("https://evroset.by");
    }

    public void addToFavourites(){
        driver.findElement(pasteFindItem).click();
        driver.findElement(pasteAddToFavourites).click();
    }
}
