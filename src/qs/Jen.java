package qs;

public class Jen {
	ExtentReports e=new ExtentReports("./ExtentReport/ExtentReport.html");
	
	@Test
	public void login()
	{
	
	System.setProperty("webdriver.gecko.driver","C:\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.gmail.com");
	//stem.out.println("hi");
	ExtentTest t = e.startTest("test1");
	 t.log(LogStatus.PASS,"hi");
	 e.endTest(t);
	 //e.flush();

	
	}
	
	@Test
	public void login1()
	{
		ExtentTest t1 = e.startTest("test2");
		t1.log(LogStatus.FAIL,"bye");
		 e.endTest(t1);
		 e.flush();
	//Assert.fail();

	
	}
}

