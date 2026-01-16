package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise9 {

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
        
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        
        WebElement allproduct=driver.findElement(By.xpath("//h2[normalize-space()='All Products']"));
        if(allproduct.isDisplayed()) {
        	System.out.println("All product page visible!");
        }else {
        	System.out.println("All product page is not visible!");
        }
        
        
       WebElement search=driver.findElement(By.xpath("//input[@id='search_product']"));
       search.sendKeys("Blue Top");
       search.findElement(By.xpath("//i[@class='fa fa-search']")).click();
       
	}

}
