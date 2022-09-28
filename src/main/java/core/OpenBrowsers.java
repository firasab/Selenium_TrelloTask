package core;


        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.chrome.ChromeOptions;
        import org.openqa.selenium.edge.EdgeDriver;
        import org.openqa.selenium.firefox.FirefoxDriver;
        import org.openqa.selenium.firefox.FirefoxOptions;
        import org.openqa.selenium.firefox.FirefoxProfile;

        import java.io.File;
        import java.util.HashMap;

public class OpenBrowsers {

    public static WebDriver openchromeWithOptions() {
        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        String downloadFilepath = "downloads";
        File file = new File(downloadFilepath);

        HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups", 0);
        chromePrefs.put("download.default_directory", file.getAbsolutePath());
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("prefs", chromePrefs);
        options.addArguments("--start-maximized");
        //options.addArguments("--headless");
        options.addArguments("--disable-infobars");

        driver = new ChromeDriver(options);
        return driver;
    }

    public static WebDriver openFFWithOptions() {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        String downloadFilepath = "downloads";
        File file = new File(downloadFilepath);

        FirefoxProfile profile = new FirefoxProfile();

        // Instructing firefox to use custom download location
        profile.setPreference("browser.download.folderList", 2);

        // Setting custom download directory
        profile.setPreference("browser.download.dir", file.getAbsolutePath());

        // Skipping Save As dialog box for types of files with their MIME
        profile.setPreference("browser.helperApps.neverAsk.saveToDisk",
                "text/csv,application/java-archive, application/x-msexcel,application/excel,application/vnd.openxmlformats-officedocument.wordprocessingml.document,application/x-excel,application/vnd.ms-excel,image/png,image/jpeg,text/html,text/plain,application/msword,application/xml,application/vnd.microsoft.portable-executable");

        // Creating FirefoxOptions to set profile
        FirefoxOptions option = new FirefoxOptions();
        option.setProfile(profile);
        // Launching browser with desired capabilities

        driver = new FirefoxDriver(option);
        return driver;
    }

    public static WebDriver openBrowser(String browser) {

        WebDriver driver;
        if(browser.equals("firefox")) {
            //Setting webdriver.gecko.driver property
            System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");

            //Instantiating driver object and launching browser
            driver = new FirefoxDriver();
        }else if(browser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");

            //Instantiating driver object
            driver = new ChromeDriver();
        }else if(browser.equals("edge")) {
            System.setProperty(
                    "webdriver.edge.driver",
                    "src/main/resources/msedgedriver.exe");
            // Instantiate a ChromeDriver class.
            driver = new EdgeDriver();
        }else {
            driver = null;
        }

        return driver;
    }

    public static void main(String[] args) throws InterruptedException {
        String[] browsers = {"chrome","firefox","edge"};
        for(int i =0;i<browsers.length;i++) {
            WebDriver driver = OpenBrowsers.openBrowser(browsers[i]);
            driver.manage().window().maximize();
            driver.get("https://www.google.com/");
            Thread.sleep(5000);
            driver.get("https://www.bing.com/");
            Thread.sleep(5000);
            driver.navigate().back();
            Thread.sleep(5000);
            driver.navigate().forward();
            Thread.sleep(10000);
            driver.quit();
        }
    }
}