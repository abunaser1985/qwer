import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class test extends TestNGPage {


	@Test
		public void login1() {
	    	
	    	WebElement addCategory = driver.findElement(AddCategory);
	    	addCategory.sendKeys("Expensive_Items123");
	    	WebElement AddCategorybutton = driver.findElement(Button);
	    	AddCategorybutton.click();
			String a = driver.findElement(ExpensiveItemElement).getText();
	    	
			
			
			Assert.assertEquals("add category validation successful","Expensive_Items123", a);
		
	    }
}
