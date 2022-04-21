import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class account {
    private static WebDriver driver;

    public account(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//div[.='Login with Google Account']")
    private WebElement loginemail;
    @FindBy(xpath = "//span[.='Buat akun']")
    private WebElement buttonakun;
    @FindBy(xpath = "//input[@id='firstName']")
    private WebElement inputfn;
    @FindBy(xpath = "//input[@id='lastName']")
    private WebElement inputln;
    @FindBy(xpath = "//input[@id='username']")
    private WebElement inputemailakun;
    @FindBy(xpath = "//input[@name='Passwd']")
    private WebElement inputpwdakun;
    @FindBy(xpath = "//input[@name='ConfirmPasswd']")
    private WebElement konfirpwd;
    @FindBy(xpath = "//span[.='Berikutnya']")
    private WebElement nextakun;
    @FindBy(xpath = "//input[@id='phoneNumberId']")
    private WebElement verifyno;
    @FindBy(id = "code")
    private WebElement verifycode;

    public void clickLogin() { loginemail.click(); }
    public void clickakun() { buttonakun.click(); }
    public void setFirstN(String fn) { inputfn.sendKeys(fn);}
    public void setLastN(String ln) { inputln.sendKeys(ln);}
    public void setInemailakun(String ea) { inputemailakun.sendKeys(ea);}
    public void setInpasswakun(String pa) { inputpwdakun.sendKeys(pa);}
    public void setKonfirpassw(String kp) { konfirpwd.sendKeys(kp);}
    public void kliknextakun() { nextakun.click(); }
    public void setVerifyno(String vn) { verifyno.sendKeys(vn); }
    public void setVerifycode(String vc) { verifyno.sendKeys(vc);}

}
