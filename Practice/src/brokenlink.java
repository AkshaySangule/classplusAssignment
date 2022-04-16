import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class brokenlink {
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Driver\\new driver\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size());
		for(int i=0; i<links.size();i++)
		{
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link=new URL(url);
			HttpURLConnection httpcon =(HttpURLConnection) link.openConnection();	
			httpcon.connect();
			int rescode = httpcon.getResponseCode();
		if(rescode>=400)
		{
			System.out.println(url +" -"+ "is broken link");
		}
		else
		{
			System.out.println(url +" -"+"is valid link");
		}
		}
		
		
		
	}

}
