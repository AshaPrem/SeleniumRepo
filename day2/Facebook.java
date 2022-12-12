package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Facebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
			ChromeDriver fb = new ChromeDriver();
			fb.get("https://en-gb.facebook.com/");

			fb.manage().window().maximize();

			fb.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 

			fb.findElement(By.xpath("//a[@data-testid = 'open-registration-form-button']")).click();

			fb.findElement(By.xpath("//input[@aria-label= 'First name']")).sendKeys("Asha");

			fb.findElement(By.xpath("//input[@aria-label= 'Surname']")).sendKeys("Sankar");

			fb.findElement(By.xpath("//input[@aria-label= 'Mobile number or email address']")).sendKeys("0123456789");

			fb.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Welcome@123");

						WebElement day = fb.findElement(By.id("day"));

						Select dd = new Select(day);
						dd.selectByIndex(0); 

						WebElement month = fb.findElement(By.id("month"));

						Select mm = new Select(month);
						mm.selectByValue("8");		

						WebElement year = fb.findElement(By.id("year"));

						Select yy = new Select(year);
						yy.selectByVisibleText("1995");	

			fb.findElement(By.xpath("//input[@value=\"1\"]"	)).click();

					
		
		
		
		
		
	}

}
