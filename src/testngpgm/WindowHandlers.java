package testngpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class WindowHandlers {
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://demo.guru99.com/popup.php");
}
@Test
public void WindowHandle()
{
	String parentwindow=driver.getWindowHandle();
	System.out.println("Parent Window Title:"+driver.getTitle());
	driver.findElement(By.xpath("/html/body/p/a")).click();
    Set<String>allWindows=driver.getWindowHandles();
    for(String handle:allWindows)
    {
    	if(!handle.equalsIgnoreCase(parentwindow))
    	{
    		driver.switchTo().window(handle);
    		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abc@gmail.com");
    		driver.close();
    	}
    	driver.switchTo().window(parentwindow);
    }
}


}

