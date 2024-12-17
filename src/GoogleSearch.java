import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
ChromeDriver driver;

@Before
public void SetUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.Google.com//");
}
@Test
public void locators()
{
	driver.findElement(By.name("q")).sendKeys("Books",Keys.ENTER);
	//driver.findElement(By.name("btnK")).click();
}

}
