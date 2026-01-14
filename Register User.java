package practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exercise1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.navigate().to("http://automationexercise.com");
        
        String actualTitle=driver.getTitle();
        String exectedTitle="Automation Exercise";
        
        if(actualTitle.equals(exectedTitle))
        {
        	System.out.println("Home page is visible");
        }else 
        {
        	System.out.println("Home page is Not visible");
        }
//        driver.quit(); 
        
          WebElement loginbtn=driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
          loginbtn.click();
          
          WebElement newUser=driver.findElement(By.xpath("//h2[normalize-space()='New User Signup!']"));
          
          if(newUser.isDisplayed()) {
        	  System.out.println("New user signup is display");
          }else {
        	  System.out.println("New user singup is not  display");
          }
          
          
          driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Dipt");
          driver.findElement(By.xpath("//input[@data-qa='signup-email']")).sendKeys("swaldipti757@gmail.com");
          driver.findElement(By.xpath("//button[normalize-space()='Signup']")).click();
          
          WebElement acInfo=driver.findElement(By.xpath("//b[normalize-space()='Enter Account Information']"));
          System.out.println( acInfo.isDisplayed());
         
          driver.findElement(By.xpath("//input[@id='id_gender2']")).click(); 
          
          WebElement ele=driver.findElement(By.xpath("//input[@data-qa='name']"));
          ele.clear();
          ele.sendKeys("Lipik");
          driver.findElement(By.id("password")).sendKeys("Test@123");
        
           WebElement drpDays=driver.findElement(By.xpath("//select[@id='days']"));
 		   Select selectDays=new Select(driver.findElement(By.id("days")));
 		   selectDays.selectByVisibleText("8");
 		 
 		   Select month = new Select(driver.findElement(By.id("months")));
           month.selectByVisibleText("May");
           
           Select year = new Select(driver.findElement(By.id("years")));
           year.selectByVisibleText("1999");
           
           driver.findElement(By.xpath("//input[@id='newsletter']")).click();
           driver.findElement(By.xpath("//input[@id='optin']")).click();
           
           driver.findElement(By.xpath("//input[@id='first_name']")).sendKeys("Lipi");
           driver.findElement(By.xpath("//input[@id='last_name']")).sendKeys("Biswal");
           driver.findElement(By.xpath("//input[@id='company']")).sendKeys("XYZ");
           driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("Redhakhol,sambalpur,XYZ");
           driver.findElement(By.xpath("//input[@id='address2']")).sendKeys("Naktidual");
           
           WebElement country=driver.findElement(By.xpath("//select[@id='country']"));
           Select countryName=new Select(driver.findElement(By.id("country")));
           countryName.selectByVisibleText("Canada");
           driver.findElement(By.xpath("//input[@id='state']")).sendKeys("Odisha");
           driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Sambalpur");
           driver.findElement(By.xpath("//input[@id='zipcode']")).sendKeys("768109");
           driver.findElement(By.xpath("//input[@id='mobile_number']")).sendKeys("8018135453");
           driver.findElement(By.xpath("//button[@data-qa='create-account']")).click();
           
           
           WebElement create_ac= driver.findElement(By.xpath("//b[normalize-space()='Account Created!']"));
           System.out.println(create_ac.isDisplayed());
           
           driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
           WebElement username=driver.findElement(By.xpath("//li[10]//a[1]"));
           System.out.println(username.isDisplayed());
//           driver.findElement(By.xpath("//a[normalize-space()='Delete Account']")).click();
//           boolean deleteAc= driver.findElement(By.xpath("//b[normalize-space()='Account Deleted!']")).isDisplayed();
//           driver.findElement(By.xpath("//a[normalize-space()='Continue']")).click();
           
           driver.quit(); 
           
           
           
	}
}