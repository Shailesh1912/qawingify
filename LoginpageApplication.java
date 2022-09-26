package LoginPageForm;

import static com.jbk.utility.EnvironmentStuff.browserClose;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginpageApplication
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.findElement(By.id("username")).sendKeys("snehal@123");
		driver.findElement(By.id("password")).sendKeys("123456");
		
		
		driver.findElement(By.xpath("/html/body/div/div/form/div[3]/button")).click();
		
	}
	




}


