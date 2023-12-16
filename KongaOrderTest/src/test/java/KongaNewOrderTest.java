import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;




public class KongaNewOrderTest {

        //import the selenium webDriver
        private WebDriver driver;

        @Test (priority = 1)
        public void start() throws InterruptedException {

            //Locate where the chromebrowser is
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\KongaOrderTest\\resources\\chromedriver.exe");
            //1.Open your Chrome Browser
            driver = new ChromeDriver();
            //2.Input your Konga Page URL (https://www.konga.com)
            driver.get("https://www.konga.com");
            Thread.sleep(5000);
            //3.Maximize the browser
            driver.manage().window().maximize();
        }
             @Test (priority = 2)
             public void login() throws InterruptedException {
              //4.click on the login button to open the login page
             driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/div[4]/a")).click();
              Thread.sleep(5000);
                //5.Input your email on the email address field
                driver.findElement(By.id("username")).sendKeys("cynthiaanaebonam@gmail.com");
                //6.Input password on the password field
                driver.findElement(By.id("password")).sendKeys("771799");
                //7.Click on the login button
                driver.findElement(By.xpath("//*[@id=\"app-content-wrapper\"]/div[4]/section/section/aside/div[2]/div/form/div[3]/button")).click();
                Thread.sleep(10000);
            }

              @Test (priority = 3)
              public void categories() throws InterruptedException {
            //8.From the categories click on the computers and accessories
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[2]/div/a[2]")).click();
            Thread.sleep(7000);
            //9.Click on the laptop subcategory
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[2]/h1")).click();
            Thread.sleep(7000);
            //10.Click on Apple MacBooks
            driver.findElement(By.xpath("//*[@id=\"mainContent\"]/section[1]/div[1]/div/div[2]/h1")).click();
            Thread.sleep(7000);
            //11. Add Item to cart
            driver.findElement(By.xpath("//*[@id=\"nav-bar-fix\"]/div[1]/div/div/a[2]")).click();
            Thread.sleep(5000);
            //13.Click on checkout
            driver.findElement(By.className("_0a08a_3czMG")).click();
            Thread.sleep(7000);

        }


            @Test (priority = 4)
            public void delivery() throws InterruptedException {
                //delivery option
                driver.findElement(By.xpath("//button[contains(text(),'Change')]")).click();
                //Add delivery address
                Thread.sleep(5000);
                //Add address
                driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[2]/section[1]/section[1]/aside[1]/div[2]/div[1]/div[1]/div[2]/div[1]/form[1]/button[1]")).click();
                Thread.sleep(7000);
                //click on use this address
                driver.findElement(By.xpath("//a[contains(text(),'Use this Address')]")).click();
                Thread.sleep(7000);
            }

            @Test (priority = 5)
            public void payment() throws InterruptedException {
                //payment option
                By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[2]/section[1]/main[1]/div[1]/form[1]/div[1]/div[1]/section[2]/div[1]/div[1]").findElement(driver).click();
                //Click on pay now
                driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[2]/section[1]/main[1]/div[1]/form[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[1]/div[1]")).click();
                //Click on continue payment
                driver.findElement(By.xpath("//button[contains(text(),'Continue to Payment')]")).click();
                Thread.sleep(10000);
                driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[2]/section[1]/main[1]/div[1]/form[1]/div[1]/div[1]/section[2]/div[1]/div[2]/div[3]/div[2]/div[1]/button[1]")).click();
            }
               @Test (priority = 6)
              public void SelectCardMethod () throws InterruptedException {
                   // select a card payment method
                   // change from default to iframe
                   WebElement PayMethod = driver.findElement(By.tagName("iframe"));
                   driver.switchTo().frame("kpg-frame-component");
                   Thread.sleep(7000);
                   // select card payment method
                   WebElement CardPayment = driver.findElement(By.className("Card"));CardPayment.click();
                   System.out.println("select card method");
                   Thread.sleep(10000);
               }

               @Test (priority = 7)
               public void InputCardDetails () throws InterruptedException {
                   // input individual card details
                   // input card number in its field
                   WebElement CardDigit = By.id("card-number").findElement(driver);
                   CardDigit.sendKeys("123456789000");
                   Thread.sleep(3000);
                   // input date in its field
                   WebElement DateDigit = driver.findElement(By.id("expiry"));
                   DateDigit.sendKeys("1124");
                   Thread.sleep(3000);
                   // input CVV in its field
                   WebElement CvvDigit = driver.findElement(By.id("cvv"));
                   CvvDigit.sendKeys("456");
                   Thread.sleep(5000);
                   System.out.println("input card details");
               }

                   @Test (priority = 8)
                   public void errormessage () throws InterruptedException {
                   //11 print out the error message
                   WebElement error;
                       error = By.id("card-number_unhappy").findElement(driver);
                       System.out.println(error.getText());
                   Thread.sleep(5000);
                }

                   @Test (priority = 9)
                   public void CloseFrame () throws InterruptedException {
                       //12 close the Iframe that displays input card details
                       WebElement ExitFrame;
                       ExitFrame = driver.findElement(By.className("data-card__close"));
                       ExitFrame.click();
                       System.out.println("exit iframe");
                       Thread.sleep(5000);
                   }
                   @Test (priority = 10)
                   public void ExitBrowser () throws InterruptedException {
                       //Quit the browser
                       driver.quit();
                   }
                   @AfterTest
                   public void closeBrowser() {
                       driver.quit();
                   }








                   }




















