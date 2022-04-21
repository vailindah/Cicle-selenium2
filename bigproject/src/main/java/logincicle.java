import jdk.nashorn.internal.runtime.regexp.JoniRegExp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logincicle {
    public static WebDriver driver;

    public logincicle(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[.='Login with Google Account']")
    private WebElement loginemail;
    //@FindBy(xpath = "//span[.='Buat akun']")
    //private WebElement buttonakun;

    @FindBy(id = "identifierId")
    private WebElement inputemail;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement inputpwd;
    @FindBy(xpath = "//span[.='Berikutnya']")
    private WebElement nextpwd;

    public void clickLogin() { loginemail.click(); }
    // public void clickakun() { buttonakun.click(); }
    public void setEmail(String email) { inputemail.sendKeys(email);}
    public void clicknext1() { nextpwd.click(); }
    public void setPassw(String pwd) { inputpwd.sendKeys(pwd);}
    public void clicknext() { nextpwd.click(); }

}
