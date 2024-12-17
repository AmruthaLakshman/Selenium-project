import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SantaMonica {
ChromeDriver driver;
@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.santamonicaedu.in");
}
@Test
public void locators()
{
	driver.findElement(By.xpath("//*class[@href='https://santamonicaedu.in']"));
driver.findElement(By.xpath("//input[contains(@class,'study-abroad)]")).click();
driver.findElement(By.xpath("//*a[@href='https://santamonicaedu.in/country/study-in-canada']"));
}		
}