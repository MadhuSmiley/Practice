
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Firstone {

	public static void main(String[] args) {
		//Invoking browser
		//ChromeDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.chrome.driver", "/Users/madha/Documents/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver= new ChromeDriver();
		driver.get("www.google.com");
		System.out.println("Good morning sis");
	}

}
