import org.openqa.selenium.chrome.ChromeDriver;

public class FirstSelenium {

	public static void main(String[] args) {
						
				ChromeDriver driver=new ChromeDriver();
				driver.get("https://www.facebook.com");
				String actualTitle=driver.getTitle();
				System.out.println(actualTitle);
				
				String expectedresult="Facebook";
				
				if(expectedresult.equals(actualTitle))
				{
				System.out.println("Title are same");
			    }
				else
				{
					System.out.println("Not Same");
				}
				
				}
	}


