package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Myntra {
  @Test
  public void MyntraTest() throws InterruptedException {
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.myntra.com/");
	  System.out.println("2nd Changes");
	  driver.close();
	  Thread.sleep(4000);
  }
}
