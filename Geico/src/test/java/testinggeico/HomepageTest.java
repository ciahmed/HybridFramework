package testinggeico;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HomepageTest {

    WebDriver driver;

    @BeforeMethod
    public void openHomepage()  {

        System.setProperty("webdriver.chrome.driver" , "/Users/chowdhuryahmed/IdeaProjects/AutomationProject/Drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.geico.com/");
        driver.manage().window().maximize();
    }

    @Test
    public void Test() throws InterruptedException {
        driver.findElement(By.linkText("icon-search right-icons-separator")).click();
        Thread.sleep(2000);
    }


    @AfterMethod
    public void endTest() {
        driver.close();
    }


}
