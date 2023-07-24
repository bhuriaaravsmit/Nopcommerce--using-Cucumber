package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage extends Utility {


    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    public RegisterPage() {
        PageFactory.initElements(driver, this);
    }



    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Register')]")
    WebElement RegisterLInk;


    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement RegisterButton;


    public WebElement getFirstNameError() {
        return FirstNameError;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='FirstName-error']")
    WebElement FirstNameError;


    public WebElement getLastNameError() {
        return LastNameError;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='LastName-error']")
    WebElement LastNameError;

    public WebElement getEmailError() {
        return EmailError;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='Email-error']")
    WebElement EmailError;


    @CacheLookup
    @FindBy(xpath = "//input[@id='gender-female']")
    WebElement genderFemale;


    public void clickOnGender(){
        sleep(2000);
        clickOnElement(genderFemale);
        log.info("clicking on gender Field" +genderFemale.toString() );

    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='FirstName']")
    WebElement firstName;


    public void setFirstName(String name)
    {
        sendTextToElement(firstName, name);
        log.info("Entering the firstName" +firstName.toString() );

    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='LastName']")
    WebElement lastName;

    public void setLastName(String name)
    {
        sendTextToElement(lastName, name);
        log.info("Entering the lastName" +lastName.toString() );

    }

    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[1]")
    WebElement day;

    public void selectFromDropDownDay(String day)
    {
        selectByVisibleTextFromDropDown(this.day,day);
    }
    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[2]")
    WebElement month;


    public void selectFromDropDownMonth(String month)
    {
        selectByVisibleTextFromDropDown(this.month,month);
    }


    @CacheLookup
    @FindBy(xpath = "//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/form[1]/div[1]/div[2]/div[4]/div[1]/select[3]")
    WebElement year;


    public void selectFromDropDownYear(String year)
    {
        selectByVisibleTextFromDropDown(this.year,year);
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Email']")
    WebElement email;

    public void setEmail(String email)
    {

        sendTextToElement(this.email, email);
        log.info("Entering the email" +this.email.toString() );

    }


    public WebElement getPasswordRequired() {
        return passwordrequired;
    }


    @CacheLookup
    @FindBy(xpath = "//input[@id='Password']")
    WebElement password;


    public void setPassword(String Password)

    {
        sendTextToElement(this.password, Password);
        log.info("Entering the password" +this.password.toString() );


    }

    @CacheLookup
    @FindBy(xpath = "//input[@id='ConfirmPassword']")
    WebElement confirmPassword;


    public void setConfirmPasswordPassword1(String confirmPassword)

    {
        sendTextToElement(this.confirmPassword, confirmPassword);
        log.info("Entering the confirm password" +this.confirmPassword.toString() );

    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='register-button']")
    WebElement registerButton;


    public void clickOnRegister()

    {
        clickOnElement(registerButton);
        log.info("Clicking on register " +registerButton.toString() );

    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='Password-error']")
    WebElement passwordrequired;

    public WebElement getConfirmPasswordRequired() {
        return confirmPasswordrequired;
    }

    @CacheLookup
    @FindBy(xpath = "//span[@id='ConfirmPassword-error']")
    WebElement confirmPasswordrequired;



    public void clickOnRegisterButton(){

        sleep(2000);
        clickOnElement(RegisterButton);

        log.info("Clicking on register Button " +RegisterButton.toString() );



    }




    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement RegisterText;

    public WebElement getRegisterText() {
        return RegisterText;
    }


    public void clickOnRegisterLink(){
        sleep(2000);
        clickOnElement(RegisterLInk);
        log.info("Clicking on register link " +RegisterLInk.toString() );


    }

    // @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Register')]")
    WebElement verifyregistration;








}
