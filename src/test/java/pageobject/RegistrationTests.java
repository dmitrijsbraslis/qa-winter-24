package pageobject;

import model.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

public class RegistrationTests {
    private BaseFunc baseFunc = new BaseFunc();

//    @BeforeEach
//    public void generateUser() {    }

    @Test
    public void registrationFormCheck() {
        baseFunc.openHomePage()
                .acceptCookies()
                .openLoginPage()
                .openRegistrationPage()
                .fillInRegistrationForm(new User(true));
    }

    @AfterEach
    public void closeBrowser() {
        baseFunc.closeBrowser();
    }

//    @Test
//    public void registrationFormCheck() {
//        BaseFunc baseFunc = new BaseFunc();
//        baseFunc.openURL("1a.lv");
//
//        HomePage homePage = new HomePage(baseFunc);
//        homePage.acceptCookies();
//        homePage.openLoginPage();
//
//        LoginPage loginPage = new LoginPage(baseFunc);
//        loginPage.openRegistrationPage();
//
//        RegistrationPage registrationPage = new RegistrationPage(baseFunc);
//        registrationPage.fillInRegistrationForm("Dmitrijs", "Tester", "test@test.lv");
//    }
}
