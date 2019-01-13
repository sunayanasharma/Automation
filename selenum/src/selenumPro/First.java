package selenumPro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class First {

	static {
		System.setProperty("webdriver.chrome.driver", "C:\\driver\\chromedriver.exe");
	}
	public static void main(String[] args) { 
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");

}
}