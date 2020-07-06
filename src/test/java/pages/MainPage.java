package pages;

import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.PublicKey;

@DefaultUrl("https://twitter.com/explore")

public class MainPage extends BasePage {

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "a[data-testid= 'signup']")
    private WebElement signUpButton;

    @FindBy(css = "[name='name']")
    private WebElement nameField;

    @FindBy(css = "[class='css-18t94o4 css-901oao r-1n1174f r-1qd0xha r-a023e6 r-16dba41 r-ad9z0x " +
            "r-19h5ruw r-bcqeeo r-qvutc0']")
    private WebElement useEmailButton;

    @FindBy(css = "[name='email']")
    private WebElement emailField;

    @FindBy(css = "[class='css-1dbjc4n r-1uaug3w r-cyik6v r-wgabs5 r-1jkafct r-1yadl64 r-16xksha r-zso239 r-utggzx']")
    private WebElement monthDropdown;

    @FindBy(css = "[aria-label='Месяц']")
    private WebElement subjectMonth;

    @FindBy(css = "[class='css-1dbjc4n r-1uaug3w r-cyik6v r-wgabs5 r-1jkafct r-1yadl64 r-16y2uox r-zso239 r-utggzx']")
    private WebElement dayDropdown;

    @FindBy(css = "[aria-label='День']")
    private WebElement subjectDay;

    @FindBy(css = "[class='css-1dbjc4n r-1uaug3w r-cyik6v r-wgabs5 r-1jkafct r-1yadl64 r-16y2uox r-utggzx']")
    private WebElement yearDropdown;

    @FindBy(css = "[aria-label='Год']")
    private WebElement subjectYear;

    @FindBy(css = "[class='css-18t94o4 css-1dbjc4n r-urgr8i r-42olwf r-sdzlij " +
            "r-1phboty r-rs99b7 r-1w2pmg r-1vsu8ta r-aj3cln r-1ny4l3l r-1fneopy r-o7ynqc r-6416eg r-lrvibr']")
    private WebElement proceedButton;

    @FindBy(css = "[name='birthday']")
    private WebElement birthdayField;

    public void openMainPage() {
        open();
    }

    public void clickOnSignUpButton(){
        element(signUpButton).click();
    }

    public void fillNameField(String name){
        element(nameField).sendKeys(name);
    }

    public void clickOnUseEmailButton(){
        element(useEmailButton).click();
    }

    public void fillEmailField(String email){
        element(emailField).sendKeys(email);
    }

    public void selectBirthMonth(String month){
        element(monthDropdown).click();
        selectFromDropdown(subjectMonth, month);
    }

    public void selectBirthDay(String day){
        element(dayDropdown).click();
        selectFromDropdown(subjectDay, day);
    }

    public void selectBirthYear(String year){
        element(yearDropdown).click();
        selectFromDropdown(subjectYear, year);
    }

    public void clickProceedButton(){
        element(proceedButton).click();
    }

    public void checkName(String name){
        Assert.assertEquals(element(nameField).getValue(), name);
    }

    public void checkEmail(String email){
        Assert.assertEquals(element(emailField).getValue(), email);
    }

    public void checkBirthday(String birthday){
        Assert.assertEquals(element(birthdayField).getValue(), birthday);
    }





}
