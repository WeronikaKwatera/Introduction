import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Salesforce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//selenium code 
		
		//create Driver object for chrome Browser
		
		// we will strictly implement methods of webdriver
		//Class name= ChromeDriver, 
		
		//X driver=new X();//
		
		// invoke .exe file first to invoke browsers 
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
//		
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://login.salesforce.com/");
      //  driver.findElement(By.id("username")).sendKeys("Hello");
       // driver.findElement(By.id("password")).sendKeys("123");
//        driver.findElement(By.xpath("//*[@id='Login']")).click();
       // driver.findElement(By.cssSelector("#Login")).click();
        //System.out.println(driver.findElement(By.cssSelector("#error")).getText());
        
        

        driver.findElement(By.cssSelector("input#username")).sendKeys("mika");
        driver.findElement(By.xpath("//input[@name='Login']")).click();
        

        
        
        
	}

}
