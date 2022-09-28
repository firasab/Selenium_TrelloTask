package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;




public class newBoardBtn {
    WebElement newBoardBtn;



    public newBoardBtn(WebDriver driver) {
        this.newBoardBtn = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div[2]/button"));
    }

    public void newAddressPage(){
        this.newBoardBtn.click();

    }
}
