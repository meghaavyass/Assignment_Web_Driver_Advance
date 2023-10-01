package com.webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableInTableDemo {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\champion\\Desktop\\Automation Tools\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/accessing-nested-table.html");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		String table=driver.findElement(By.xpath("/html/body/center/table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(table);
		Thread.sleep(2000);
		driver.close();
	}

}
