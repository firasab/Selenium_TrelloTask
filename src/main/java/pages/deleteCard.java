package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class deleteCard {

    WebElement card;

    public deleteCard(WebDriver driver , int num){
        this.card = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/a[1]/span"));

    }

    public void deleteCardByNum() throws InterruptedException {
        Thread.sleep(10000);

        this.card.click();

    }
}
