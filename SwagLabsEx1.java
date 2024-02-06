package SwagLabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SwagLabsEx1 {

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
		
		WebElement Page1 = driver.findElement(By.xpath("//img[@alt='Sauce Labs Backpack']"));
		Page1.click();
		
		driver.navigate().back(); 
		Thread.sleep(5000);
		
		WebElement AddtoCart = driver.findElement(By.xpath("//button[@class='btn btn_primary btn_small btn_inventory']"));
		AddtoCart.click();
		
		WebElement Remove = driver.findElement(By.xpath("//button[@class='btn btn_secondary btn_small btn_inventory ']"));
		Remove.click();
		
		
	}
}
