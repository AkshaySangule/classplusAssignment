import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\new driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techlistic.com/p/selenium-practice-form.html");
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[2]/input")).sendKeys("Akshay");
		driver.findElement(By.xpath("//*[@id=\"post-body-3077692503353518311\"]/div[1]/div/div/h2[2]/div[1]/div/div[5]/input")).sendKeys("Sangule");
		driver.findElement(By.xpath("//*[@id=\"sex-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"exp-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"datepicker\"]")).sendKeys("11-08-1996");
		driver.findElement(By.xpath("//*[@id=\"profession-0\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"profession-1\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"tool-2\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"continents\"]")).click();
		WebElement dropdown = driver.findElement(By.xpath("//*[@id=\"continents\"]"));
		dropdown.findElement(By.xpath("//option[. = 'Asia']")).click();
		((JavascriptExecutor)driver).executeScript("scroll(0,500)");
		driver.findElement(By.xpath("//*[@id=\"photo\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"submit\"]")).click();
	}
}
