package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class attachedFile {


    WebElement attachedFile;






    public attachedFile(WebDriver driver) throws InterruptedException {
        Thread.sleep(10000);
        this.attachedFile = driver.findElement(By.linkText("Attachment"));


    }

    public void attachedClicker() throws InterruptedException {

        this.attachedFile.click();


    }
}
