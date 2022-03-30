import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownListDynamic {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		
		driver.get("https://www.ryanair.com/pl/pl");
		
		driver.findElement(By.xpath("//*[@class='cookie-popup-with-overlay__button']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//input[@id='input-button__departure']")).click();
		Thread.sleep(2000L);
		driver.findElement(By.xpath("//span[@data-id='KRK']")).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//span[@data-id='ALC']")).click();

	}

}
