import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookPgm {
ChromeDriver driver;
@Before
public void setUp()
{
driver=new ChromeDriver();
driver.get("https://www.facebook.com//");
}
@Test
public void Locators()
{
WebElement email=driver.findElement(By.name("abcd"));
email.sendKeys("Abcd");
driver.findElement(By.id("pass")).sendKeys("abcd123");
driver.findElement(By.name("login")).click();
}
}
