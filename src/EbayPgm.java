import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class EbayPgm {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.ebay.com//");
}
@Test
public void locators()
{
driver.findElement(By.id("input")).sendKeys("ebay",Keys.ENTER);	
driver.findElement(By.id("gh-logo")).click();
driver.findElement(By.id("Art")).click();

}

}
