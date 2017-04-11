import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by Moonlight - PC on 4/10/2017.
 */
public class adminpanel {
    private static String URL = "http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/";
    private static String login = "webinar.test@gmail.com";
    private static String password = "Xcg7299bnSmMuRLp9ITw";



    public static void main(String[] args) throws InterruptedException {


        String property = System.getProperty("user.dir") + "/Chromedriver/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", property);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(URL);

        // login

        WebElement loginInput = driver.findElement(By.id("email"));
        WebElement passwordInput = driver.findElement(By.id("passwd"));
        WebElement loginButton = driver.findElement(By.name("submitLogin"));
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
        Thread.sleep(5000);

       // Dashboard

        WebElement dashboard = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/li[1]/a/span")); // title
        dashboard.click();
        WebElement dashboard_title = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String dashboard_check1 = driver.getTitle();
        Thread.sleep(5000);
        driver.navigate().refresh();
        WebElement dashboard_title2 = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String dashboard_check2 = driver.getTitle();
        System.out.println(dashboard_check1.equals(dashboard_check2));
        Thread.sleep(5000);

       // Reservation

        WebElement reserve = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/li[3]/a/span"));
        reserve.click();
        WebElement reserve_title = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String reserve_check = driver.getTitle();
        Thread.sleep(5000);
        driver.navigate().refresh();
        WebElement reserve_title3 = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String reserve_check2 = driver.getTitle();
        System.out.println(reserve_check.equals(reserve_check2));
        Thread.sleep(5000);

        // Delivery

        WebElement delivery = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/li[11]/a/span"));
        delivery.click();
        WebElement delivery_title = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String delivery_check = driver.getTitle();
        Thread.sleep(5000);
        driver.navigate().refresh();
        WebElement delivery_title3 = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String delivery_check2 = driver.getTitle();
        System.out.println(delivery_check.equals(delivery_check2));
        Thread.sleep(5000);

        // Statistics

        WebElement statistics = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/li[7]/a/span"));
        statistics.click();
        WebElement statistics_title = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String statistics_check = driver.getTitle();
        Thread.sleep(5000);
        driver.navigate().refresh();
        WebElement statistics_title3 = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String statistics_check2 = driver.getTitle();
        System.out.println(statistics_check.equals(statistics_check2));
        Thread.sleep(5000);

        // Clients

        WebElement clients = driver.findElement(By.xpath("/html/body/div[1]/div[1]/nav/ul/li[5]/a/span"));
        clients.click();
        WebElement clients_title = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String clients_check = driver.getTitle();
        Thread.sleep(5000);
        driver.navigate().refresh();
        WebElement clients_title3 = driver.findElement(By.className("page-title"));
        System.out.println(driver.getTitle());
        String clients_check2 = driver.getTitle();
        System.out.println(clients_check.equals(clients_check2));
        Thread.sleep(5000);
        driver.quit();
    }

}