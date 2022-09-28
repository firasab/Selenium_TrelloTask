package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class newCard {
    WebElement addNewCardBtn;

    WebElement disc;



    public newCard(WebDriver driver) throws InterruptedException {
        driver.navigate().refresh();
        Thread.sleep(5000);
        this.addNewCardBtn = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[3]/a"));

    }

    public void newAddressClicker() throws InterruptedException {
        this.addNewCardBtn.click();
        Thread.sleep(3000);

    }
}
