package testngpgm;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class trivagoDatePicker {
ChromeDriver driver;
@BeforeTest
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.trivago.in");
}
@Test
public void trivagoDatePicker()
{
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.xpath("//div[@class='calendar']/table/tbody/tr[3]/td[5]")).click();
	datePickMethod("November 2024","26");
}
private void datePickMethod(String expmonth, String expdate) {
	{
		while(true)
		{
			WebElement month=driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[1]/div/button[30]/time"));
			System.out.println("Month"+month);
			if(month.equals(expmonth))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[2]/h3")).click();
			}
		}
		List<WebElement>date= (List<WebElement>) driver.findElement(By.xpath("//*[@id=\"overlay-root\"]/div/section/main/div/div/div/div[2]/div[2]/div/button[22]/time"));
		for(WebElement d:date)
		{
			String datetext=d.getText();
			if(datetext.equals(expdate))
			{
				d.click();
				break;
			}
			}
	}
	
}
}
