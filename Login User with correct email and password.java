package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationExercise.com");
		
		String title=driver.getTitle();
		String exptitle="Automation Exercise";
		System.out.println(title);
		
		if(title.equals(exptitle)) {
			System.out.println("home page is open");
		}else {
			System.out.println("Home page is not open");
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		WebElement loginpage=driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
		loginpage.isDisplayed();
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("swaldipti757@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		WebElement loginp=driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		System.out.println(loginp.isDisplayed());
		driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
		
		WebElement delectac=driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']"));
		System.out.println(delectac.isDisplayed());
	
	
	
	
	}
}
