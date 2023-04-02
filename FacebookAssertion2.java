package stringPrograms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FacebookAssertion2 {
	@Test
	public void facebookAssertion() {

		WebDriverManager.edgedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		driver.get("https://www.facebook.com/"); 
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@placeholder='Email address or phone number']")).sendKeys("slami1671@gmail.com");

		driver.findElement(By.name("pass")).sendKeys("Winner@123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String title= driver.getWindowHandle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[text()='Rajat Slam']")).click();
		String atitle=driver.getWindowHandle();
		System.out.println(atitle);
		System.out.println(driver.getTitle());
		String actualtitle= driver.getTitle();
		String profilepageTitle = "Facebook";

		Assert.assertEquals(actualtitle, profilepageTitle);






	}

}
