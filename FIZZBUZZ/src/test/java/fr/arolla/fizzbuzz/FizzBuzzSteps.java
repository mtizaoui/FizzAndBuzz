package fr.arolla.fizzbuzz;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class FizzBuzzSteps {

    private FizzAndBuzzAlgo fizzAndBuzzAlgo;
    private String result;

    @Given("^FizzBuzz case$")
    public void fizzbuzzCase() {
        this.fizzAndBuzzAlgo = new FizzAndBuzzAlgo();
    }

    @When("^Number is (\\d+)$")
    public void numberIs(int number) {
        this.result = this.fizzAndBuzzAlgo.apply(number, new StringBuilder(""));
    }

    @Then("^The result is \"([^\"]*)\"$")
    public void theResultIs(String result) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Assert.assertEquals(this.result, result);
    }


}
