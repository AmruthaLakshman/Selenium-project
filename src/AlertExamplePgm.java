import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertExamplePgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/adith/OneDrive/Desktop/alert_example.html");
	}
	@Test
	public void alertmsg()
	{
		driver.findElement(By.xpath("/html/body/input[1]")).click();
		Alert a=driver.switchTo().alert();
		String s=a.getText();
		System.out.println(s);
		a.accept();
		//a.dismiss(); for cancellation of an alert msg
		driver.findElement(By.xpath("/html/body/input[2]")).sendKeys("Sonu");
		driver.findElement(By.xpath("/html/body/input[3]")).sendKeys("SN");
		
	}
}
