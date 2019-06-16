package Seleniumpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrangeHrm {
	static WebDriverWait wait;
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","C:\\iet81\\selenium_WebDriver\\selenium_lib\\chromedriver.exe");
	 driver=new ChromeDriver();
		//driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 5);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"dashboard-quick-launch-panel-menu_holder\"]/table/tbody/tr/td[1]/div/a/span")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.id("assignleave_txtEmployee_empName")).sendKeys("	Fiona Grace");
		
		Thread.sleep(2000);
		driver.findElement(By.id("assignleave_txtLeaveType")).sendKeys("Vacation US");
		
		Thread.sleep(2000);
		driver.findElement(By.id("assignleave_txtFromDate")).click();
		HandleJQueryDateTimePicker("22");
		
	}
	public static void HandleJQueryDateTimePicker(String day)
			throws InterruptedException {

		wait.until(ExpectedConditions.presenceOfElementLocated(By
				.id("ui-datepicker-div")));
		WebElement table = driver.findElement(By
				.className("ui-datepicker-calendar"));
		System.out.println("JQuery Calendar Dates");

		List<WebElement> tableRows = table.findElements(By.xpath("//tr"));
		for (WebElement row : tableRows) {
			List<WebElement> cells = row.findElements(By.xpath("td"));

			for (WebElement cell : cells) {
				if (cell.getText().equals(day)) {
					driver.findElement(By.linkText(day)).click();
				}
			}
		}
	}
}

//for logout 
	//	Thread.sleep(200);
	//	driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		
	//	Thread.sleep(200);
	//	driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();

/*
Thread.sleep(1000);
driver.findElement(By.linkText("Admin")).click();

Thread.sleep(1000);
driver.findElement(By.id("menu_admin_UserManagement")).click();

/*
//Add employee
Thread.sleep(1000);
driver.findElement(By.name("btnAdd")).click();

Thread.sleep(1000);
driver.findElement(By.name("systemUser[userType]")).sendKeys("ESS");

Thread.sleep(1000);
driver.findElement(By.name("systemUser[employeeName][empName]")).sendKeys("Preety Preet P");

Thread.sleep(1000);
driver.findElement(By.name("systemUser[userName]")).sendKeys("pranali");

Thread.sleep(1000);
driver.findElement(By.name("systemUser[status]")).sendKeys("Enabled");

Thread.sleep(1000);
driver.findElement(By.name("systemUser[password]")).sendKeys("12345678");

Thread.sleep(1000);
driver.findElement(By.name("systemUser[confirmPassword]")).sendKeys("12345678");

Thread.sleep(1000);
driver.findElement(By.name("btnSave")).click();*/

/*
//Search employee

Thread.sleep(2000);
driver.findElement(By.id("searchSystemUser_userName")).sendKeys("pranali");

Thread.sleep(2000);
driver.findElement(By.id("searchSystemUser_userType")).sendKeys("ESS");

Thread.sleep(2000);
driver.findElement(By.id("searchSystemUser_employeeName_empName")).sendKeys("Preety Preet P");

Thread.sleep(2000);
driver.findElement(By.id("searchSystemUser_status")).sendKeys("Enabled");

driver.findElement(By.id("searchBtn")).click();

*/

//PIM
/*
Thread.sleep(200);
driver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]")).click();

Thread.sleep(200);
driver.findElement(By.xpath("//*[@id=\"menu_pim_viewEmployeeList\"]")).click();

Thread.sleep(200);
driver.findElement(By.name("empsearch[employee_name][empName]")).sendKeys("Linda Anderson");

Thread.sleep(200);
driver.findElement(By.name("empsearch[id]")).sendKeys("0001");

Thread.sleep(200);
driver.findElement(By.name("empsearch[employee_status]")).sendKeys("Full-Time Permanent");

Thread.sleep(200);
driver.findElement(By.name("empsearch[termination]")).sendKeys("Current Employees Only");

Thread.sleep(200);
driver.findElement(By.name("empsearch[supervisor_name]")).sendKeys("John Smith");

Thread.sleep(200);
driver.findElement(By.name("empsearch[job_title]")).sendKeys("HR Manager");

Thread.sleep(200);
driver.findElement(By.name("empsearch[sub_unit]")).sendKeys("Administration");

Thread.sleep(200);
driver.findElement(By.id("searchBtn")).click();

*/