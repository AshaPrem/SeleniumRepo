package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;






public class LearnSelectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml");
				
driver.manage().window().maximize();





WebElement source = driver.findElement(By.xpath("//select[@class = 'ui-selectonemenu']"));
Select dd=new Select(source);
dd.selectByVisibleText("Selenium");

WebElement country = driver.findElement(By.xpath("//label[@id= 'j_idt87:country_label']"));
Select cc=new Select(country);
cc.selectByVisibleText("USA");





//driver.findElement(By.xpath("//label[@id= 'j_idt87:city_label']")).clear();
//driver.findElement(By.xpath("//input[@name= 'j_idt87:auto-complete_input']")).click();





	}

}
