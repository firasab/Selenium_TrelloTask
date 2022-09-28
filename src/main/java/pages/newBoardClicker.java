package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class newBoardClicker {
    WebElement newBoardBtn;



    public newBoardClicker(WebDriver driver) {
        this.newBoardBtn = driver.findElement(By.xpath("/html/body/div[3]/div/section/div/nav/ul/li[1]/button"));
    }

    public void newAddressClicker(){
        this.newBoardBtn.click();

    }
}
