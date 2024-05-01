import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		String URL = "https://www.saucedemo.com/";
		System.out.println("Browser Invocation!!");
		//Invoking the browser
		//Launching Chrome browser
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Harish Yemireddy\\Testing\\Selenium\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		
		//Lauching FireFox browser
		//moSystem.setProperty("webdriver.gecko.driver","C:\\Users\\Harish Yemireddy\\Testing\\Selenium\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		
		//Launching Microsoft Edge browser
		//System.setProperty("webdriver.edge.driver", "C:\\Users\\Harish Yemireddy\\Testing\\Selenium\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		driver.get(URL);
		System.out.println(URL);
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Landing Page: " + driver.getCurrentUrl());	
		driver.close();
	}

}
