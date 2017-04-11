import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Moonlight - PC on 4/5/2017.
 */


public class Login {

  // private static catalogLink = By.cssSelector("#subtab-AdminCatalog");
    private static String URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private static String login = "webinar.test@gmail.com";
    private static String password = "Xcg7299bnSmMuRLp9ITw";


    public static void  main(String[] args) throws InterruptedException {

        String property = System.getProperty("user.dir") + "/Chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);
        WebElement loginInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(5000);
        WebElement mainMenu = driver.findElement(By.className("employee_avatar_small"));
        mainMenu.click();
        WebElement mainlogout = driver.findElement(By.id("header_logout"));
        mainlogout.click();
        Thread.sleep(5000);
        driver.quit();





// Not relevant info for this homework


      /*  Object wait = null;
        wait.until(ExpectedConditions.visibilityOfElementLocated(catalogLink));
        WebElement catalogLink = driver.findElement(this.catalogLink);
        Actions actions = new Actions(driver);
        actions.moveToElement(catalogLink)
        .click().build().perform();

        */

    }

   // public static EventFiringWebDriver getConfiguredDriver() {
    //    WebDriver driver = getDriver();


    }


  //  public static WebDriver getConfiguredDriver() {
    //    return configuredDriver;
    //}
//}

/*

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class EventHandler implements WebDriverEventListener {

    @Override
    public void beforeNavigateTo(String url, WebDriver driver) {    }

    @Override
    public void afterNavigateTo(String url, WebDriver driver) {    }

    @Override
    public void beforeNavigateBack(WebDriver driver) {    }

    @Override
    public void afterNavigateBack(WebDriver driver) {    }

    @Override
    public void beforeNavigateForward(WebDriver driver) {    }

    @Override
    public void afterNavigateForward(WebDriver driver) {    }

    @Override
    public void beforeNavigateRefresh(WebDriver webDriver) {    }

    @Override
    public void afterNavigateRefresh(WebDriver webDriver) {    }
 */


