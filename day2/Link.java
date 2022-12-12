package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/link.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20)); 
		 driver.findElement(By.xpath("//a[@class='ui-link ui-widget']")).click();
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		//driver.findElement(By.xpath("//a[text()='Broken?']")).isDisplayed();
		
		driver.findElement(By.xpath("(//a[@class='ui-link ui-widget'])[3]")).click();
		System.out.println("No of links :"+driver.findElements(By.tagName("a")).size());
		System.out.println("No of links in layout :"+driver.findElements(By.xpath("(//a[@class='ui-link ui-widget'])[4]")).size());
		
	}

}
