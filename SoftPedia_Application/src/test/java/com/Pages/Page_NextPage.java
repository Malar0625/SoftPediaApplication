package com.Pages;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Page_NextPage 
{
	WebDriver driver;
	//declaration of reference variable and locators with expression
	By nextpage=By.xpath("/html/body/div/div[2]/div[10]/div[9]/div[22]/div[8]/div/a[11]");
	By previouspage=By.xpath("//*[@id=\"sjmp\"]/div[9]/div[22]/div[8]/div/a[1]");
	// code for launch browser
	public void LaunchBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "src\\test\\resources\\Driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://linux.softpedia.com/");
	}
	//code for scrolling nextpage to previous page
	public void Scroll_clicknext()
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(nextpage).click();
		js.executeScript("window.scrollBy(0, document.body.scrollHeight)");	
		driver.findElement(previouspage).click();
	}
	//code for screenshot
	public  void takeSnapShot(String path) throws Exception
	{
		TakesScreenshot scrShot =((TakesScreenshot)driver);
		File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File(path);
        FileUtils.copyFile(SrcFile, DestFile);
	}
	//close the browser
	public void Quit()
	{
		driver.close();
	}
}


