package Steps;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.*;

public class Steps {	
String today;
boolean actualAnswer,expectedAnswer;
@Given("today is Sunday")
public void today_is_sunday() {
    today="Sunday";
    expectedAnswer=false;
}
@When("I ask whether it is friday yet")
public void i_ask_whether_it_is_friday_yet() {	
   actualAnswer=check();
   System.out.println("------------"+actualAnswer);
}
@Then("I should be told {string}")
public void i_should_be_told(String answer) {
	   
	
}
public boolean check(){
	
	return false;
}

}
