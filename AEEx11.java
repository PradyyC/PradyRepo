package AEProject;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//Testcase9
public class AEEx11 {
	WebDriver driver;

	@BeforeMethod
	public void Beforemethod() {
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
	}

	@Test
	public void testmethod6() throws InterruptedException {
		WebElement Products = driver.findElement(By.xpath("//a[@href='/products']"));
		Products.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,400)");

		WebElement Subscription = driver.findElement(By.xpath("//a[@id='susbscribe_email']"));
		Subscription.sendKeys("pradip2512@gmail.com");

		WebElement SubscriptionArrow = driver.findElement(By.xpath("//a[@id='susbscribe']"));
		SubscriptionArrow.click();

	}

	@AfterMethod
	public void Aftermethod(ITestResult result) throws IOException {
		if (ITestResult.FAILURE == result.getStatus()) {
			Utility.TakingScreenshot(driver, result.getName());
		}
	}
}