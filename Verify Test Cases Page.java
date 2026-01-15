package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise7 {

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
        
        driver.findElement(By.xpath("//a[contains(text(),'Test Cases')]")).click();
        WebElement testpage=driver.findElement(By.xpath("//b[normalize-space()='Test Cases']"));
        if(testpage.isDisplayed()) {
        	System.out.println("Test case page is display !!!");
        }else {
        	System.out.println("Test case page is not display");
        }
	}

}
