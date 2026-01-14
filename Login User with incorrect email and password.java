package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationExercise.com");
		System.out.println(driver.getTitle());
		
		String txt=driver.getTitle();
		String txt1="Automation Exercise";
        if(txt.equals(txt1)){
        	System.out.println("home page visible!");
        }else {
        	System.out.println("Home page not visible");
        }
        
        driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']")).click();
        WebElement loginpage=driver.findElement(By.xpath("//h2[normalize-space()='Login to your account']"));
        loginpage.isDisplayed();
        driver.findElement(By.xpath("//input[@data-qa='login-email']")).sendKeys("lipi@123");
        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("d123A");
        driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
        WebElement verifyep=driver.findElement(By.xpath("//p[normalize-space()='Your email or password is incorrect!']"));
        System.out.println(verifyep.isDisplayed());
	}

}
