import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

/**
 * Created by Moonlight - PC on 4/3/2017.
 */
public class SeleniumDemo {
    public static void main(String[] args) {

    //    System.getProperty("driver.chrome"); // using without main way for folder

       String property =  System.getProperty("user.dir") + "/Chromedriver/chromedriver.exe"; // using via folder destination

        System.setProperty("webdriver.chrome.driver", property);

        WebDriver driver = new ChromeDriver();

       // WebDriver.Options manage= driver.manage();  - this is manage configurator for cookie abd other


        driver.get("https://www.bing.com/");
        WebElement go = driver.findElement(By.name("go"));
        WebElement searchButton = driver.findElement(By.className("b_searchboxSubmit"));
        searchButton.click();

        List<WebElement> b_algo = driver.findElements(By.className("b_algo")); // list for class name


      //  driver.switchTo().frame("example"); - for work with TAB
       // go.sendKeys();  - for work with TAB

    // FirefoxDriver
   /*   WebDriver firefoxDriver =  new FirefoxDriver();
        firefoxDriver.get("https://www.bing.com/");
        By by = By.className("b_searchbox");
        WebElement element = firefoxDriver.findElement(by);

      //  firefoxDriver.close(); // just close WebDrider, but not quit it
        firefoxDriver.quit();

    */

   // ChromeDriver



    }
}
