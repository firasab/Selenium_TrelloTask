import core.OpenBrowsers;
import core.Table;
import core.WriteLineByLine;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.*;

import java.util.ArrayList;
import java.util.List;


import static core.WriteCsvFile.writeDataLineByLine;

public class testTrello {
    WebDriver driver;
    String url;
    String secUrl;

    @BeforeSuite
    public void beforeSuite() {
        driver = OpenBrowsers.openBrowser("chrome");
        driver.manage().window().maximize();
      //  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        List<String> writeLinks = new ArrayList<>();
        writeLinks.add("hi");
        writeLinks.add("my name is firas");

        WriteLineByLine writeToFile =  new WriteLineByLine();
        writeToFile.writeDataLineByLine("writeInfo.csv", writeLinks);

    }




    @Test
    public void secondTest() throws InterruptedException {



        loginPageWithEmail emailPage = new loginPageWithEmail(driver);
        emailPage.putInfo("vip.firas@hotmail.com");
        Thread.sleep(5000);

        loginPageWithPassWord paswordPage = new loginPageWithPassWord(driver);
        paswordPage.putInfo("123mmmnnn@@");
        Thread.sleep(5000);


        newBoardBtn createBoard = new newBoardBtn(driver);
        createBoard.newAddressPage();
        Thread.sleep(5000);


        newBoardClicker clicker = new newBoardClicker(driver);
        clicker.newAddressClicker();
        Thread.sleep(5000);

        fillInformationPage fillTitleName =new fillInformationPage(driver);
        fillTitleName.putInfo("SeleniumTask");
        Thread.sleep(5000);

        this.secUrl = driver.getCurrentUrl();



        newCard card = new newCard(driver);
        card.newAddressClicker();
        Thread.sleep(5000);

        newCardDisc cardDisc = new newCardDisc(driver);
        cardDisc.newAddressClicker("trying to understand what to do");
        Thread.sleep(5000);


        attachedFilePage attachFile = new attachedFilePage(driver);
        Thread.sleep(5000);
        attachFile.newAddressClicker();

        attachedFile attachedFileClicker = new attachedFile(driver);
        attachedFileClicker.attachedClicker();


        uploadFile uploader = new uploadFile(driver);
        uploader.UploadFile();

        /////////////////////////////////////////////
        String firstTabID = driver.getWindowHandle();
        Thread.sleep(5000);
        this.url = driver.getCurrentUrl();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get(url);
        Thread.sleep(5000);
        String secondTabID = driver.getWindowHandle();
        driver.switchTo().window(firstTabID);
        driver.get(secUrl);

        newCard card2 = new newCard(driver);
        card2.newAddressClicker();
        Thread.sleep(5000);

        newCardDisc cardDisc2 = new newCardDisc(driver);
        cardDisc2.newAddressClicker("hi ");
        Thread.sleep(5000);

        driver.switchTo().window(secondTabID);
        driver.get(secUrl);
        Thread.sleep(5000);
        driver.switchTo().window(firstTabID);


//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        deleteCard deleteCard = new deleteCard(driver, 1);
//        Thread.sleep(5000);
//        deleteCard.deleteCardByNum();


    }








    @BeforeMethod
    public void beforeMethod() {
        driver.get("https://trello.com/login");
    }

}