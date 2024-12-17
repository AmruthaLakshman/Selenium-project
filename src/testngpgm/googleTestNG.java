package testngpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class googleTestNG {
ChromeDriver driver;	
	
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://Google.com");
}
@Parameters("s")
@Test
public void googlesearch(String s)
{
	driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
}
}
