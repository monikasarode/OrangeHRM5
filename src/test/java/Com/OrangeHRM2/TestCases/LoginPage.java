package Com.OrangeHRM2.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		WebElement txtusername=driver.findElement(By.id("txtUsername"));
		txtusername.sendKeys("Admin");
		System.out.println("Enter UserName");  
		Thread.sleep(2000);
		
		WebElement txtpassword=driver.findElement(By.id("txtPassword"));
		txtpassword.sendKeys("admin123");
		System.out.println("Enter Password");
		Thread.sleep(2000);
		
		WebElement btnLogin=driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		System.out.println("Click On Login Button");
		Thread.sleep(2000);
		
		WebElement btnmyinfo=driver.findElement(By.id("menu_pim_viewMyDetails"));
		btnmyinfo.click();
		System.out.println("Click On My Info Button");
		
			WebElement btnsave=driver.findElement(By.id("btnSave"));
		btnsave.click();
System.out.println("Click On Button Save");

WebElement txtfirstname=driver.findElement(By.id("personal_txtEmpFirstName"));
txtfirstname.clear();
	WebElement txtempfirstname=driver.findElement(By.id("personal_txtEmpFirstName"));
	txtempfirstname.sendKeys("Monika");
	System.out.println("Enter The First Name");
	
	WebElement txtempmiddlename=driver.findElement(By.id("personal_txtEmpMiddleName"));
	txtempmiddlename.sendKeys("Balwant");
	System.out.println("Enter The Middle Name");
	
	WebElement txtemplastname=driver.findElement(By.id("personal_txtEmpLastName"));
	txtemplastname.clear();
	txtemplastname.sendKeys("Sarode");
	System.out.println("Enter The Last Name");
	
	WebElement txtemployeeid=driver.findElement(By.id("personal_txtEmployeeId"));
	txtemployeeid.clear();
	txtemployeeid.sendKeys("123");
	System.out.println("Enter The EmployeeId");
	
	WebElement txtotherid=driver.findElement(By.id("personal_txtOtherID"));
	txtotherid.sendKeys("456");
	System.out.println("Enter The OtherId");
	
	WebElement txtlicenno=driver.findElement(By.id("personal_txtLicenNo"));
	txtlicenno.click();
	txtlicenno.sendKeys("12345");
	System.out.println("Enter The Licen no");
	
	WebElement txtsinno=driver.findElement(By.id("personal_txtSINNo"));
	txtsinno.clear();
	txtsinno.sendKeys("5678");
	System.out.println("Enter The Sin No");
	
	WebElement txtsnnno=driver.findElement(By.id("personal_txtNICNo"));
	txtsnnno.sendKeys("9876");
	System.out.println("Enter The Snn No");
	
	WebElement optgender=driver.findElement(By.id("personal_optGender_2"));
	optgender.click();
	System.out.println("Click On Option Gender");
	
	WebElement txtempnickname=driver.findElement(By.id("personal_txtEmpNickName"));
	txtempnickname.clear();
	txtempnickname.sendKeys("moni");
	System.out.println("Enter The Nick Name");
	
	WebElement chksmokeflag=driver.findElement(By.id("personal_chkSmokeFlag"));
	chksmokeflag.click();
	System.out.println("Click On The smoke Flag");
	
	WebElement txtmilitaryser=driver.findElement(By.id("personal_txtMilitarySer"));
	txtmilitaryser.sendKeys("9078");
	System.out.println("Enter The MilitarySer");
	
	WebElement txtlicexpdate=driver.findElement(By.id("personal_txtLicExpDate"));
	txtlicexpdate.clear();
	txtlicexpdate.sendKeys("2022-04-19",Keys.ENTER);  
	
	WebElement emppic=driver.findElement(By.xpath("//img[@id='empPic']"));
	emppic.click();
	System.out.println("Click On Profile Pic");
	
	
	
	
			
	
	
	}

}
































