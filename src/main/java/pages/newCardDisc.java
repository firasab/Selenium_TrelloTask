package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class newCardDisc {


    WebElement disc;
    WebElement createBtn;



    public newCardDisc(WebDriver driver) throws InterruptedException {
        this.disc = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[1]/div/textarea"));
        this.createBtn = driver.findElement(By.xpath("//*[@id=\"board\"]/div[1]/div/div[2]/div/div[2]/div[1]/input"));
    }

    public void newAddressClicker(String disc) throws InterruptedException {

        this.disc.sendKeys(disc);
        this.createBtn.click();

    }
}
