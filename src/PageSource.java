import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageSource {
ChromeDriver driver;

@Before
public void setUp()
{
	driver=new ChromeDriver();
	driver.get("https://www.Google.com//");
}
@Test
public void pageSource()
{
	String src=driver.getPageSource();
	if(src.contains("Gmail"))
	{
		System.out.println("Content Present");
	}
	else
	{
		System.out.println("Content Not Present");
	}
}
}
