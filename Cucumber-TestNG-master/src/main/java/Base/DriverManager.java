package Base;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {

	private static WebDriver driver;
	public final static int TIMEOUT = 10;

	@SuppressWarnings("deprecation")
	private DriverManager() throws IOException {

		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);

	}

	public static void openPage(String loginURL) throws IOException {

		driver.get(Utility.reusableMethods.getURL(loginURL));
		driver.manage().window().maximize();
	}

	public static WebDriver getDriver() {
		return setUpDriver();
	}

	public static WebDriver setUpDriver() {

		if (driver == null) {
			
			driver = new ChromeDriver();
			System.out.println("Initilising new Driver");
			return driver;
		} else
			return driver;
	}

	public static void tearDown() {

		if (driver != null) {
			driver.close();
			driver.quit();
		}

		driver = null;
	}
}
