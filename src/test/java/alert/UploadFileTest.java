package alert;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.FileUploadPage;

import static org.testng.Assert.assertEquals;

public class UploadFileTest extends BaseTest {

    @Test
    public void testFileUpload() {
        FileUploadPage fileUploadPage = homePage.clickUploadFile();
        fileUploadPage.uploadFile("C:\\Users\\malko\\Downloads\\TestUpload.txt");
        assertEquals(fileUploadPage.getUploadedFileText(),"TestUpload.txt","Upload failed");
    }
}
