package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class loginPageWithEmail {
    WebDriver driver;
    WebElement logInBtn;
    WebElement nameInput;




    public loginPageWithEmail(WebDriver driver) {
        this.driver = driver;
        this.nameInput = driver.findElement(By.id("user"));
        this.logInBtn = driver.findElement(By.id("login"));


    }

    public void putInfo( String email){
        try{
            this.nameInput.sendKeys(email);
            this.logInBtn.click();
        }catch (Exception e){
            System.out.println(e);
        }


    }


}