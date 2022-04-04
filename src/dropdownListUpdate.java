import java.util.stream.IntStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownListUpdate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		
		driver.get("https://www.aircanada.com/us/en/aco/home.html");
		Thread.sleep(4000L);
		driver.findElement(By.id("bkmgFlights_selectTravelers")).click();
		Thread.sleep(3000L);
		
		
//		IntStream.of(5).forEach(i -> {
//			
//			driver.findElement(By.id("bkmgFlights_selectTravelers_addTraveler_ADT")).click();
//			Thread.sleep(2000L);
			
//		});
		
		for(int i = 0; i <5; i++) {
		
		driver.findElement(By.id("bkmgFlights_selectTravelers_addTraveler_ADT")).click();		
		Thread.sleep(2000L);
		
		}
		
		
		driver.findElement(By.xpath("//*[@class='abc-button-fullWidthXS abc-button-wrapper']")).click();;

	}

}
