package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[text() = 'Basic']")).click();
		driver.findElement(By.xpath("//span[text() = 'Ajax']")).click();
		driver.findElement(By.xpath("//label[text() = 'Java']")).click();
		driver.findElement(By.xpath("//[@id='j_idt87:ajaxTriState']/div[2]")).click();
		driver.findElement(By.xpath("//div[@class= 'ui-toggleswitch-slider']")).click();
		
			}

}
