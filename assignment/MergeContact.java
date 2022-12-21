package week4.day1.assignment;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {

	public static void main(String[] args) {
		
		
		
		
		
		
//1. Launch URL "http://leaftaps.com/opentaps/control/login"

ChromeDriver driver =new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		


//2. Enter UserName and Password Using Id Locator

driver.findElement(By.id("username")).sendKeys("DemoCSR");
driver.findElement(By.id("password")).sendKeys("crmsfa");

//3. Click on Login Button using Class Locator

driver.findElement(By.className("decorativeSubmit")).click();
// 4. Click on CRM/SFA Link
driver.findElement(By.linkText("CRM/SFA")).click();
// 5. Click on contacts Button
driver.findElement(By.xpath("//a[text()='Contacts']")).click();
//6. Click on Merge Contacts using Xpath Locator
driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();

//* 7. Click on Widget of From Contact

driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();

//* 8. Click on First Resulting Contact


String windowHandle = driver.getWindowHandle();
System.out.println(windowHandle);
Set<String> windowHandles = driver.getWindowHandles();
List<String>window=new ArrayList<String>(windowHandles);
System.out.println(window);
driver.switchTo().window(window.get(1));
// * 8. Click on First Resulting Contact
driver.findElement(By.xpath("//a[text()='14670']")).click();
driver.switchTo().window(window.get(0));

// * 9. Click on Widget of To Contact
driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();


String windowHandle1 = driver.getWindowHandle();
System.out.println(windowHandle1);
Set<String> windowHandles1 = driver.getWindowHandles();
List<String>window1=new ArrayList<String>(windowHandles1);
System.out.println(window1);
driver.switchTo().window(window1.get(1));
driver.findElement(By.xpath("//a[text()='14671']")).click();
driver.switchTo().window(window1.get(0));
driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
//accept alert
Alert alert = driver.switchTo().alert();
alert.accept();
//get title
String title = driver.getTitle();
System.out.println(title);



	}

}
