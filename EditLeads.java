package task2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLeads {

	public static void main(String[] args) {
		//Launch the browser
		ChromeDriver driver = new ChromeDriver();
//		Launch URL "http://leaftaps.com/opentaps/control/login"
		driver.get("http://leaftaps.com/opentaps/control/login");
		
		
		driver.manage().window().maximize();

//		Enter UserName and Password Using Id Locator
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("DemoSalesManager");

		WebElement passWord = driver.findElement(By.name("PASSWORD"));
		passWord.sendKeys("crmsfa");

//		Click on Login Button using Class Locator
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();

//		Click on CRM/SFA Link
		WebElement crmButton = driver.findElement(By.linkText("CRM/SFA"));
		crmButton.click();
		

//		Click Leads link
		WebElement leadsButton = driver.findElement(By.linkText("Leads"));
		leadsButton.click();
		
	    
		WebElement findLead = driver.findElement(By.linkText("Find Leads"));
		findLead.click();

//		Enter first name
		driver.findElement(By.id("//input[@name='firstName])[3]")).sendKeys("AustinMartin");
		

//		Click Find leads button
		 driver.findElement(By.id("//button[text()=findLeads")).click();
	
		 

//		Click on first resulting lead
		WebElement firstResult = driver.findElement(By.linkText("12281"));
		firstResult.click();

//		Verify title of the page
		String title = driver.getTitle();
		if (title.contains("View Lead | opentaps CRM")) {
			System.out.println("Title verified successfully");
		} else {
			System.out.println("Title not verified");
		}



//		Change the company name
		WebElement changeCN = driver.findElement(By.id("updateLeadForm_companyName"));
		changeCN.clear();
		changeCN.sendKeys("nossle");

//		Click Update
		WebElement updateButton = driver.findElement(By.className("smallSubmit"));
		updateButton.click();

//		Close the browser (Do not log out)
		driver.close();
	}





	}


