import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
		
        WebDriver driver= new ChromeDriver();
        
        ChromeOptions options = new ChromeOptions();

        
        driver.get("http://facebook.com");
        driver.findElement(By.xpath("//button[@title='Zezwól na wszystkie pliki cookie']")).click();
//        driver.wait();
        
        //tagName[@atribiute='value'] - Xpath selector

        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("Weronika");
        driver.findElement(By.xpath("//*[@name='pass']")).sendKeys("1234556");
        driver.findElement(By.xpath("//button[@name='login']")).click();
        
        // tagName[atribiute='value] - CSS selector
        
//        driver.findElement(By.cssSelector("input[name='email]")).sendKeys("CSSselector");

	}

}
