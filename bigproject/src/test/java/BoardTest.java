import org.junit.Test;

public class BoardTest extends Base {

    @Test
    public void AddCard() throws InterruptedException {
        Board boardPage = new Board(webDriver);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        Thread.sleep(2000);
        boardPage.clickBoard();
        Thread.sleep(2000);
        boardPage.btAddcard();
        boardPage.setNamecard("vailin");
        boardPage.setBtAddCard();
    }

    @Test
    public void Editnama() throws InterruptedException {
        Board boardPage = new Board(webDriver);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        Thread.sleep(2000);
        boardPage.clickBoard();
        Thread.sleep(2000);
        boardPage.klikEditCard();
        Thread.sleep(2000);
        boardPage.btUbahnama();
        Thread.sleep(2000);
        boardPage.setUbahname("vailin2");
        boardPage.btSave();
    }
    @Test
    public void GetMember() throws InterruptedException {
        Board boardPage = new Board(webDriver);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        Thread.sleep(2000);
        boardPage.clickBoard();
        Thread.sleep(2000);
        boardPage.btCard();
        Thread.sleep(2000);
        boardPage.btMember();
        Thread.sleep(2000);
        boardPage.klikSearch();
        Thread.sleep(2000);
        boardPage.setGetMember();
    }
    @Test
    public void SettNotes() throws InterruptedException {
        Board boardPage = new Board(webDriver);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        Thread.sleep(2000);
        boardPage.clickBoard();
        Thread.sleep(2000);
        boardPage.btCard();
        Thread.sleep(2000);
        //note card
        boardPage.btNote();
        Thread.sleep(1000);
        boardPage.setNotes("Testing");
        boardPage.btLink();
        Thread.sleep(2000);
        boardPage.setUrl("https://staging.cicle.app/");
        boardPage.setUrltext("Cicle");
        Thread.sleep(2000);
        boardPage.btInsert();
        Thread.sleep(3000);
        boardPage.klikitalic();
        Thread.sleep(2000);
        boardPage.btSave();
    }
    @Test
    public void SettComment() throws InterruptedException {
        Board boardPage = new Board(webDriver);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        Thread.sleep(3000);
        boardPage.clickBoard();
        Thread.sleep(2000);
        boardPage.btCard();
        Thread.sleep(3000);
        boardPage.klikComt();
        Thread.sleep(2000);
        boardPage.inputCommt("Nice");
        Thread.sleep(2000);
        boardPage.btSave();
    }
    @Test
    public void MoveCard() throws InterruptedException {
        Board boardPage = new Board(webDriver);
        dasboard dasboardPage = new dasboard(webDriver);
        // klik paket A
        dasboardPage.clickcard();
        Thread.sleep(3000);
        boardPage.clickBoard();
        Thread.sleep(2000);
        boardPage.klikEditCard();
        Thread.sleep(3000);
        //move
        boardPage.btMove1();
        Thread.sleep(1000);
        boardPage.klikGetdes();
        Thread.sleep(1000);
        boardPage.klikSetdest();
        boardPage.btMove2();
    }
}

