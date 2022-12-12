package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

 
 
 ChromeDriver driver=new ChromeDriver();
 driver.get("http://leaftaps.com/opentaps/control/main");
 driver.manage().window().maximize();
 driver.findElement(By.id("username")).sendKeys("DemoCSR");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	driver.findElement(By.xpath("//span[text()='Email']")).click();
	driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("ashaprem92@gmail.com");
	driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();

	driver.findElement(By.xpath("//a[@href='/crmsfa/control/viewLead?partyId=16702']")).click();
	
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Find Leads')]")).click();
	driver.findElement(By.xpath("//input[@class=' x-form-text x-form-field ']")).sendKeys("16702");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	System.out.println(driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText());
	
driver.close();


	}

}
