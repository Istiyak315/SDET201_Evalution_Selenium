package StepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class steps {
	
	WebDriver driver;
	
	
	@Given("user is landed on MakeMyTrip home page")
	public void user_is_landed_on_make_my_trip_home_page() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(3000);
		
		driver.manage().window().maximize();
		
		
	}

	@When("user enters location {string}, dates {string} to {string}, room {string}, adults {string} and applies, price per night max {int}")
	public void user_enters_location_dates_to_room_adults_and_applies_price_per_night_max(String string, String string2, String string3, String string4, String string5, Integer int1) throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(4000);
		driver.findElement(By.linkText("Hotels")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Where do you want to stay?']")).sendKeys("Munnar");
//		driver.findElement(By.id("checkin")).click();
//		   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[1]")).click();
//		   driver.findElement(By.xpath("//div[@class='DayPicker-wrapper']//div[1]//div[3]//div[5]//div[4]")).click();
//		   driver.findElement(By.xpath("//button[normalize-space()='Apply']")).click();
//		   driver.findElement(By.xpath("//span[normalize-space()='Price per Night']")).click();
//		   driver.findElement(By.xpath("//li[contains(text(),'₹2500-₹5000')]")).click();
//		
		
	}

	@Then("validate that the result page")
	public void validate_that_the_result_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	}

	@Then("validate payment page")
	public void validate_payment_page() {
	    // Write code here that turns the phrase above into concrete actions
	    
	    
	}

	@Then("validate hotel name")
	public void validate_hotel_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("validate booking dates")
	public void validate_booking_dates() {
	    // Write code here that turns the phrase above into concrete actions
	   

	}


}
