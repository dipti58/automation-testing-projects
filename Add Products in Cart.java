package practice2;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Exercise12 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		   driver.get("http://automationexercise.com");
		   
		   driver.manage().window().maximize();
		   
		   System.out.println(driver.getTitle());
	        String exptitle="Automation Exercise";
	        String actualtitle=driver.getTitle();
	        
	        if(exptitle.equals(actualtitle)) {
	        	System.out.println("it is home page");
	        }
	        else {
	        	System.out.println("it is not home page");
	        }
	        
	        driver.findElement(By.xpath("//a[@href='/products']")).click();

	        Actions act = new Actions(driver);
	        WebElement firstProduct = driver.findElement(
	                By.xpath("(//div[@class='product-image-wrapper'])[1]")
	        );

	        act.moveToElement(firstProduct).perform();

	        firstProduct.findElement(
	                By.xpath(".//a[contains(text(),'Add to cart')]")
	        ).click();
            
	        WebElement secondProduct = driver.findElement(By.xpath("(//div[@class='product-image-wrapper'])[2]"));
	        act.moveToElement(secondProduct).perform();

	        driver.findElement(By.xpath("(//a[contains(text(),'Add to cart')])[2]")).click();

	        
	        driver.findElement(By.xpath("//a[@href='/view_cart']")).click();

	        
	        List<WebElement> cartItems = driver.findElements(By.xpath("//tr[contains(@id,'product-')]"));
	        if (cartItems.size() == 2) {
	            System.out.println("Both products are added to cart");
	        } else {
	            System.out.println("Products count mismatch in cart");
	        }

	        
	        for (int i = 1; i <= cartItems.size(); i++) {

	            String price = driver.findElement(By.xpath("(//td[@class='cart_price'])[" + i + "]")).getText();
	            String quantity = driver.findElement(By.xpath("(//td[@class='cart_quantity'])[" + i + "]")).getText();
	            String total = driver.findElement(By.xpath("(//td[@class='cart_total'])[" + i + "]")).getText();

	            System.out.println("Product " + i + " Price: " + price);
	            System.out.println("Product " + i + " Quantity: " + quantity);
	            System.out.println("Product " + i + " Total: " + total);
	        }

	        // Close browser
	        driver.quit();
	    }
	
	}

