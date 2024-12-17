package testngpgm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class copyPastepgm {
	ChromeDriver driver;	
	
	@BeforeTest
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	
	@Test
	public void copypaste()
	{
		Actions act=new Actions(driver);
		WebElement fullname=driver.findElement(By.xpath("//*tblcrtac\\]/tbody/tr[3]/td[3]/input"));
		fullname.sendKeys("Anu");
		WebElement id=driver.findElement(By.xpath("//*tblcrtac\\]/tbody/tr[3]/td[3]/input"));
		id.sendKeys("Anu");
		
		act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
		act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
		act.keyDown(id,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	}
}
