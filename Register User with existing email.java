package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		System.out.println(driver.getTitle());
		
		String currentele=driver.getTitle();
		String actualele="Automation Exercise";
		
		if(currentele.equals(actualele)) {
			System.out.println("home page is display successsfully");
	}else {
		System.out.println("home page is not display successsfully");
	}
		
		driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
		
		WebElement loginpage=driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
		if(loginpage.isDisplayed()) {
		System.out.println("login page is visible ");
		}else {
			System.out.println("login page is not visible");
		}
		
		driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("swaldipti757@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("Test@123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
		
		WebElement loggedpage=driver.findElement(By.xpath("//li[10]//a[1]"));
		if(loggedpage.isDisplayed()) {
		System.out.println("logged in as username is visible");
		}else {
			System.out.println("logged in as username is not visible");
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		
		System.out.println(driver.getTitle());
		
		String actualresult=driver.getTitle();
		String expectedresult="Automation Exercise - Signup / Login";
		
		if(actualresult.equals(expectedresult)) {
			System.out.println("login page is visible after logout");
		}else {
			System.out.println("login page is not visible after logout");
		}
		
		
	}
}

