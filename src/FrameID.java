import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameID {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Work\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/recaptcha/api2/demo");
		Thread.sleep(10000);
		//int number = findFrameNumber(driver, By.xpath("//*[@id=\"recaptcha-anchor\"]"));
		//driver.switchTo().frame(number);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]")).isDisplayed());

	/*	int number1 = findFrameNumber(driver, By.xpath("//*[@id=\"recaptcha-verify-button\"]"));
		driver.switchTo().frame(number1);
		driver.findElement(By.xpath("//*[@id=\"recaptcha-verify-button\"]")).click();

	}

	public static int findFrameNumber(WebDriver driver, By by) {

		int i;
		int count = driver.findElements(By.tagName("iframe")).size();
		for (i = 1; i < count; i++) {
			driver.switchTo().frame(i);
			int count1 = driver.findElements(by).size();
			if (count1 > 0) {
				driver.findElement(by).click();
				break;
			}
			
			System.out.println("Continue looping");

		}

		driver.switchTo().defaultContent();
		return i;*/
	}

}
