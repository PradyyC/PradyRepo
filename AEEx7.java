package AEProject;

import java.io.File;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//Testcase5
public class AEEx7 {
	@Test
	public void testmethod4() throws InterruptedException {
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
		
		WebElement ContactUs = driver.findElement(By.xpath("//a[@href='/contact_us']"));
		ContactUs.click();
		
		WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
		Name.sendKeys("PradeepC");
		
		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("Pradip2512@gmail.com");
		
		WebElement Subject = driver.findElement(By.xpath("//input[@name='subject']"));
	    Subject.sendKeys("Site crash");
		
		WebElement Message = driver.findElement(By.xpath("//input[@id='message']"));
		Message.sendKeys("Not working properly");
		
		WebElement Upload = driver.findElement(By.xpath("//input[@name='upload_file']"));
		Upload.sendKeys("‪D:\\Pics\\NY.jpg");
		
		WebElement Submit = driver.findElement(By.xpath("//input[@name='submit']"));
		Submit.click();
		
		Alert alt = driver.switchTo().alert();
		alt.accept();
		Thread.sleep(5000);
		
		WebElement Home = driver.findElement(By.xpath("//a[@span='1']"));
		Home.click();
		
	}

}
