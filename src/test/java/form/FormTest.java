package form;

import org.testng.annotations.Test;
import webForm.FormyPage;

public class FormTest extends FormBase{

    @Test
    public void formSubmission(){
        formHomePage.setFirstNameField("jan");
        formHomePage.setLastNameField("smith");
        formHomePage.setJobTileField("teacher");
        formHomePage.setCollage();
        formHomePage.setMale();

        FormyPage formyPage = formHomePage.submit();
        System.out.println(formyPage.getAlert());
    }
}
