package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("CreateContacts")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Marshal");
		driver.findElement(By.id("lastNameField")).sendKeys("SP");
		driver.findElement(By.id("createContactForm_description")).sendKeys("Nothing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("marshal22@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGold"));
		Select statedd = new Select(state);
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.xpath("//input[@class='smallSubmit'][1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
	}

}
