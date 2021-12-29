import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class registrationComplete {

    private WebDriver driver;
    private DSL dsl;
    private LoginPage loginPage;
    private RegisterUserPage registerPage;
    private EmployeesPage employeesPage;

    @Before
    public void initializesBrowser(){
        //LoginPage
        System.setProperty("webdriver.chrome.driver", "C:\\VIC\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200,765));
        driver.get("http://inm-test-app.herokuapp.com/accounts/login/");
        dsl = new DSL(driver);
        loginPage = new LoginPage(driver);
        registerPage = new RegisterUserPage(driver);

        loginPage.setLogin("Victorrosa", "rosa");
        loginPage.clickButtonLogin();
    }



    @Test
    public void registerUser() {
        //RegisterUserPage
        registerPage.clickButtonNewEmployee();
        registerPage.setName("Victor Rosa");
        registerPage.setCpf("157.219.647-58");
        registerPage.setDataAdmission("10/10/2021");
        registerPage.setPosition("Analista de QA Junior");
        registerPage.setSalary("3.500");
        registerPage.setSex("Masculino");
        registerPage.setHiringModel("clt");
        registerPage.clickRegisterEmployee();
        registerPage.confirmRegisterEmpolyee();

    }

    @Test
    public void deleteUser(){
        //EmployeesPage
       employeesPage.clickButtonEmployee();
       employeesPage.setSearchEmployee("Victor Rosa");
       employeesPage.checkEmployee("Victor Rosa");
       employeesPage.deleteEmployee();
       employeesPage.confirmDeletedEmployee();

    }

    @Test
    public void editUser(){
        //RegisterUserPage
        registerPage.setSearchEmployee("Victor Rosa");
        registerPage.checkSearchEmployee("Victor Rosa");
        registerPage.clickButtonEdit();
        registerPage.setName("Rafael Rosa");
        registerPage.setPosition("Analista de QA Pleno");
        registerPage.setDataAdmission("10/08/2021");
        registerPage.setSalary("5.5000");
        registerPage.clickRegisterEmployee();
        registerPage.confirmRegisterEmpolyee();

    }
}




