import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class dropdownList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\spajk\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver (); 
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Select s = new Select (driver.findElement(By.xpath("//*[@name='dropdown-class-example']"))); 
	//	s.selectByValue("option2");
		s.selectByIndex(2);
	//	s.selectByVisibleText("Option1");
		
		

	}

}
