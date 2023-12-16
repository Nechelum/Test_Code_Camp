import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class SeleniumWebSignupTest {

    //import the selenium webDriver
    private WebDriver driver;

    @Test

    public void start() throws InterruptedException {
        //Locate where the chromebrowser is
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\FacebookTest\\Testing\\resources\\chromedriver.exe");
        //1.Open your Chrome Browser
        driver = new ChromeDriver();
        //2.Input your Selenium Demo Page URL (https://selenium-blog.herokuapp.com)
        driver.get("https://selenium-blog.herokuapp.com");
        Thread.sleep(5000);
        //3.Maximize the browser
        driver.manage().window().maximize();
        //4.click on the signup button to open the signup page
        driver.findElement(By.xpath("/html/body/div[2]/div/a[2]")).click();
        //5.Input your username on the username field
        driver.findElement(By.id("user_username")).sendKeys("neche10");
        Thread.sleep(5000);
        //6.Input your email on the email address field
        driver.findElement(By.id("user_email")).sendKeys("neche10@mailinator.com");
        //7.Input password on the password field
        driver.findElement(By.id("user_password")).sendKeys("771799");
        //8.Click on the signup button
        driver.findElement(By.id("submit")).click();
        Thread.sleep(5000);
        //9.Click on User1 item on the list page
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/ul/div/div/li[1]/a")).click();
        //10.Search for an item (using python Selenium) and confirm
        driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/a")).click();
        Thread.sleep(5000);
        //11.Click on logout
        driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[3]/a")).click();
    }

    @AfterTest
    public void closeBrowser() {
        //Quit the Browser
        driver.quit();
    }


}







