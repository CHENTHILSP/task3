package august4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//input[@id='source']")).click();
		driver.findElement(By.id("source")).sendKeys("Chennai");
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		driver.findElement(By.id("destination")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		driver.findElement(By.xpath("//input[@id='datepicker1']")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		driver.findElement(By.xpath("//input[@id='Bustypes3']")).click();
		driver.findElement(By.xpath("//span[text()='Select Seat']")).click();
		driver.findElement(By.xpath("//a[@class='tooltip tooltipstered']")).click();
		driver.findElement(By.xpath("//input[@class='button shadow']")).click();
	    WebElement boarding = driver.findElement(By.xpath("//select[@id='boardingpoint_id']"));
	    Select boardingdd = new Select(boarding);
	    boardingdd.selectByVisibleText("velachery-09:37");
	    WebElement dropping = driver.findElement(By.xpath("//input[@id='droppingpoint_id']"));
	    Select droppingdd = new Select(dropping);
	    droppingdd.selectByVisibleText("Madiwala-17:00");
	    String title = driver.getTitle();
	    System.out.println(title);
	    driver.close();
		

	}

}
