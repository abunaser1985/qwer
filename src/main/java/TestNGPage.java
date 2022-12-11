import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;


public class TestNGPage {

WebDriver driver;
By AddCategory = By.xpath("//*[@id=\"extra\"]/input[1]");
By Button = By.xpath("//*[@id=\"extra\"]/input[2]");
By ExpensiveItemElement = By.xpath("/html/body/div[3]/a[7]/span");
	
@BeforeClass
    public void launch() {
		
		System.setProperty("webdriver.gecko.marionett", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/102/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

    
}

