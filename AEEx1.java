package AEProject;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;
//Testcase2
public class AEEx1 {

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

		WebElement SignUpLogin = driver.findElement(By.xpath("//a[@href='login']"));
		SignUpLogin.click();

		WebElement Name = driver.findElement(By.xpath("//input[@name='name']"));
		Name.sendKeys("PradeepC");

		WebElement Email = driver.findElement(By.xpath("//input[@name='email']"));
		Email.sendKeys("pradip2512@gmail.com");

		WebElement Signup = driver.findElement(By.xpath("//button[contains(text(),'Signup')]"));
		Signup.click();

		WebElement Mr = driver.findElement(By.xpath("//input[@id='id_gender1']"));
		Mr.click();
		
		Select DOBDay= new Select(driver.findElement(By.xpath("//select@[id='uniform-days']")));
		DOBDay.selectByVisibleText("25");
		
		Select DOBMonth= new Select(driver.findElement(By.xpath("//select[@id='months']")));
		DOBMonth.selectByVisibleText("December");
		
		Select DOBYear= new Select(driver.findElement(By.xpath("//select[@id='years']")));
		DOBYear.selectByVisibleText("1992");
		
		Thread.sleep(5000);

		List<WebElement>checkbox = driver.findElements(By.xpath("//input[@id='newsletter']"));
		int Size1= checkbox.size();
		System.out.println(Size1);
		
		for(int i=1;i<Size1;i++)
		{
			 checkbox.get(i).click();  
		}

	}

	}

