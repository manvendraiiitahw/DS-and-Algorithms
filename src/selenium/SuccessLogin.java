//package selenium;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class SuccessLogin {
//    public static void main(String[] args) {
////        System.setProperty("webdriver.chrome.driver", "/Users/m0k00hw/Downloads/chromedriver");
//        WebDriver driver = new ChromeDriver();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//        driver.get("http://www.makemytrip.com");
//        driver.findElement(By.id("login_dropOpenItem")).click();
//        driver.findElement(By.id("username")).sendKeys("rishi.vg1@gmail.com");
//        driver.findElement(By.xpath("//input[@id='password_text']")).sendKeys("somepassword");
//        driver.findElement(By.id("login_btn")).click();
//    }
//}