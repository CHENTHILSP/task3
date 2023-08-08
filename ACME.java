package task3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ACME {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.acme.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("chenthil.testleaf@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@21");
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Log Out']")).click();
		driver.close();

	}

}
