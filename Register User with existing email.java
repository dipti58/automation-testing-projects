package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise5 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationExercise.com");
		System.out.println(driver.getTitle());
         
		String actualtitle=driver.getTitle();
		String expectedtitle="Automation Exercise";
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("home page visible");
		}
		else {
			System.out.println("home page is not visible");
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		WebElement ele1=driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
		System.out.println(ele1.isDisplayed());
		

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dipt");
        driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("swaldipti757@gmail.com");
        driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
        
		
		}
}
