package AEProject;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
//Testcase1
		public class AEEx2 {

			public static void main(String[] args) throws InterruptedException {
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

				WebElement FirstName = driver.findElement(By.xpath("//input[@id='first_name']"));
				FirstName.sendKeys("Pradeep");

				WebElement LastName = driver.findElement(By.xpath("//input[@id='last_name']"));
				LastName.sendKeys("C");

				WebElement Company = driver.findElement(By.xpath("//input[@id='company']"));
				Company.sendKeys("CG");

				WebElement Address = driver.findElement(By.xpath("//input[@id='address1']"));
				Address.click();

				WebElement Address2 = driver.findElement(By.xpath("//input[@id='address2']"));
				Address2.click();
				
				Select Country= new Select(driver.findElement(By.xpath("//option[contains(text(),'India')]")));
				Country.selectByVisibleText("India");
				
				WebElement State = driver.findElement(By.xpath("//input[@id='state']"));
				State.sendKeys("Karnataka");
				
				WebElement City = driver.findElement(By.xpath("//input[@id='city']"));
				City.sendKeys("Bangalore");
				
				WebElement Zipcode = driver.findElement(By.xpath("//input[@id='zipcode']"));
				Zipcode.sendKeys("560054");
				
				WebElement MobileNumber = driver.findElement(By.xpath("//input[@id='mobile_number']"));
			    MobileNumber.sendKeys("8050633938");
				
			    WebElement CreateAccount = driver.findElement(By.xpath("//button[contains(text(),'Create Account')]"));
		        CreateAccount.click();
				Thread.sleep(5000);

				WebElement Continue = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		        Continue.click();

		        WebElement DeleteAccount = driver.findElement(By.xpath("//a[@href='/delete_account\']"));
		        DeleteAccount.click();
		        
		        WebElement Continue1 = driver.findElement(By.xpath("//a[@class='btn btn-primary']"));
		        Continue1.click();

			}
}


