package org.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepAdactin {


WebDriver driver;

@Given("user is in adactin home page")
public void user_is_in_adactin_home_page() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\eclipse-workspace\\AdactinPage\\driver\\chromedriver1.exe");
    driver = new ChromeDriver();
    driver.get("https://adactin.com/HotelApp/");
    driver.manage().window().maximize();
    
}

@When("user enter {string} and {string}")
public void user_enter_and(String string, String string2) {
    WebElement name = driver.findElement(By.xpath("//input[@type='text']"));
    name.sendKeys(string);
    WebElement pwd = driver.findElement(By.xpath("//input[@type='password']"));
    pwd.sendKeys(string2);
    WebElement btn = driver.findElement(By.xpath("//input[@type='Submit']"));
    btn.click();
}

@When("user fill the {string},{string}, {string},{string},{string},{string},{string},{string}")
public void user_fill_the(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) throws InterruptedException {
   WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
   location.click();
   Select SL = new Select(location);
   SL.selectByVisibleText(s1);
   
   WebElement hotel = driver.findElement(By.xpath("//select[@name='hotels']"));
   hotel.click();
   Select SH =new Select(hotel);
   SH.selectByVisibleText(s2);
   
   WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
   roomtype.click();
   Select SRT = new Select(roomtype);
   SRT.selectByVisibleText(s3);
   
   WebElement Numroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
   Numroom.click();
   Select NR =new Select(Numroom);
   NR.selectByVisibleText(s4);
   
   WebElement cin = driver.findElement(By.xpath("//input[@name='datepick_in']"));
   cin.sendKeys(s5);
   WebElement cout = driver.findElement(By.xpath("//input[@name='datepick_out']"));
   cout.sendKeys(s6);
   
   
   WebElement adult = driver.findElement(By.id("adult_room"));
   adult.click();
   Select adul =new Select(adult);
   adul.selectByVisibleText(s7);
   Thread.sleep(2000);
   
   WebElement child = driver.findElement(By.id("child_room"));
   child.click();
   Select ch =new Select(child);
   ch.selectByVisibleText(s8);
   
   
   WebElement submit = driver.findElement(By.xpath("//input[@name='Submit']"));
   submit.click();
}

@When("user enters the {string}, {string},{string}, {string}, {string},{string},{string}, {string}")
public void user_enters_the(String s1, String s2, String s3, String s4, String s5, String s6, String s7, String s8) throws InterruptedException {
    
	WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	radio.click();
	
	WebElement ctne = driver.findElement(By.id("continue"));
	ctne.click();
	
	WebElement fn = driver.findElement(By.xpath("//input[@name='first_name']"));
	fn.sendKeys(s1);
	
	WebElement ln = driver.findElement(By.xpath("//input[@name='last_name']"));
	ln.sendKeys(s2);
	
	WebElement add = driver.findElement(By.xpath("//textarea[@name='address']"));
	add.sendKeys(s3);
	
	WebElement crdnum = driver.findElement(By.xpath("//input[@name='cc_num']"));
	crdnum.sendKeys(s4);
	
	WebElement cctype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	cctype.click();
	Select ct =new Select(cctype);
	ct.selectByVisibleText(s5);	
	
	WebElement mon = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	mon.click();
	Select m =new Select(mon);
	m.selectByVisibleText(s6);
	
	WebElement yr = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	yr.click();
	Select y = new Select(yr);
	y.selectByVisibleText(s7);
	
	WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	cvv.sendKeys(s8);
	
	WebElement Bnow = driver.findElement(By.id("book_now"));
	Bnow.click();
	Thread.sleep(5000);
	WebElement orderno = driver.findElement(By.xpath("//input[@name='order_no']"));
	String ornum = orderno.getAttribute("value");


}

@Then("user get the Booking Order Number")
public void user_get_the_Booking_Order_Number() {
   String url = driver.getCurrentUrl();
   boolean b = url.contains("BookingConfirm");
   Assert.assertTrue("verify the url",b);
   
}


}
