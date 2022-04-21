import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.List;

public class dasboard {
    private static WebDriver driver;

    public dasboard(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    @FindBy(xpath = "//h1[.='Paket soal A']")
    private WebElement namehello;
    @FindBy(xpath = "//a[.='Paket soal A9']")
    private WebElement klikcard;


    public String getName() {
        return namehello.getText();
    }
    public void clickcard() {
        klikcard.click();
    }
}
