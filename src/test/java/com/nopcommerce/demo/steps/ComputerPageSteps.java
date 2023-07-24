package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DesktopPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ComputerPageSteps {

    @When("I am on ComputerPage")
    public void iAmOnComputerPage() {


    }


    @And("I click on Computer Tab")
    public void iClickOnComputerTab() {
        new ComputerPage().clickOnComputer();

    }

    @Then("Verify the Computer Text {string}")
    public void verifyTheComputerText(String computer) {

        Assert.assertEquals(new ComputerPage().getComputerText().getText(), computer);
    }



    @And("I click on Desktops link")
    public void iClickOnDesktopsLink() {

        new DesktopPage().clickOnDesktop();
    }

    @Then("Verify the Desktops text {string}")
    public void verifyTheDesktopsText(String desktops) {

        Assert.assertEquals(new DesktopPage().getDesktops().getText(),desktops);

    }


    @And("I select os{string}")
    public void iSelectOs(String os) {
     new DesktopPage().clickOnOS(os);
    }

    @And("I select software{string}")
    public void iSelectSoftware(String software) {
        new DesktopPage().clickOnSoftware(software);
    }



    @Then("Verify message {string}")
    public void verifyMessage(String arg0) {
    }


    @And("I click on Product")
    public void iClickOnProduct() {
        new DesktopPage().clickOnProductName();
    }



    @And("I select ProcessRam {string} {string}")
    public void iSelectProcessRam(String processor, String ram) {

        new DesktopPage().selectProcessorFromDropDown(processor,ram);
    }


    @And("I click on addToCart Button")
    public void iClickOnAddToCartButton() {
        new DesktopPage().clickOnAddToCart();
    }

    @And("I select hdd {string}")
    public void iSelectHdd(String hdd) {
        new DesktopPage().clickOnHDD(hdd);
    }
}
