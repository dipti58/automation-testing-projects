package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise13 {

	private static final Object Expextedqut = null;

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://automationexercise.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		String homepage="Automation Exercise";
		String actualpage=driver.getTitle();
		if(homepage.equals(actualpage)) {
			System.out.println("home page is display");
		}else {
			System.out.println("home page is not display");
		}
		
//		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//div[2]//div[1]//div[2]//ul[1]//li[1]//a[1]")).click();
		driver.findElement(By.xpath("//div[@class='col-sm-9 padding-right']//a[1]")).click();
		 
		
		WebElement prodetails=driver.findElement(By.xpath("//div[@class='product-information']"));
		if(prodetails.isDisplayed()) {
			System.out.println("product details page is opened successfully");
		}
		else {
			System.out.println("product details page is not opened");
		}
		
		WebElement quantity=driver.findElement(By.id("quantity"));
		quantity.clear();
		quantity.sendKeys("4");
		
		driver.findElement(By.xpath("//button[contains(@class,'cart')]")).click();

		// Wait and click View Cart
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement viewCart = wait.until(
		        ExpectedConditions.elementToBeClickable(
		                By.xpath("//u[text()='View Cart']")
		        )
		);
		viewCart.click();
		
		
		// 9. Verify product is displayed in cart page with exact quantity
		WebElement cartQuantity = driver.findElement(By.xpath("//td[@class='cart_quantity']//button"));

		String actualQuantity = cartQuantity.getText();
		String expectedQuantity = "4";

		if (actualQuantity.equals(expectedQuantity)) {
		    System.out.println("Product quantity is correctly displayed as 4 in cart");
		} else {
		    System.out.println("Quantity mismatch! Expected: 4 but Found: " + actualQuantity);
		}

	}

}
