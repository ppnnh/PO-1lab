import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.opera.OperaDriver;

public class CheckTestcase {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new OperaDriver();
        driver.get("https://evroset.by");
        driver.findElement(By.xpath("//div[@class='main-site-product-block-mini']")).click();
        driver.findElement(By.xpath("//div[@class='fc_i_outer']")).click();
    }
}
