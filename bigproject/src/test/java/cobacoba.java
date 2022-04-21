import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class cobacoba extends Base {
//    private WebDriver webDriver;
////    public cobacoba() {
////        super();
////        this.webDriver = loginTest.webDriver;
////    }

    @Test
    public void AddCard() throws InterruptedException {
        Thread.sleep(2000);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
    }
}