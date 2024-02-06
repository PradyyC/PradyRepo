package SwagLabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsEx3 {

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

			WebElement FilterAtoZ = driver.findElement(By.xpath("//option[contains(text(),'Name (A to Z)')]"));
			FilterAtoZ.click();
			
			WebElement FilterZtoA = driver.findElement(By.xpath("//option[contains(text(),'Name (Z to A)')]"));
			FilterZtoA.click();
			
			WebElement FilterLowtoHigh = driver.findElement(By.xpath("//option[contains(text(),'Price (low to high)')]"));
			FilterLowtoHigh.click();
			
			WebElement FilterHightoLow = driver.findElement(By.xpath("//option[contains(text(),'Price (high to low)')]"));
			FilterHightoLow.click();
			
	}

}
