import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class automationDemoSite {
ChromiumDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Datepicker.html");
}
@Test
public void datePicktest()
{
	driver.manage().timeouts().implicitlyWait(DurationOfSeconds(30));
	driver.findElement(By.xpath("")).click();
	datePickMethod("December 2024","23");
}

}
private void datePickMethod(String expmonth, String expdate) {
	
	while(true)
	{
	
		WebElement month;
		
	String month = ChromeDriver.findElement(By.xpath("//*@id-"));
		System.out.println("Month"+month);
		if(month.equals(expmonth))
		{
			break;
		}
		else
		{
			driver.findElement(By.xpath("//")).click();
		}
	}
	List<WebElement>date=driver.findElements(By.xpath(""));
	for(WebElement d:date)
	{
		String datetext=d.getText();
		if(datetext.equals(expdate))
	}
	d.click();
	}
}

