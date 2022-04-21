import org.junit.Test;

public class akunTest extends Base{

    @Test
    public void createakunTest() throws InterruptedException {
        account accountPage = new account(webDriver);
        accountPage.clickLogin();
        accountPage.clickakun();
        accountPage.setFirstN("vanily");
        accountPage.setLastN("vaili");
        accountPage.setInemailakun("vanilyhomemade@gmail.com");
        accountPage.setInpasswakun("Vanilyku20");
        accountPage.setKonfirpassw("Vanilyku20");
        accountPage.kliknextakun();
        Thread.sleep(2000);
        accountPage.setVerifyno("81389893019");
        accountPage.kliknextakun();
        Thread.sleep(2000);
        accountPage.setVerifycode("514851");
        accountPage.kliknextakun();
    }
}

