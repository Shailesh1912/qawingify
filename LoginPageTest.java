package LoginPageForm;




import org.testng.annotations.Test;


import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTest 
{
@Test
public void titleTest()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	String expectedResult = "Login Form";
			String actualResult =driver.getTitle();
			System.out.println(actualResult);
			driver.quit();
			

}

@Test
public void UrlCheck()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	String expectedResult ="https://sakshingp.github.io/assignment/login.html";
	String actualResult = driver.getCurrentUrl();
	System.out.println(actualResult);
	driver.quit();
}
@Test
public void LogoTest()
{ 
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	
	WebElement  logo = driver.findElement(By.xpath("/html/body/div/div/div[1]/a/img"));
	boolean expectedResult =true;
	boolean actualResult = logo.isDisplayed();
	driver.quit();
	
}

@Test
public void loginTest()
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://sakshingp.github.io/assignment/login.html");

WebElement loginTexBox = driver.findElement(By.id("username"));
WebElement passwordTexBox = driver.findElement(By.id("password"));
driver.findElement(By.xpath("/html/body/div/div/form/div[3]/button")).click();
loginTexBox.sendKeys("snehal@123");
passwordTexBox.sendKeys("123456");
driver.quit();

}




@Test
public void VerifyFingerPrintIcon()
{
	
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	
	driver.findElement(By.id("username")).sendKeys("snehal@123");
	driver.findElement(By.xpath("/html/body/div/div/form/div[2]/div"));
	driver.findElement(By.xpath("/html/body/div/div/form/div[3]/button")).click();
	driver.quit();

}
@Test
public void VerifyTwitterLogo()
{
System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://sakshingp.github.io/assignment/login.html");

WebElement  logo = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/a[1]/img"));
boolean expectedResult =true;
boolean actualResult = logo.isDisplayed();
driver.quit();

}
@Test
public void VerifyFacebookLogo()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	WebElement  logo = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/a[2]/img"));
	boolean expectedResult =true;
	boolean actualResult = logo.isDisplayed();
	driver.quit();

	}

@Test
public void VerifySizeOfFacebookLogo()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	
	Dimension actualsize= driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/a[2]/img")).getSize();
	
	Dimension d=new Dimension(28, 28);
	Dimension expectedsize=d;
	
	assertEquals(actualsize,expectedsize);
	
}

	



	

@Test
public void VerifyLinkdinLogo()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	WebElement  logo = driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/a[3]/img"));
	boolean expectedResult =true;
	boolean actualResult = logo.isDisplayed();
	driver.quit();

	}
@Test
public void verifySizeOfLinkdinLogo()
{
	System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://sakshingp.github.io/assignment/login.html");
	Dimension actualsize= driver.findElement(By.xpath("/html/body/div/div/form/div[3]/div[2]/a[3]/img")).getSize();
	
	Dimension d=new Dimension(28, 28);
	Dimension expectedsize=d;
	
	assertEquals(actualsize,expectedsize);
	
}

}





