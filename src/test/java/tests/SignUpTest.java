package tests;

import org.junit.Test;

public class SignUpTest extends SampleTest {

    @Test
    public void SignUpTest(){
        user.mainPage.openMainPage();
        user.mainPage.clickOnSignUpButton();
        user.mainPage.fillNameField("trpt");
        user.mainPage.clickOnUseEmailButton();
        user.mainPage.fillEmailField("trpt2@inbox.ru");
        user.mainPage.selectBirthMonth("мая");
        user.mainPage.selectBirthDay("3");
        user.mainPage.selectBirthYear("1990");
        user.mainPage.clickProceedButton();
        user.mainPage.clickProceedButton();
        user.mainPage.checkName("trpt");
        user.mainPage.checkEmail("trpt2@inbox.ru");
        user.mainPage.checkBirthday("3 мая 1990 г.");
    }
}
