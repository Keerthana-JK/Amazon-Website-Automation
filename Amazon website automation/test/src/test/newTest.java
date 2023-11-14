package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class newTest {

	public static void main(String[] args) throws Exception
{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/sel/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		//TEST CASE 1 - dropdown menu - select books
		Select drpCategory = new Select(driver.findElement(By.name("url")));
		drpCategory.selectByVisibleText("Books");
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		
		//driver.close();
		
		
		//TEST CASE 2 - today's deals
		driver.navigate().to("https://www.amazon.in/deals?ref_=nav_cs_gb");
		Thread.sleep(5000);
		
		//TEST CASE 3 - item search
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		searchbox.sendKeys("guitar");
		searchbox.submit();
		Thread.sleep(5000);
		

		//TEST CASE 4 - select item
		driver.findElement(By.linkText("Juârez Acoustic Guitar, 38 Inch Cutaway, 038C with Bag, Strings, Pick and Strap, Black")).click();
		Thread.sleep(2000);
		
		//TEST CASE 5 - add item to cart
		driver.findElement(By.name("submit.add-to-cart")).click();
		
		driver.close();
	
	}

}
