package steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;
import pages.MainPage;

public class MainSteps extends ScenarioSteps {

    private MainPage onPage;

    @Step
    public void openMainPage() {
        onPage.openMainPage();
    }

    @Step
    public void clickOnSignUpButton(){
        onPage.clickOnSignUpButton();
    }

    @Step
    public void fillNameField(String name){
        onPage.fillNameField(name);
    }

    @Step
    public void clickOnUseEmailButton(){
        onPage.clickOnUseEmailButton();
    }

    @Step
    public void fillEmailField(String email){
        onPage.fillEmailField(email);
    }

    @Step
    public void selectBirthMonth(String month){
        onPage.selectBirthMonth(month);
    }

    @Step
    public void selectBirthDay(String day){
        onPage.selectBirthDay(day);
    }

    @Step
    public void selectBirthYear(String year){
        onPage.selectBirthYear(year);
    }

    @Step
    public void clickProceedButton(){
        onPage.clickProceedButton();
    }

    @Step
    public void checkName(String name){
        onPage.checkName(name);
    }

    @Step
    public void checkEmail(String email){
        onPage.checkEmail(email);
    }

    @Step
    public void checkBirthday(String birthday){
        onPage.checkBirthday(birthday);
    }
}
