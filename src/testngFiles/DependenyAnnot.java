package testngFiles;

import org.testng.annotations.Test;

import java.io.IOException;

public class DependenyAnnot extends TestBase {

	@Test
	public void OpeningBrowser() throws IOException {
		//This opens the Browser
		login();
		System.out.println("Executing opening Browser");
	}

	@Test(dependsOnMethods = {"OpeningBrowser"}, alwaysRun = true)
	public void FlightBooking() {
		System.out.println("Executing Flightbooking");
	}

	@Test(timeOut = 45000)
	public void Timerelated() {
//This opens the Browser
		System.out.println("New Testcase");

	}

	@Test(enabled = false)
	public void Payment() {
//This opens the Browser
		System.out.println("New Testcase");

	}


}
