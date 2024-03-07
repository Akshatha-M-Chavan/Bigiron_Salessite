package Goavega;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignIn_EquipmentAuction {

	public static void main(String[] args) {

		String Username = "superuser";
		String Password = "Superuser@123";
		String AuctionTitle = "Auto Equipment Auction3";
		String CRM_Title = AuctionTitle;

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		// Login to sales Site:
		driver.get("https://salesdemo.bigiron.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='SignInUserName']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@id='SignInPassword']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@class='btn btn-primary form-primary']")).click();
		System.out.println(driver.getTitle());

		// Creating EquipmentAuction ,Consignment ,Lot

	   driver.findElement(By.xpath("//button[@class='btn btn-primary modal-primary']")).click();
		driver.findElement(By.xpath("(//span[@onclick='menu.toggle(this)'])[1]")).click();

		/*driver.findElement(By.xpath("//a[contains(text(),'Auctions')]")).click();

		driver.findElement(By.cssSelector(".fa.fa-lg.fa-plus")).click();

		// Creation of Auction:
		driver.findElement(By.linkText("Create Auction")).click();

		driver.findElement(By.xpath("//input[@name='Title']")).sendKeys(AuctionTitle);

		driver.findElement(By.cssSelector(".btn.btn-primary.form-primary")).click();

		driver.findElement(By.xpath("//span[contains(text(),'Office')]")).click();

		WebElement SubsidiaryCompany = driver.findElement(By.xpath("//select[@data-bind='value: SubsidiaryCompany']"));

		Select Staticdropdown = new Select(SubsidiaryCompany);
		Staticdropdown.selectByVisibleText("BigIron Auctions");
		System.out.println(Staticdropdown.getFirstSelectedOption().getText());

		driver.findElement(By.xpath("//span[contains(text(),'Auction')]")).click();

		driver.findElement(By.xpath("//input[@placeholder='CRM Title']")).sendKeys(CRM_Title);

		driver.findElement(By.xpath("//button[@onclick='auctions.update()']")).click();*/

		// Creation Of Listing:

		driver.findElement(By.xpath("//div[@class='btn-group hidden-print open']//i[@class='fa fa-cog fa-lg']"))
				.click();

		driver.findElement(By.linkText("Listings")).click();
		
		driver.findElement(By.cssSelector(".fa.fa-lg.fa-plus")).click();
		
		driver.findElement(By.linkText("Create Listing")).click();
		
		driver.findElement(By.xpath("//span[@id='select2-chosen-4']")).click();
		  
	    WebElement wb = driver.findElement(By.xpath("//input[@id='s2id_autogen4_search']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(wb).click().moveToElement(wb,200, 0).sendKeys(AuctionTitle).build().perform();

	}

}
