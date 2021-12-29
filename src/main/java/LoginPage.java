
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private DSL dsl;

    public LoginPage(WebDriver driver){
        dsl = new DSL(driver);
    }

    public void setLogin(String name, String password){
        dsl.setNameLoginPage(name);
        dsl.setPasswordLoginPage(password);
    }

    public void clickButtonLogin(){
        dsl.clickButtonWithClassName("login100-form-btn");
    }

}
