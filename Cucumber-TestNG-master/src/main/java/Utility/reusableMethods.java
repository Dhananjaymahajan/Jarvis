package Utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Base.DriverManager;

public class reusableMethods {
	public static File file;
	public static FileInputStream fis;
	public static Properties prop;
	public static String path = "src//main//java//getEnvDetails.properties";

	public static String getURL(String Key) throws IOException {
		file = new File(path);
		fis = new FileInputStream(file);
		prop = new Properties();
		prop.load(fis);

		return prop.getProperty(Key);

	}

	public static void switchedToChildWindow() {
		String mainWindowHandle = DriverManager.getDriver().getWindowHandle();

		Set<String> wh = DriverManager.getDriver().getWindowHandles();

		for (String winHandle : wh) {
			if (!wh.equals(mainWindowHandle)) {

				DriverManager.getDriver().switchTo().window(winHandle);
			}
		}

	}

	public static void waitforVisibilityOfElement(WebElement E) {

		WebDriverWait wait = new WebDriverWait(DriverManager.getDriver(), Duration.ofMillis(4000));

		wait.until(ExpectedConditions.visibilityOf(E));
	}

}
