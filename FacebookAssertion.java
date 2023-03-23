package stringPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;



public class FacebookAssertion {
	
	    @Test
		public void facebook() {
	
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	      driver.get("https://www.facebook.com/"); 
		 driver.manage().window().maximize();
		
		WebElement username=driver.findElement(By.id("email"));
		
		WebElement password=driver.findElement(By.cssSelector("input#pass"));
		
		Assert.assertTrue(username.isDisplayed());

		username.sendKeys("slami1671@gmail.com");
		
		Assert.assertTrue(password.isDisplayed());
		password.sendKeys("Winner@123");
		
		
		
		
		
		
		
		
		
	}

}
