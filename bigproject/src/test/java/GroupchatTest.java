import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class GroupchatTest extends Base {

    @Test
    public void sendchat() throws InterruptedException {
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send text
        grupchatPage.setext("panda");
        Thread.sleep(2000);
        grupchatPage.kliksend();
    }

    @Test
    public void sendattac() throws InterruptedException {
        dasboard dasboardPage = new dasboard(webDriver);
        String namehello = dasboardPage.getName();
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send image
        grupchatPage.setimage();
    }

    @Test
    public void deletemessage() throws InterruptedException {
        dasboard dasboardPage = new dasboard(webDriver);
        String namehello = dasboardPage.getName();
        // klik paket A
        dasboardPage.clickcard();
        // klik grup chat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickkutip();
        Thread.sleep(2000);
        // delete message
        grupchatPage.klikdelete();
        grupchatPage.klikbuttondel();
    }

    @Test
    public void sendtagname() throws InterruptedException {
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send text
        grupchatPage.setext("@");
        Thread.sleep(2000);
        grupchatPage.klikNama();
        Thread.sleep(2000);
        grupchatPage.kliksend();
    }

    @Test
    public void seeProfile() throws InterruptedException {
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        Thread.sleep(2000);
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        grupchatPage.clickProfil();
    }

    @Test
    public void sendchatfull() throws InterruptedException {
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        // klik grupchat
        grupchat grupchatPage = new grupchat(webDriver);
        grupchatPage.clickgrup();
        Thread.sleep(2000);
        // send text
        grupchatPage.setext("pelangipelangialahkahindahmumerahkuninghijaudilangit ygbiru pelukismu agung siapa geraknya pelangipelangi ciptaan tuhan");
        Thread.sleep(2000);
        grupchatPage.kliksend();
    }
}

