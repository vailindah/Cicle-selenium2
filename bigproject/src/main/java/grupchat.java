import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class grupchat {
    private static WebDriver driver;

    public grupchat(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//a[@href='/group-chats/61fd1d0e835d698459fc4841']//div[@class='card-body']")
    private WebElement klikgrup;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement sendchat;
    @FindBy(xpath = "//button[@class='rounded-circle btn btn-warning btn-sm']")
    private WebElement buttonsend;

    @FindBy(xpath = "//div[@class='infinite-scroll-component ']/div[1]//div[@class='AttachmentItem_senderName__3bo5O']")
    private WebElement label;
    @FindBy(xpath = "(//*[local-name()='svg'])[5]")
    private WebElement klikkutip;
    @FindBy(xpath = "//div[@class=\"infinite-scroll-component \"]/div[1]//*[contains(text(),'Nurindah Cilsy')]")
    private WebElement labelNurindahCilsy;
    @FindBy (xpath = "//div[@class='infinite-scroll-component ']//div[@class='Message_mainContainer__BuB70']//p[contains(.,'vailindah nr')]")
    private WebElement labelVaili;
    @FindBy(xpath = "//div[@class='OverlayButton_box__2jFLd']")
    private WebElement btdeletechat;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttondelete;
    @FindBy(xpath = "//div[@class='CreateGroupMessage_attachmentButton__i4UJs']/preceding-sibling::input")
    private WebElement pilihimage;
    @FindBy(xpath = "//div[@class='infinite-scroll-component ']//a[.='vailindah nr']")
    private WebElement kliknamavaili;
    @FindBy(xpath = "//li[.='vailindah nr']")
    private WebElement pilihnama;

    public void klikNama() {
        pilihnama.click();
    }
    public void clickgrup() throws InterruptedException {
        Thread.sleep(3000);
        klikgrup.click();
    }
    public void setext(String pwd) {
        sendchat.sendKeys(pwd);
    }
    public void kliksend() {
        buttonsend.click();
    }
    public void clickkutip() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(labelNurindahCilsy).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(klikkutip).click().build().perform();
    }
    public void clickProfil() throws InterruptedException {
        Thread.sleep(3000);
        Actions actions = new Actions(driver);
        actions.moveToElement(labelVaili).build().perform();
        Thread.sleep(2000);
        actions.moveToElement(kliknamavaili).click().build().perform();
    }
    public void klikdelete() {
        btdeletechat.click();
    }
    public void klikbuttondel() {
        buttondelete.click();
    }
    public void setimage() throws InterruptedException {
        String file = System.getProperty("user.dir") + "\\driver\\course.png";
        pilihimage.sendKeys(file);
    }

}
