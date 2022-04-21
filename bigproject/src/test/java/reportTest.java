import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.annotations.Test;

public class reportTest {

    @Test
    public void tesreport(){
        ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("./Report/ReportCicle.html");
        ExtentReports extentReports = new ExtentReports();
        extentReports.attachReporter(extentSparkReporter);

        ExtentTest logg = extentReports.createTest("Login Success");
        logg.log(Status.PASS, "login Success");
        //1
        ExtentTest sText = extentReports.createTest("SendText in GroupChat");
        sText.log(Status.PASS, "login Success");
        sText.log(Status.PASS, "Open Card A");
        sText.log(Status.PASS, "Open Group Chat");
        sText.log(Status.PASS, "Send Text Success");

        ExtentTest sImage = extentReports.createTest("SendImage in GroupChat");
        sImage.log(Status.PASS, "login Success");
        sImage.log(Status.PASS, "Open Card A");
        sImage.log(Status.PASS, "Open Group Chat");
        sImage.log(Status.PASS, "Send Image");

        ExtentTest delMassg = extentReports.createTest("Delete massage in GroupChat");
        delMassg.log(Status.PASS, "login Success");
        delMassg.log(Status.PASS, "Open Card A");
        delMassg.log(Status.PASS, "Open Group Chat");
        delMassg.log(Status.PASS, "Click name for show notif");
        delMassg.log(Status.PASS, "Delete Image");

        ExtentTest tagMent = extentReports.createTest("Mention member in GroupChat");
        tagMent.log(Status.PASS, "login Success");
        tagMent.log(Status.PASS, "Open Card A");
        tagMent.log(Status.PASS, "Open Group Chat");
        tagMent.log(Status.PASS, "Mention member");
        //6
        ExtentTest seeProf = extentReports.createTest("See Profile in GroupChat");
        seeProf.log(Status.PASS, "login Success");
        seeProf.log(Status.PASS, "Open Card A");
        seeProf.log(Status.PASS, "Open Group Chat");
        seeProf.log(Status.PASS, "Mention member");
        //1
        ExtentTest sPost = extentReports.createTest("Sendpost Text in Blast!");
        sPost.log(Status.PASS, "login Success");
        sPost.log(Status.PASS, "Open Card A");
        sPost.log(Status.PASS, "Open Blast");
        sPost.log(Status.PASS, "Create post");
        sPost.log(Status.PASS, "Upload Private");
        sPost.log(Status.PASS, "Publish Blast");

        ExtentTest sPosimg = extentReports.createTest("Sendpost Image in Blast!");
        sPosimg.log(Status.PASS, "login Success");
        sPosimg.log(Status.PASS, "Open Card A");
        sPosimg.log(Status.PASS, "Open Blast");
        sPosimg.log(Status.PASS, "Sett File Image");
        sPosimg.log(Status.PASS, "Sett Resize Image");
        sPosimg.log(Status.PASS, "Publish Blast");

        ExtentTest datePost = extentReports.createTest("Sett Due Date Post in Blast!");
        datePost.log(Status.PASS, "login Success");
        datePost.log(Status.PASS, "Open Card A");
        datePost.log(Status.PASS, "Sett Text Post");
        datePost.log(Status.PASS, "Choose due sate manually");
        datePost.log(Status.PASS, "Sett Date");
        datePost.log(Status.PASS, "Publish Blast");

        ExtentTest eBC = extentReports.createTest("Edit BC in Blast!");
        eBC.log(Status.PASS, "login Success");
        eBC.log(Status.PASS, "Open Card A");
        eBC.log(Status.PASS, "Open Blast");
        eBC.log(Status.PASS, "Choose post mangga");
        eBC.log(Status.PASS, "Choose option Edit");
        eBC.log(Status.PASS, "Sett Resize Image");
        eBC.log(Status.PASS, "Publish Changes");

        ExtentTest eArch = extentReports.createTest("Edit Archive in Blast!");
        eArch.log(Status.PASS, "login Success");
        eArch.log(Status.PASS, "Open Card A");
        eArch.log(Status.PASS, "Open Blast");
        eArch.log(Status.PASS, "Choose post kiwi");
        eArch.log(Status.PASS, "Choose option Edit");
        eArch.log(Status.PASS, "Sett Archive post");

        ExtentTest aComment = extentReports.createTest("Add Comment in Blast!");
        aComment.log(Status.PASS, "login Success");
        aComment.log(Status.PASS, "Open Card A");
        aComment.log(Status.PASS, "Open Blast");
        aComment.log(Status.PASS, "Choose post mangga");
        aComment.log(Status.PASS, "Sett Comment");
        aComment.log(Status.PASS, "Save Comment");
        //7
        ExtentTest iPost = extentReports.createTest("Invalid Post in Blast!");
        iPost.log(Status.PASS, "login Success");
        iPost.log(Status.PASS, "Open Card A");
        iPost.log(Status.PASS, "Open Blast");
        iPost.log(Status.PASS, "Create post without tittle");
        iPost.log(Status.PASS, "Publish Blast");
        //1
        ExtentTest aCard = extentReports.createTest("Add Card in Board");
        aCard.log(Status.PASS, "login Success");
        aCard.log(Status.PASS, "Open Card A");
        aCard.log(Status.PASS, "Open Board");
        aCard.log(Status.PASS, "Sett Add Card");

        ExtentTest chagC = extentReports.createTest("Chages Name Card in Board");
        chagC.log(Status.PASS, "login Success");
        chagC.log(Status.PASS, "Open Card A");
        chagC.log(Status.PASS, "Open Board");
        chagC.log(Status.PASS, "Sett Changes Card");

        ExtentTest aMember = extentReports.createTest("Add Member Card in Board");
        aMember.log(Status.PASS, "login Success");
        aMember.log(Status.PASS, "Open Card A");
        aMember.log(Status.PASS, "Open Board");
        aMember.log(Status.PASS, "Choose Add Member");

        ExtentTest aNotes = extentReports.createTest("Add Notes in Board");
        aNotes.log(Status.PASS, "login Success");
        aNotes.log(Status.PASS, "Open Card A");
        aNotes.log(Status.PASS, "Open Board");
        aNotes.log(Status.PASS, "Make a Notes");
        aNotes.log(Status.PASS, "Insert Url");
        aNotes.log(Status.PASS, "Save Notes");

        ExtentTest aComment2 = extentReports.createTest("Add Comment in Board");
        aComment2.log(Status.PASS, "login Success");
        aComment2.log(Status.PASS, "Open Card A");
        aComment2.log(Status.PASS, "Open Board");
        aComment2.log(Status.PASS, "Make a Comment");
        aComment2.log(Status.PASS, "Save Comment");
        //6
        ExtentTest moveCr = extentReports.createTest("Move Card in Board");
        moveCr.log(Status.PASS, "login Success");
        moveCr.log(Status.PASS, "Open Card A");
        moveCr.log(Status.PASS, "Open Board");
        moveCr.log(Status.PASS, "Sett Move Card");
        //
        ExtentTest editDel = extentReports.createTest("Invalid send text on Group Chat");
        editDel.log(Status.PASS, "login Success");
        editDel.log(Status.PASS, "Open Card A");
        editDel.log(Status.PASS, "Open Group Chat");
        editDel.log(Status.PASS, "Input test more then 96 word");
        editDel.log(Status.FAIL, "Send text");


        //logger.log(Status.FAIL, "invalid login");
        //logger.fail("tes fail", MediaEntityBuilder.createScreenCaptureFromPath("D:/tesfail.jpg").build());
        extentReports.flush();
    }

}
