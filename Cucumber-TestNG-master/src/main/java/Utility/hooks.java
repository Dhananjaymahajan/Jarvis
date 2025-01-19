package Utility;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Base.DriverManager;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	@Before
	public static void setUp() {
System.out.println("In Before");
		DriverManager.setUpDriver();
	}

	@After
	public static void tearDown(Scenario scenario) {
		System.out.println("In After");
		// validate if scenario has failed
		if (scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
			//scenario.attach(screenshot, "image/png", scenario.getName());
			System.out.println(scenario.getName());
		}

		DriverManager.tearDown();
	}
}

