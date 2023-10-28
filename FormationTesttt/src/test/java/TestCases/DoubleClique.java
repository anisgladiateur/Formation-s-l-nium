package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClique {

	public static void main(String[] args) throws InterruptedException {
		// chemain chromdriver
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
        //ouverture chrome
		WebDriver driver;
		driver=new ChromeDriver();
       // Maximiser windous
		driver.manage().window().maximize();
		//delete cookies
		driver.manage().deleteAllCookies();
		//ouverture de l'URL
		driver.get("https://www.poste.tn/");
		Thread.sleep(5000);
		//delaration & idetification
		WebElement DoubleBtn;
		DoubleBtn = driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/table/tbody/tr[2]/td[1]/table/tbody/tr[3]/td/table[1]/tbody/tr[3]/td[3]/table/tbody/tr[3]/td/table/tbody/tr[1]/td[3]/a"));
		//action double click
		Actions action =new Actions(driver);
		action.doubleClick(DoubleBtn).perform();
	}
	

}
