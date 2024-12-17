import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {
ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void titleVerification()
	{
		String actualTitle=driver.getTitle();
		System.out.println("Title="+actualTitle);
		
		String expectedresult="Facebook";
		
		if(expectedresult.equals(actualTitle))
		{
			System.out.println("Title are Same");
			}
		else
		{
			System.out.println("Not Same");
		}
	}
	@After
		public void tearDown()
		{
			driver.quit();
		}
	}

