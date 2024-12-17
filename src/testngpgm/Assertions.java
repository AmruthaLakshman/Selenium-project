package testngpgm;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assertions {
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
	System.out.println("Title="+actualTitle);
	
	String expectedresult="Facebook";
	
	if(expectedresult.equals(actualTitle))
	{
		System.out.println("Pass");
		}
	else
	{
		System.out.println("Fail");
	}
	System.out.println("Hello");
}

}
