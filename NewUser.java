package payTabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class NewUser {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[1]")).click();
		driver.findElement(By.xpath("(//div[@role='option']//span)[1]")).click();
		driver.findElement(By.xpath("(//div[@class='oxd-select-text oxd-select-text--active'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='Enabled']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys("g");
		driver.findElement(By.xpath("//span[contains(text(),'Goutam')]")).click();
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[1]")).sendKeys("Karthigopi");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[2]")).sendKeys("Like&share33");
		driver.findElement(By.xpath("(//input[@autocomplete='off'])[3]")).sendKeys("Like&share33");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Karthigopi");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Like&share33");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		
	}

}
