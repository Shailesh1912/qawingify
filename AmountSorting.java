package LoginPageForm;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AmountSorting 
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
		
		
	ArrayList<String> obtainedList = new ArrayList<>(); 
	
	java.util.List<WebElement> elementList = driver.findElements(By.xpath("/html/body/div/div[3]/div[2]/div/div/div[2]/div"));
	
	for(WebElement we:elementList){
		   obtainedList.add(we.getText());
	}
	
	ArrayList<String> sortedList = new ArrayList<>();   
	
	for(String s:obtainedList){
	sortedList.add(s);
	}
	Collections.sort(sortedList);
	Assert.assertTrue(sortedList.equals(obtainedList));
	System.out.println("actualList");
	System.out.println(obtainedList);
	
	System.out.println("SortedList");
	System.out.println(sortedList);

}
	
	} 



