package SwagLabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsEx1a {

	WebDriver driver;

	@BeforeMethod	
	public void BeforeMethod() {
			
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Pradeep\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
			driver.manage().window().maximize();
	}
	
	@Test
	public void TestMethod1() throws InterruptedException {
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys("standard_user");
		Thread.sleep(5000);

		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod1() {
		driver.close();
	}

	@Test
	public void TestMethod2() throws InterruptedException {

		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
		Thread.sleep(5000);

		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod2() {
		driver.close();
	}

	@Test
	public void TestMethod3() {

		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
	}

	@org.testng.annotations.AfterMethod
	public void AfterMethod3() {
		driver.close();
	}
}
