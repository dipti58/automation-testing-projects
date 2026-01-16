package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise10 {

	public static void main(String[] args) {
	   WebDriver driver=new ChromeDriver();
	   driver.get("http://automationexercise.com");
	   
	   driver.manage().window().maximize();
	   
	   
	   System.out.println(driver.getTitle());
	   String currentpage=driver.getTitle();
	   String actualpage="Automation Exercise";
	   if(currentpage.equals(actualpage)) {
		   System.out.println("it is home page");
	   }
	   else{
		   System.out.println("it is not home page");
	   }
	   
	   
	   //scrolling the page in footer
	   WebElement footer=driver.findElement(By.tagName("footer"));
	   JavascriptExecutor js= (JavascriptExecutor)driver;
	   js.executeScript("arguments[0].scrollIntoView(true);",footer);
	   
	   
	   WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Subscription']"));
	   if(ele.isDisplayed()) {
		   System.out.println("the element of subscription is display");
	   }
	   else {
		   System.out.println("the element of subscription is not display");
	   }
	   
	   driver.findElement(By.xpath("//input[@id='susbscribe_email']")).sendKeys("biswal@123");
	   driver.findElement(By.xpath("//i[@class='fa fa-arrow-circle-o-right']")).click();
	   
	   WebElement successmsg=driver.findElement(By.xpath("//div[@class='alert-success alert']"));
	   
	   if(successmsg.isDisplayed()) {
		   System.out.println(successmsg.getText());
	   }
	}

}
