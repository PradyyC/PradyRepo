package SwagLabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsEx5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Pradeep\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//input[@id='user-name']"));
		Username.sendKeys("standard_user");
		Thread.sleep(5000);
		
		WebElement Password = driver.findElement(By.xpath("//input[@id='password']"));
		Password.sendKeys("secret_sauce");
	
		WebElement Login = driver.findElement(By.xpath("//input[@id='login-button']"));
		Login.click();
		
		WebElement TwitterX = driver.findElement(By.xpath("//a[contains(text(),'Twitter')]"));
		TwitterX.click();
		
		WebElement Facebook = driver.findElement(By.xpath("//a[contains(text(),'Facebook')]]"));
		Facebook.click();
		
		WebElement LinkedIn = driver.findElement(By.xpath("//a[contains(text(),'LinkedIn')]"));
		LinkedIn.click();

	}

}
