package PracticeProject.SeleniumPracticeProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImages {
	public static void isImageBroken(WebElement singleImage) {
		if (singleImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println(singleImage.getAttribute("outerHTML") + " is broken.");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement brokenImage = driver.findElement(By.xpath("//a[text()='Broken Images']"));
		brokenImage.click();

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("No. of images are: " + images.size());

		for (WebElement singleImage : images) {

			isImageBroken(singleImage);

		}

	}

}
