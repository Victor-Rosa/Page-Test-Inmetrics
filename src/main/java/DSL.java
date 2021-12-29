import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DSL {

    private WebDriver driver;

    public DSL(WebDriver driver) {
        this.driver = driver;
    }



    public void checkSuccessMessage(String message){
        Assert.assertEquals(message,
                driver.findElement(
                                By.xpath("//div[contains(@class, 'alert alert-success alert-dismissible fade show')]"))
                        .getText());
    }

    public void fillFieldRegistrationPage(String id, String name){
        driver.findElement(By.id(id)).clear();
        driver.findElement(By.id(id)).sendKeys(name);
    }

    public void checkFieldRegistrationPage(String id, String value){
        Assert.assertEquals(value, driver.findElement(By.id(id)).getText());
    }


    public void selectSexRegistrationPage(String id, String sex){
        new Select(driver.findElement(By.id(id)))
                .selectByVisibleText(sex);
    }

    public void clickButtonWithClassName(String className){
        driver.findElement(By.className(className)).click();
    }

    public void clickButtonWithId(String id){
        driver.findElement(By.id(id)).click();
    }

    public void clickButtonEdit() {
        driver.findElement(By.xpath("//button[@class='btn btn-warning']")).click();
    }

    public void clickElementNewEmployee(){

        WebElement newEmployee = driver.findElement(By.xpath("//a[text()= 'Novo Funcionário']"));
        newEmployee.click();
    }

    public void clickElementEmployees(){

        WebElement Employees = driver.findElement(By.xpath("//a[text()= 'Funcionários']"));
        Employees.click();
    }


    public void searchEmployee(String name){
        WebElement inputResearchName = driver.findElement(By.xpath("//input[@type='search']"));
        inputResearchName.click();
        inputResearchName.sendKeys(name);
    }

    public void checkSearchEmployee (String name){
        String userName = driver.findElement(By.xpath("//td[@class='text-center sorting_1']")).getText();
        Assert.assertEquals(name, userName);
    }


    public void setLogin(String name, String password){
        setNameLoginPage(name);
        setPasswordLoginPage(password);
        clickButtonWithClassName("login100-form-btn");
    }

    public void setNameLoginPage(String name){
        driver.findElement(By.name("username")).sendKeys(name);
    }
    public void setPasswordLoginPage(String password){
        driver.findElement(By.name("pass")).sendKeys(password);
    }
}


