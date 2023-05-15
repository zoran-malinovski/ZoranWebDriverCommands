//Browser Commands: (close(); quit();),
//Conditional Commands: (isDisplayed(); isEnabled(); isSelected(); ),
//Wait Commands: (Implicitwait(); Explicitwait();),
//Get Commands:(get(); getTitle(); getPageSource(); getCurrentUrl(); getText();)
//Navigation Commands: (navigate().forward(); navigate.back(); navigate().to(); navigate().refresh());
//Switch Commands: (switchTo().frame(); switchTo().alert(); SwitchTo().defaultContent(); switchTo()window(); DriverWindowHandles());

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverCommands {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Chrome Drivers\\chromedriver.exe");
        WebDriver driver;
        driver = new ChromeDriver();

        //driverObject.get("URL")
        driver.get("https://www.google.com/");
        String URL = driver.getCurrentUrl();
        driver.manage().window().maximize();
        System.out.println("the URL is : " +URL);
        Thread.sleep(2000);

        //driverObject.navigate().to()"URL"
        driver.navigate().to("https://login.yahoo.com");
        URL = driver.getCurrentUrl();
        driver.manage().window().maximize();
        System.out.println("navigate to URL : " +URL);
        Thread.sleep(2000);

        //driverObject.navigate().back()
        driver.navigate().back();
        URL = driver.getCurrentUrl();
        driver.manage().window().maximize();
        System.out.println("back to before url: " +URL);
        Thread.sleep(2000);

        //driverObject.navigate().forward()
        driver.navigate().forward();
        URL = driver.getCurrentUrl();
        driver.manage().window().maximize();
        System.out.println("navigate forward to url: " +URL);

    }

}
