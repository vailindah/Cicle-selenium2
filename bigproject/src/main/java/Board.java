import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class Board {
    private static WebDriver driver;

    public Board(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
//add card down
    @FindBy(xpath = "//h1[.='Board']" )
    private WebElement cboard;
    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[1]//div[@class='ListContainer_ListContainer__buttonBottom__2kZAI']")
    private WebElement addcard;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement inameCard;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement btAddCard;
    @FindBy(id = "editCardMenu")
    private  WebElement editCard;
    @FindBy(xpath = "//div[.='Change Name']")
    private WebElement ubahnamecr;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement inputubahnamacr;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement btsavecr;
//card pop up
    @FindBy(xpath = "//a[@href='/cards/6253836d96738a08ee390c00']")
    private WebElement vailin2;
    @FindBy(xpath = "//button[contains(.,'Members')]")
    private WebElement btmember;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement search;
    @FindBy(xpath = "//p[.='vailindah nr']")
    private WebElement getMember;
    @FindBy(css = "[d='M19 6.41L17.59 5 12 10.59 6.41 5 5 6.41 10.59 12 5 17.59 6.41 19 12 13.41 17.59 19 19 17.59 13.41 12z']")
    private WebElement exit;
//note
    @FindBy(xpath = "//p[.='Add a detailed notes here...']")
    private WebElement notes;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement createNotes;
    @FindBy(xpath = "//button[.='Insert Link']")
    private  WebElement link;
    @FindBy(xpath = "//input[@name='href']")
    private WebElement urlink;
    @FindBy(xpath = "//input[@name='text']")
    private WebElement urlText;
    @FindBy(xpath = "//button[@class='fr-command fr-submit']")
    private WebElement btinsert;
    @FindBy(xpath = "//button[.='Italic']")
    private WebElement Italic;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement savepop;

    //comment
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement putComment;
    @FindBy(xpath = "//input[@class='CreateCommentForm_formInitial__3AVVg form-control']")
    private WebElement klikComment;

    //att
    @FindBy(xpath = "//button[contains(.,'Attach File')]/preceding-sibling::input")
    private WebElement attachment2;
    //move
    @FindBy(xpath = "//div[.='Move Card']")
    private WebElement moveCard;
    @FindBy(xpath = "//div[@class='ManageMoveCard_listSection__2sf4E']")
    private WebElement getDestination;
    @FindBy(xpath = "//div[@class='ListNameOption_mainSection__3QQi6']/div[.='test002']")
    private WebElement setDestination;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement btMove;

    @FindBy(xpath = "//a[@href='/cards/6251171a96738a909a352db8']")
    private WebElement boxFunny;
    @FindBy(xpath = "//div[@class='ListContainer_ListContainer__outerList__1PG0-']/div[3]//div[@class='ListCard_ListDroppable__1sdGc']")
    private WebElement boxFeatureYubi2;

    public void btMove1() { moveCard.click();}
    public void close() { exit.click();}
    public void klikSetdest() { setDestination.click();}
    public void klikGetdes() { getDestination.click();}
    public void btMove2() { btMove.click();}
    public void inputCommt(String comt) { putComment.sendKeys(comt);}
    public void klikComt() { klikComment.click();}
    public void klikitalic() { Italic.click();}
    public void btInsert() { btinsert.click(); }
    public void btCard() { vailin2.click(); }
    public void clickBoard() { cboard.click(); }
    public void btAddcard() { addcard.click(); }
    public void setNamecard(String pwd) { inameCard.sendKeys(pwd);}
    public void setBtAddCard() { btAddCard.click(); }
    public void klikEditCard() { editCard.click(); }
    public void btUbahnama() { ubahnamecr.click();}
    public void setUbahname(String name) { inputubahnamacr.sendKeys(name); }
    public void btSave() { btsavecr.click(); }
    public void btMember() { btmember.click(); }
    public void klikSearch() { search.click(); }
    public void setGetMember() { getMember.click(); }
    public void btNote() { notes.click(); }
    public void clickExit() { exit.click(); }
    public void setNotes(String note) { createNotes.sendKeys(note); }
    public void btLink() { link.click(); }
    public void setUrl(String url) { urlink.sendKeys(url); }
    public void setUrltext(String url) { urlText.sendKeys(url); }

}
