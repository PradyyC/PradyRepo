package AEProject;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

//Testcase9
public class AEEx10{
	@Test
	public void testmethod5() throws InterruptedException {
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

		WebElement Products = driver.findElement(By.xpath("//a[@href='/products']"));
		Products.click();
		
		WebElement ProductSearch = driver.findElement(By.xpath("//a[@id='search_product']"));
		ProductSearch.sendKeys("Men");
		
		WebElement SearchClick= driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]"));
		SearchClick.click();
		
	}
}

