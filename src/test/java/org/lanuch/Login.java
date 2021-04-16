package org.lanuch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Login extends BasicClass {


@Given("user have login the page")
public void user_have_login_the_page() {
	launchBrowser();
	loadUrl("https://www.volaris.com/");
//	jsSendkeys(By.xpath("//span[@class='mat-button-wrapper']"), null)
	
}

@When("user enter the username and password")
public void user_enter_the_username_and_password() {
	
	driver.findElement(By.xpath("//div[text()='Change flight']")).click();
	driver.findElement(By.xpath("//input[@id='mat-input-9']")).sendKeys("Java@1234");
	driver.findElement(By.xpath("//input[@id='mat-input-10']")).sendKeys("111234");
}

@When("user click the robot button")
public void user_click_the_robot_button() {
	toClick((WebElement) By.xpath("//div[@role='presentation']"));
}

@Then("user click the access")
public void user_click_the_access() {
	toClick(driver.findElement(By.xpath("//button[@color='primary']")));
}

}