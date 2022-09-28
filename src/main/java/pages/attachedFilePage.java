package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class attachedFilePage {
    WebElement firstCard;






    public attachedFilePage(WebDriver driver) throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(5000);
        this.firstCard = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a/div[3]/span"));

    }

    public void newAddressClicker() {
        this.firstCard.click();



    }
}
