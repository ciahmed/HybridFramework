package testinggeico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class GetQuote {

    WebDriver driver;

    @BeforeMethod
    public void openHomepage()  {

        System.setProperty("webdriver.chrome.driver" , "/Users/chowdhuryahmed/IdeaProjects/AutomationProject/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.findElement(By.xpath("//div[@data-product='auto']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"bundleModalBtn\"]/p/a")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='5-Digit ZIP']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@placeholder='5-Digit ZIP']")).sendKeys("92374");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("input[class='btn btn--primary btn--full-mobile']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[2]/div/input")).sendKeys("Chowdhury");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[3]/div/input")).sendKeys("Ahmed");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[4]/div/input")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[4]/div/input")).sendKeys("07/14/1978");
        Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/main/div/section/div/div/div/form/div[6]/div/button")).click();
        Thread.sleep(10000);

    }


    @AfterMethod
    public void endTest() {
        driver.close();
    }


}
