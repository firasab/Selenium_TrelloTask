package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.io.File;


public class uploadFile {

    WebElement fileUploader;
    WebElement btn;

    public uploadFile(WebDriver driver) {
        this.fileUploader = driver.findElement(By.name("file"));

    }

    public void UploadFile() {

        File file = new File("writeInfo.csv");
        this.fileUploader.sendKeys(file.getAbsolutePath());



    }
}
