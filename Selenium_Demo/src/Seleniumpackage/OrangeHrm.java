package Seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {

	public static void main(String[] args) throws InterruptedException 
	{
		//System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		System.setProperty("webdriver.chrome.driver","D:\\Testing\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(1000);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		Thread.sleep(1000);
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"btnLogin\"]")).click();
	
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
		
		//for logout 
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();
		
		Thread.sleep(200);
		driver.findElement(By.xpath("//*[@id=\"welcome-menu\"]/ul/li[2]/a")).click();

	}

}

