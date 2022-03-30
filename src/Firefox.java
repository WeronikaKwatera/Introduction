import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Firefox {

	public static void main(String[] args) {
		
		//FirefoxDriver
		
		
		//create Driver object for Firefox Browser
		
		// we will strictly implement methods of webdriver
		//Class name= ChromeDriver, 
		
		//X driver=new X();//
		
		// invoke .exe file first to invoke browsers 
		
		//gecko drivers
		
	System.setProperty("webdriver.ie.driver", "C:\\Users\\spajk\\Desktop\\studia\\IEDriverServer.exe");
				
		WebDriver driver= new InternetExplorerDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
	}
}
