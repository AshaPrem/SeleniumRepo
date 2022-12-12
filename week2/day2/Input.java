package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class Input {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/input.xhtml;jsessionid=node0tmb2389go0xlxjvuy66xu9p668024.node0");
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30)); 
		driver.findElement(By.xpath("//input[@name='j_idt88:name']")).sendKeys("Asha");
		driver.findElement(By.xpath("//input[@value='Chennai']")).clear();
		driver.findElement(By.xpath("//input[@value='Chennai']")).sendKeys("Kerala");
		System.out.println(driver.findElement(By.xpath("//input[@id='j_idt88:j_idt91']")).isEnabled());
driver.findElement(By.xpath("//input[@value='Can you clear me, please?']")).clear();
System.out.println(driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']")).getAttribute("value"));
driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("ashaprem92@gmail.com");
driver.findElement(By.xpath("//textarea[@name='j_idt88:j_idt101']")).sendKeys("Hi Testleaf");

driver.findElement(By.xpath("//*[@id=\"j_idt106:thisform:age\"]")).sendKeys("Keys.ENTER");


driver.findElement(By.xpath("//*[@id=\"j_idt106:float-input\"]")).click();
driver.findElement(By.xpath("//*[@id=\"j_idt106:j_idt122\"]")).click();

		driver.close();
	}

}
