package testngFiles;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Annot2 {

	public WebDriver driver = null;

	@Test
	public void Login() throws IOException {
		Properties prop = new Properties();
		FileInputStream fileInputStream = null;
		fileInputStream = new FileInputStream("/Users/kmieshkov/Projects/IdeaProjects/testng-framework-practice/src/testngFiles/datadriven.properties");
		prop.load(fileInputStream);
		switch (prop.getProperty("browser")) {
			case "firefox":
				WebDriverManager.firefoxdriver().setup();
				driver = new FirefoxDriver();
				break;
			case "chrome":
				WebDriverManager.chromedriver().setup();
				driver = new ChromeDriver();
				break;
			case "edge":
				WebDriverManager.edgedriver().setup();
				driver = new EdgeDriver();
				break;
			default:
				WebDriverManager.safaridriver().setup();
				driver = new SafariDriver();
				break;
		}
		driver.get(prop.getProperty("url"));
	}

	@Test(enabled = false)
	public void software() {
		System.out.println("I am the Test");
	}

	@AfterSuite(enabled = false)
	public void deinstallsoftware() {
		System.out.println("I am the Last");
	}

}
