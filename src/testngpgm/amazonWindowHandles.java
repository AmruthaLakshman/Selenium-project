package testngpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class amazonWindowHandles {
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://amazon.in");
}
@Test
public void titleverification() {
	String actualTitle = driver.getTitle();	
	System.out.println("Title="+actualTitle);
	String expectedresult="amazon.in";
	if(expectedresult.equals(actualTitle))
	{
		System.out.println("Title are Same");
		}
	else
	{
		System.out.println("Not Same");
	}
	driver.findElement(By.xpath("//*[@id=\"CardInstance7fhaUpqgxFVl5t5tFc5XBA\"]/a/img"));

	String parentwindow=driver.getWindowHandle();
	System.out.println("Parent Window Title:"+driver.getTitle());
	driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
    Set<String>allWindows=driver.getWindowHandles();
    for(String handle:allWindows)
    	if(!handle.equalsIgnoreCase(parentwindow))
    	{
    		driver.switchTo().window(handle);
    		driver.findElement(By.xpath("//*[@id=\"attach-sidesheet-view-cart-button\"]/span/input")).sendKeys("The text");
    		driver.close();
    	}
    	driver.switchTo().window(parentwindow);
	}
}


	


