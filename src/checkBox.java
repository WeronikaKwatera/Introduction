import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class checkBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		driver.get("https://www.ryanair.com/pl/pl");
		
		Thread.sleep(5000L);
		driver.manage().deleteAllCookies();
		//driver.findElement(By.xpath("//icon[@xpath='1']")).click();;

	}

}
