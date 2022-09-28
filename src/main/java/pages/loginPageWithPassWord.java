package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class loginPageWithPassWord {
    WebDriver driver;
    WebElement logInBtn;
    WebElement passwordInput;





    public loginPageWithPassWord(WebDriver driver) {
        this.driver = driver;
        this.passwordInput = driver.findElement(By.id("password"));
        this.logInBtn = driver.findElement(By.xpath("//*[@id=\"login-submit\"]/span"));


    }

    public void putInfo( String password){
        try{
            this.passwordInput.sendKeys(password);
            this.logInBtn.click();
        }catch (Exception e){
            System.out.println(e);
        }


    }


}