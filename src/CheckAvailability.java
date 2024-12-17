import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckAvailability {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
}
@Test
public void buttonText()
{
	WebElement buttonText=driver.findElement(By.xpath("//*[contains(@name,btnchkaavail)]"));
	String buttonName=buttonText.getAttribute("value");
	
	if(buttonName.equals("Check Availability"))
	{
		System.out.println("Pass");
	}
	else
	{
		System.out.println("Fail");
	}
}
}
