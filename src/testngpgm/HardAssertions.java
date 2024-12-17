package testngpgm;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class HardAssertions {
	ChromeDriver driver;
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	@Test
	public void titleverification()
	{
		String actualTitle=driver.getTitle();
		String exp="Google";
		Assert.assertEquals(exp, actualTitle);
		
			System.out.println("Hello");
			}
}
