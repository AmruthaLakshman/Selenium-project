import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

public class screenShot { 
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver = new ChromeDriver();
		driver.get("");
	}
	@Test
	public void screenShot() throws IOException
	{
		File c=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(c, new File(" "));
		
		WebElement button=driver.findElement(By.xpath("/html/body/input[1]"));
		File buttonImage=button.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(buttonImage,new File("./screenShot/buttonimage.png"));
	
	}
 

}
