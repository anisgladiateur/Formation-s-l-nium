package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigateur {

	public static void main(String[] args) throws InterruptedException {
		// identification ( chemain chrome driver )

		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");

		// ouverture chrome

		WebDriver driver;
		driver = new ChromeDriver();
		// maximiser window
		driver.manage().window().maximize();
		// delete cookies
		driver.manage().deleteAllCookies();
		// ouvrir l'URL facebook
		driver.navigate().to("https://www.facebook.com/?locale=fr_FR");
		Thread.sleep(5000);
		// close facebook
		driver.close();

		WebDriver driver2;
		driver = new ChromeDriver();
		// maximiser window
		driver.manage().window().maximize();
		// ouvrire l'url google

		driver.get("https://www.google.fr/");
		Thread.sleep(1000);
		//driver.close();
		// declaration des variable
		WebElement recherche;
		// idenfication des variabe ( saisie des variables )
		recherche = driver.findElement(By.name("q"));
		//action (calcul )
		recherche.sendKeys("tunisie");
	}

}
