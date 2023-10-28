package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droganddrop {

	public static void main(String[] args) throws InterruptedException {
		// chemain chrom
		System.setProperty("webdriver.chrome.driver", "src/test/ressources/chromedriver.exe");
		// ouverture du navigateur
		WebDriver driver =new ChromeDriver();
        //maximiser widous
		driver.manage().window().maximize();
		//delet cookckis
		driver.manage().deleteAllCookies();
		//ouvrire l'url
		driver.navigate().to("https://demoqa.com/droppable");
		Thread.sleep(5000);
		// identification et declaration des variable
		WebElement dragme;
		WebElement drophere; 
		
		dragme= driver.findElement(By.id("draggable"));
		drophere = driver.findElement(By.id ("droppable"));
		
		// action
		Actions action = new Actions(driver);
		action.dragAndDrop(dragme, drophere).perform();
		// verification
		WebElement message;
		
	}

}
