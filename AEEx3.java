package AEProject;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
// Testcase2

public class AEEx3 {
@Test
	public void testmethod1() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pradeep\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("C:\\Users\\Pradeep\\Downloads\\AdBlock-—-best-ad-blocker.crx")); 
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		WebDriver driver = new ChromeDriver(options);
		
		driver.get("https://automationexercise.com/");
		driver.manage().window().maximize();

		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("pradip2512@gmail.com");
		
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("********");
		
		WebElement Login = driver.findElement(By.xpath("//button[contains(text(),'Login')]"));
		Login.click();
		
		WebElement DeleteAccount = driver.findElement(By.xpath("//a[@href='/delete_account\']"));
        DeleteAccount.click();
	}

}
