import org.openqa.selenium.WebDriver;

public class RegisterUserPage {

    private DSL dsl;

    public RegisterUserPage(WebDriver driver){
        dsl = new DSL(driver);
    }

    public void setName(String name){
        dsl.fillFieldRegistrationPage("inputNome", name);
    }
    public void setCpf(String value){
        dsl.fillFieldRegistrationPage("cpf", value);
    }

    public void setDataAdmission(String value){
        dsl.fillFieldRegistrationPage("inputAdmissao", value);
    }

    public void setPosition(String name){
        dsl.fillFieldRegistrationPage("inputCargo", name);
    }

    public void setSalary(String value){
        dsl.fillFieldRegistrationPage("dinheiro", value);
    }
    public void setSex(String value ){
        dsl.selectSexRegistrationPage("slctSexo",value);
    }

    public void setHiringModel(String value){
        dsl.clickButtonWithId(value);
    }

    public void setSearchEmployee(String name){
        dsl.searchEmployee(name);
    }

    public void checkSearchEmployee(String name){
        dsl.checkSearchEmployee(name);
    }

    public void clickButtonEdit(){
        dsl.clickButtonEdit();
    }

    public void clickRegisterEmployee(){
        dsl.clickButtonWithClassName("cadastrar-form-btn");
    }

    public void confirmRegisterEmpolyee(){
        dsl.checkSuccessMessage("SUCESSO! Informações atualizadas com sucesso \n" + "×");
    }

    public void clickButtonNewEmployee(){
        dsl.clickElementNewEmployee();
    }
}
