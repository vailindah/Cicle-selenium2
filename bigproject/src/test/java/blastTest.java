import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;

public class blastTest extends Base {
    JavascriptExecutor js = (JavascriptExecutor) webDriver;

    @Test
    public void sendpostext() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        dasboardPage.clickcard();
        Thread.sleep(1000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(1000);
        blastPage.clickcreatebt();
        Thread.sleep(1000);
        blastPage.setitle("kiwi");
        Thread.sleep(1000);
        blastPage.setell("apel");
        blastPage.klikpribadi();
        blastPage.clickpublish();
    }

    @Test
    public void sendpostimage() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        //String namehello = dasboardPage.getName();
        dasboardPage.clickcard();
        Thread.sleep(2000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(3000);
        blastPage.clickcreatebt();
        blastPage.setitle("kiwi");
        blastPage.clickfile();
        Thread.sleep(1000);
        blastPage.setimage2();
        Thread.sleep(3000);
        blastPage.klikUploadImage();
        Thread.sleep(2000);
        blastPage.klikResize();
        Thread.sleep(1000);
        blastPage.clearText();
        Thread.sleep(1000);
        blastPage.setInputresize("80px");
        blastPage.klikbtrize();
        Thread.sleep(1000);
        blastPage.clickpublish();
    }

    @Test
    public void sendjadwalbc() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        //String namehello = dasboardPage.getName();
        dasboardPage.clickcard();
        Thread.sleep(1000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(2000);
        blastPage.clickcreatebt();
        Thread.sleep(1000);
        blastPage.setitle("nanas");
        blastPage.setell("mangga");
        blastPage.klikDuedate();
        blastPage.klikdate2();
        Thread.sleep(1000);
        blastPage.cleardate();
        blastPage.setDatebc("2022/04/10");
        Thread.sleep(1000);
        blastPage.clearjam();
        blastPage.setJam("15:07 AM");
        blastPage.clickpublish();
    }

    @Test
    public void editBc() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        dasboardPage.clickcard();
        Thread.sleep(1000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(2000);
        //klik post
        blastPage.klikMangga();
        blastPage.klikOption();
        Thread.sleep(1000);
        blastPage.klikEdit();
        Thread.sleep(1000);
        blastPage.klikbtEmot();
        Thread.sleep(3000);
        blastPage.klikEmot();
        Thread.sleep(1000);
        blastPage.klikbtchg();
    }

    @Test
    public void arciveBc() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        dasboardPage.clickcard();
        Thread.sleep(1000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(2000);
        //klik post
        blastPage.getKiwi();
        Thread.sleep(2000);
        blastPage.klikOption();
        Thread.sleep(2000);
        blastPage.klikcArsip();
    }

    @Test
    public void addComment() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        dasboardPage.clickcard();
        Thread.sleep(1000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(2000);
        //klik post
        blastPage.klikMangga();
        //comment
        Thread.sleep(2000);
        blastPage.klikComment();
        Thread.sleep(2000);
        blastPage.setInputkomen("stwarberry");
        blastPage.klikbtCom();
    }

    @Test
    public void invalidBlast() throws InterruptedException {
        // klik paket A
        dasboard dasboardPage = new dasboard(webDriver);
        dasboardPage.clickcard();
        Thread.sleep(2000);
        //klik blast
        blast blastPage = new blast(webDriver);
        blastPage.clickblast();
        Thread.sleep(3000);
        blastPage.clickcreatebt();
        Thread.sleep(1000);
        blastPage.setell("apel");
        blastPage.clickpublish();
    }
}
