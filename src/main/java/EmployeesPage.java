import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class EmployeesPage {
    private DSL dsl;

    public EmployeesPage(WebDriver driver){
        dsl = new DSL(driver);
    }

    public void clickButtonEmployee(){
        dsl.clickElementEmployees();
    }

    public void setSearchEmployee(String name){
        dsl.searchEmployee(name);
    }

    public void checkEmployee(String name){
        dsl.checkSearchEmployee(name);
    }

    public void deleteEmployee(){
        dsl.clickButtonWithId("delete-btn");
    }

    public void confirmDeletedEmployee(){
        dsl.checkSuccessMessage("SUCESSO! Funcionário removido com sucesso\n" + "×");
    }


}
