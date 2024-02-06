package SwagLabsProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabsEx2 {

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

				WebElement MenuItem = driver.findElement(By.xpath("//button[@id='react-burger-menu-btn']"));
				MenuItem.click();
				
				WebElement MenuItemAbout = driver.findElement(By.linkText("about_sidebar_link"));
				MenuItemAbout.click();
				
				WebElement MenuItemLogout = driver.findElement(By.linkText("logout_sidebar_link"));
				MenuItemLogout.click();
			
	}

}
