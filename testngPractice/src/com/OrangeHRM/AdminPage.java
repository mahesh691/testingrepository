package com.OrangeHRM;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AdminPage extends BaseTest{

	@Test(priority=1)
	public void admin()  throws InterruptedException {
		Thread.sleep(5000);
		WebElement firstLevelMenu=driver.findElement(By.className("firstLevelMenu"));
		System.out.println("found element");
		Actions act1 = new Actions(driver);
		act1.moveToElement(firstLevelMenu).perform();
		Thread.sleep(10000);

		WebElement um=driver.findElement(By.linkText("User Management"));
		Actions act2 = new Actions(driver);
		act2.moveToElement(um).perform();
		System.out.println("performed");
		WebElement user=driver.findElement(By.linkText("Users"));
		user.click();
		Thread.sleep(10000);
		
		String act_suurl=driver.getCurrentUrl();
		System.out.println("act url of th system user :"+ act_suurl);
		
		String exp_suurl="SystemUsers";
		System.out.println("exp url of th system user :"+exp_suurl);
		
		if(act_suurl.contains(exp_suurl)) {
			System.out.println("successfully opened system user");
		}else {
			System.out.println("failed opened system user");

		}
	}
		@Test(priority=2)
		public void jobTitle() throws InterruptedException {
		

		Thread.sleep(10000);
		WebElement job=driver.findElement(By.id("menu_admin_Job"));
		Actions act3 = new Actions(driver);
		act3.moveToElement(job).perform();
		WebElement jobTitle=driver.findElement(By.linkText("Job Titles"));
		jobTitle.click();
		
		Thread.sleep(5000);
		
		String act_jobtitle=driver.getCurrentUrl();
		System.out.println("act url of th jobtitle :"+ act_jobtitle);
		
		String exp__jobtitle="viewJobTitleList";
		System.out.println("exp url of th jobtitle :"+exp__jobtitle);
		
		if(act_jobtitle.contains(exp__jobtitle)) {
			System.out.println("successfully opened job title list");
		}else {
			System.out.println("failed opened job title list");

		}
		}
		
		
		
		@Test(priority=3)
		public void paygrades() throws InterruptedException {
			
			Thread.sleep(10000);
			WebElement job=driver.findElement(By.id("menu_admin_Job"));
			Actions act3 = new Actions(driver);
			act3.moveToElement(job).perform();
			Thread.sleep(5000);
			driver.findElement(By.id("menu_admin_viewPayGrades")).click();
		}
}
