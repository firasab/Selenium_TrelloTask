package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class fillInformationPage {
    WebElement title;
    WebElement createbtn;

    public fillInformationPage(WebDriver driver) {
        this.title = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/div[1]/label/input"));
        this.createbtn = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/form/button"));
    }

    public void putInfo( String title){
        try{
            this.title.sendKeys(title);
            Thread.sleep(10000);
            this.createbtn.click();
        }catch (Exception e){
            System.out.println(e);
        }


    }
}
