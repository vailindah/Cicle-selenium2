import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class blast {
    private static WebDriver driver;

    public blast(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/blasts/61fd1d0e835d69f0ecfc4843']/div[@class='BoxMenu_BoxMenu__1FX08 card']")
    private WebElement klikblast;
    @FindBy(xpath = "//button[@class='btn btn-primary btn-sm']")
    private WebElement btcreateblast;
    @FindBy(xpath = "//div[@class='CreateBlastPage_inputTitleSection__3vhfz']/textarea[1]")
    private WebElement inputitle;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputell;
    @FindBy(xpath = "//div[.='Publish']")
    private WebElement btpublish;
    //upload file
    @FindBy(xpath = "//button[.='Insert Files']")
    private WebElement klikfile;
    @FindBy(xpath = "//div[@class='fr-form']/input[1]")
    private WebElement inputfile;
    @FindBy(id = "fr-file-insert-button-0")
    private WebElement clickinputfile;
    @FindBy(id = "imageSize-1")
    private WebElement clickresizee;
    @FindBy(id = "fr-image-size-layer-width-'1")
    private WebElement inputresize;
    @FindBy(xpath = "//button[.='Update']")
    private WebElement btupdateresize;
    @FindBy(xpath = "//div[@class='MuiSelect-root MuiSelect-select MuiSelect-selectMenu MuiInputBase-input MuiInput-input']")
    // set date
    private WebElement klikbtdate;
    @FindBy (xpath = "//li[@class='MuiButtonBase-root MuiListItem-root MuiMenuItem-root MuiMenuItem-gutters MuiListItem-gutters MuiListItem-button']")
    private WebElement klikbtdate2;
    @FindBy(id = "date-picker-dialog-start")
    private WebElement inputdate;
    @FindBy(id = "time-picker")
    private WebElement inputjam;
    //edit arcive
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']//div[@class='Post_contentSection__header__h1KvM']/div[contains(.,'mangga')]")
    private WebElement klikBc;
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[contains(.,'kiwiYesterdayApr 10Nurindah Cilsy - apel0')]")
    private WebElement klikKiwi;
    @FindBy(xpath = "//div[@class='PostBlastPage_menuSection__2mg_7']")
    private WebElement klikOpsi;
    @FindBy(xpath = "//div[@class='RoundActionMenu_container__2ta8s RoundActionMenu_medium__3rLho']")
    private WebElement klikOpsi2;
    @FindBy(xpath = "//div[.='Edit']")
    private WebElement klikEdit;
    @FindBy(xpath = "//div[.='Archive This Post']")
    private WebElement klikArch;
    @FindBy(id = "emoticons-1")
    private WebElement btemot;
    @FindBy(xpath = "//span[11]")
    private WebElement plemot;
    @FindBy(xpath = "//div[.='Publish Changes']")
    private WebElement publischg;
    @FindBy(xpath = "//input[@name='switchItem']")
    private WebElement pribadi;
    //commen
    @FindBy(xpath = "//div[@class='CreateCommentForm_inputComment__2G2m9']")
    private WebElement createkomen;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement inputkomen;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement btsavecom;

    public void klikbtCom() {
        btsavecom.click();
    }
    public void klikComment() {
        createkomen.click();
    }
    public void setInputkomen(String komen) {
        inputkomen.sendKeys(komen);
    }

    public void klikOption() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(klikOpsi).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(klikOpsi2).click().build().perform();
    }
    public void klikbtchg() {
        publischg.click();
    }
    public void klikMangga() {
        klikBc.click();
    }
    public void getKiwi() {
        klikKiwi.click();
    }
    public void klikEdit() {
        klikEdit.click();
    }
    public void klikbtEmot() {
        btemot.click();
    }
    public void klikEmot() {
        plemot.click();
    }
    public void klikcArsip() {
        klikArch.click();
    }
    public void clickblast() throws InterruptedException {
        Thread.sleep(3000);
        klikblast.click();
    }
    public void clearText() { inputresize.clear();}
    public void cleardate() { inputdate.clear();}
    public void clearjam() { inputjam.clear();}
    public void clickcreatebt() {
        btcreateblast.click();
    }
    public void setitle(String title) {
        inputitle.sendKeys(title);
    }
    public void setell(String tell) {
        inputell.sendKeys(tell);
    }
    public void clickpublish() {
        btpublish.click();
    }
    public void clickfile() {
        klikfile.click();
    }
    public void setimage2() throws InterruptedException {
        String file = System.getProperty("user.dir") + "\\driver\\course.png";
        inputfile.sendKeys(file);
    }
    public void klikUploadImage() { clickinputfile.click(); }
    public void klikResize() {
        clickresizee.click();
    }
    public void setInputresize(String size) {
        inputresize.sendKeys(size);
    }
    public void klikbtrize() { btupdateresize.click();}
    public void klikDuedate() {klikbtdate.click();}
    public void klikdate2() {klikbtdate2.click();}
    public void setDatebc(String date) {
        inputdate.sendKeys(date);
    }
    public void setJam(String jam) {
        inputjam.sendKeys(jam);
    }
    public void klikpribadi() {
        pribadi.click();
    }



}

