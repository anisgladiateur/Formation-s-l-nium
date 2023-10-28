package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListeDéroulante {

	public static void main(String[] args) throws InterruptedException {
		
    //identification ( chemain chrom driver )
		
	System.setProperty("webdriver.chrome.driver" , "src/test/ressources/chromedriver.exe");
	
    //ouverture de navigateur 
	
    WebDriver driver = new ChromeDriver();
    
    // maximiser url
    
    driver.manage().window().maximize();
    
    //delete cokocies
    
    driver.manage().deleteAllCookies();
    
    // ouverture de URL
    
    driver.navigate().to("https://www.poste.tn/");
    
    Thread.sleep(5000);
    
     //declaration et identification deselement
    
    WebElement couleur =driver.findElement(By.id("menuderoul"));
    
     //select
    
    Select select = new Select(couleur);
    select.selectByValue("http://www.e-fleurs.poste.tn");
    
    // close 
    
    driver.close();
    
    
	}

}
