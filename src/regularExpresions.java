import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class regularExpresions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
	
        WebDriver driver= new ChromeDriver();
        
        driver.get("https://www.rediff.com/");
        driver.findElement(By.cssSelector("a.signin")).click(); // check why regular expression doesn't work for CSS selector (normal CSS used instead of regular)
        driver.findElement(By.xpath("//input[@name='login']")).sendKeys("hello");
        driver.findElement(By.cssSelector("input#password")).sendKeys("godd");
        driver.findElement(By.cssSelector("input.signinbtn")).click(); // check why regular expressions doesn't work 

	}

}
