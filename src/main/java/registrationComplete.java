import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class registrationComplete {

    private WebDriver driver;
    private DSL dsl;

    @Before
    public void initializesBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\VIC\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1200,765));
        driver.get("http://inm-test-app.herokuapp.com/accounts/login/");
        dsl = new DSL(driver);

        driver.findElement(By.name("username")).sendKeys("Victorrosa");

        driver.findElement(By.name("pass")).sendKeys("rosa");

        driver.findElement(By.className("login100-form-btn")).click();


    }




    @Test
    public void registerUser() {


        dsl.clickElementNewEmployee();

        dsl.fillFieldRegistrationPage("inputNome", "Victor Rosa");
        dsl.fillFieldRegistrationPage("cpf", "157.219.647-58");
        dsl.fillFieldRegistrationPage("inputAdmissao", "10/10/2021");
        dsl.fillFieldRegistrationPage("inputCargo", "Analista de QA Junior");
        dsl.fillFieldRegistrationPage("dinheiro", "3.500");
        dsl.selectSexRegistrationPage("slctSexo","Masculino");
        dsl.clickButtonForm("clt");

        dsl.clickButtonRegistrationPage("cadastrar-form-btn");

        dsl.checkSuccessMessage("SUCESSO! Usuário cadastrado com sucesso\n" + "×");

    }

    @Test
    public void deleteUser(){

        dsl.clickElementEmployees();

        dsl.searchEmployee("Victor Rosa");
        dsl.checkSearchEmployee("Victor Rosa");

        dsl.clickButton("delete-btn");

        dsl.checkSuccessMessage("SUCESSO! Funcionário removido com sucesso\n" + "×");
    }

    @Test
    public void editUser(){

        dsl.searchEmployee("Victor Rosa");
        dsl.checkSearchEmployee("Victor Rosa");

        dsl.clickButtonEdit();

        dsl.fillFieldRegistrationPage("inputNome", "Rafael Rosa");
        dsl.fillFieldRegistrationPage("inputAdmissao", "10/08/2021");
        driver.findElement(By.id("inputCargo")).sendKeys("Analista de QA Pleno");
        driver.findElement(By.id("dinheiro")).sendKeys("5.500");


        dsl.clickButtonRegistrationPage("cadastrar-form-btn");
        dsl.checkSuccessMessage("SUCESSO! Informações atualizadas com sucesso \n" + "×");


    }
}




