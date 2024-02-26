package AEProject;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//Testcase5
public class AEEx6 {
	@Test
	public void testmethod4() {
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

		WebElement SignUpLogin = driver.findElement(By.xpath("//a[@href='login']"));
		SignUpLogin.click();

		WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
		Name.sendKeys("PradeepC");

		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("pradipp2512@gmail.com");

		WebElement Signup = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		Signup.click();
	}

}
