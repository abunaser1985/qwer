import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
public class testTwo {

WebDriver driver;
By AddCategory = By.xpath("//*[@id=\"extra\"]/input[1]");


By Button = By.xpath("//*[@id=\"extra\"]/input[2]");
By MonthDropDown = By.xpath("//*[@id=\"extra\"]/select[3]");
By NEVERMIND = By.xpath("/html/body/a[2]");
	
	@BeforeClass
    public void launch() {
		
		System.setProperty("webdriver.gecko.marionett", "Driver/geckodriver");
		driver = new FirefoxDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://techfios.com/test/101/#");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
    @Test
	public void login1() {
    	
    	driver.findElement(AddCategory).sendKeys("Expensive_Items");
		driver.findElement(Button).click();
		

}
    
    @Test
   	public void login2() {
       	
    	driver.findElement(AddCategory).sendKeys("Expensive_Items");
		driver.findElement(Button).click();
    }
	
    @Test
	public void login3() { 
	       	
    	driver.findElement(NEVERMIND).click();
	    driver.findElement(MonthDropDown).click();;
			
	}
    
}

