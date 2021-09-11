package week2.day1.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
						WebDriverManager.chromedriver().setup();
				
				ChromeDriver driver = new ChromeDriver(); 
				driver.manage().window().maximize(); 

				driver.get("http://leaftaps.com/opentaps/control/main"); 
						
				WebElement username = driver.findElement(By.id("username"));
				username.sendKeys("demosalesmanager");
											
				WebElement password = driver.findElement(By.id("password"));
				password.sendKeys("crmsfa");
				
				WebElement loginbutton = driver.findElement(By.className("decorativeSubmit"));
				loginbutton.click();
				
				WebElement linktext = driver.findElement(By.linkText("CRM/SFA"));
				linktext.click();
				
				driver.findElement(By.linkText("Leads")).click();
				
				driver.findElement(By.linkText("Create Lead")).click();
				
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TEST LEAF");
				
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hemapriya");
				
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
				
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Hema");
				
				driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Priya");
				
				driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Mrs");
				
				//driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("22/02/1990");
				
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Electronics");
				
				driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("500");
				
				driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("+++++");
				
				driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Hemapriya Jibin");
				
				driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1000000");
				
				driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("2345");
						
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Welcome to Create Lead page...");
				
				driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Do not enter duplicate values");
				
				WebElement countryCode = driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode"));
				countryCode.clear();
				countryCode.sendKeys("9");
				
				driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("044");
				
				driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("22222");
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("HemapriyaSekar@gmail.com");
				
				driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9962106264");
				
				driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Hema");
				
				driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("https://www.google.com/");
				
				driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Anitha");
				
				driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("Tambaram");
				
				driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Chennai");
				
				driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("600073");
				
				driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("111111");
				
				driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Chitra");
				
				driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Selaiyur");
				
				driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("Iowa");
				
				//System.out.println("FirstName: "+ driver.findElement(By.id("createLeadForm_firstName")).getText());
				
				driver.findElement(By.className("smallSubmit")).click();
				
				System.out.println("Title: "+ driver.getTitle());
	}

}
