package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise6 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationExercise.com");
		System.out.println(driver.getTitle());
        
		String actualtitle=driver.getTitle();
		String expectedtitle="Automation Exercise";
		
		if(actualtitle.equals(expectedtitle)) {
			System.out.println("home page is visible");
		}else {
			System.out.println("home page is not visible");
		}
		
		driver.findElement(By.xpath("//a[normalize-space()='Contact us']")).click();
		WebElement contactus=driver.findElement(By.xpath("//div[@class='col-sm-12']//h2[@class='title text-center']"));
		if(contactus.isDisplayed()) {
			System.out.println("Contact us page is display");
		}else {
			System.out.println("Contact us page is not display");
		}
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dipti Biswal");
		driver.findElement(By.xpath("//input[@placeholder='Email']")).sendKeys("biswaldipti@123");
		driver.findElement(By.xpath("//input[@placeholder='Subject']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("i want indepth knowledge in this subject");
		driver.findElement(By.xpath("//input[@name='upload_file']")).sendKeys("C:\\interviewQ\\Git Cheat sheet.pdf");
		
		driver.findElement(By.name("submit")).click();
		
		driver.switchTo().alert().accept();
		
	}
	

}
