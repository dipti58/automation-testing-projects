package practice2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exercise8 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("http://automationExercise.com");
		driver.manage().window().maximize();
		
		System.out.println(driver.getTitle());
		String txt=driver.getTitle();
		String txt1="Automation Exercise";
        if(txt.equals(txt1)){
        	System.out.println("home page visible!");
        }else {
        	System.out.println("Home page not visible");
        }
        
        driver.findElement(By.xpath("//a[@href='/products']")).click();
        
        WebElement allproduct=driver.findElement(By.xpath("//h2[normalize-space()='All Products']"));
        if(allproduct.isDisplayed()) {
        	System.out.println("All product page visible!");
        }else {
        	System.out.println("All product page is not visible!");
        }
        
        WebElement productlist=driver.findElement(By.xpath("//h2[normalize-space()='Category']"));
        if(productlist.isDisplayed()) {
        	System.out.println("product list is visible!");
        }else {
        	System.out.println("product list is not visible!");
        }
        
        WebElement viewProduct = wait.until(
                ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("(//a[text()='View Product'])[1]")));
               
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", viewProduct);

        // Click using JavaScript
        js.executeScript("arguments[0].click();", viewProduct);
        
        String currentUrl = driver.getCurrentUrl();
        if (currentUrl.contains("product_details")) {
            System.out.println("User is landed on Product Detail page");
        } else {
            System.out.println("User is NOT landed on Product Detail page");
        }
        
        WebElement product = driver.findElement(By.xpath("//div[@class='product-information']/h2"));
        
        
        WebElement productName = driver.findElement(By.xpath("//div[@class='product-information']/h2"));
        System.out.println("Product Name Visible: " + productName.isDisplayed());
        
        // Category
        WebElement category = driver.findElement(By.xpath("//p[contains(text(),'Category')]"));

        System.out.println("Category Visible: " + category.isDisplayed());

        // Price
        WebElement price = driver.findElement(By.xpath("//span[contains(text(),'Rs.')]"));

        System.out.println("Price Visible: " + price.isDisplayed());

        // Availability
        WebElement availability = driver.findElement(By.xpath("//b[text()='Availability:']"));

        System.out.println("Availability Visible: " + availability.isDisplayed());
        
       // Condition
        WebElement condition = driver.findElement(By.xpath("//b[text()='Condition:']"));

        System.out.println("Condition Visible: " + condition.isDisplayed());

        // Brand
        WebElement brand = driver.findElement(By.xpath("//b[text()='Brand:']"));

        System.out.println("Brand Visible: " + brand.isDisplayed());


	}

}
