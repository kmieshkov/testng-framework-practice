package testngFiles;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.Properties;

public class Annot2 {


	@BeforeSuite
	public void Login() {
		Properties prop = new Properties();
		System.out.println("Username");
	}

	@Test
	public void software() {
		System.out.println("I am the Test");
	}

	@AfterSuite
	public void deinstallsoftware() {
		System.out.println("I am the Last");
	}

}
