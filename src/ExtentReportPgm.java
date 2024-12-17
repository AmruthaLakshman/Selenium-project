import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.internal.annotations.ITest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;



public class ExtentReportPgm {
WebDriver driver;
ExtentHtmlReporter reporter;
ExtentTest test;
ExtentReports extent;
String baseUrl="https://www.facebook.com/";



@BeforeTest
public void extentReport()
{
    reporter = new ExtentHtmlReporter("./reports/myreport1.html");
	reporter.config().setDocumentTitle("Automation 	Report");
	reporter.config().setReportName("Functional Test");
	reporter.config().setTheme(Theme.DARK);
	extent=new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("Host Name","Local Host");
	extent.setSystemInfo("os","Windows 10");
	extent.setSystemInfo("Tester Name","abc");
	extent.setSystemInfo("Browser Name","Chrome");
	driver=new ChromeDriver();
}

@BeforeMethod
public void befMthd()
{
	driver.get(baseUrl);
}

@Test
public void titleVerification()
{
	test=extent.createTest("Fb title verification");
	String actualTitle=driver.getTitle();
	String exp="Facebook – log in or sign up";
	Assert.assertEquals(exp,actualTitle);
}
@Test
public void fbLogotest()
{
	test=extent.createTest("Fb Logo Verification");
	boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
    Assert.assertTrue(b);
}
@AfterTest
public void tearDown()
{
	extent.flush();
}
@AfterMethod
public void browserClose(ITestResult result) throws IOException
{
	if(result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,"test case failed is"+result.getName());
		test.log(Status.FAIL,"test case failed is"+result.getThrowable());
	}
	else if(result.getStatus()==ITestResult.SKIP)
	{
		test.log(Status.SKIP,"test case skipped is"+result.getName());
	}
	else if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,"Test case passed is"+result.getName());
	}
}
}
