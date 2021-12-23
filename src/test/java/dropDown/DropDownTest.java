package dropDown;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.DropDownPage;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class DropDownTest extends BaseTest {

    @Test
    public void testSelectionOption(){
        DropDownPage dropDownPage = homePage.clickDropDown();

        String option = "Option 1";

        dropDownPage.selectFromDropDown("Option 1");
        List<String> list = dropDownPage.getSelectedOptions();

        assertEquals(list.size(), 1, "Incorrect number of selection");
        assertTrue(list.contains(option), "Option is not selected");

    }

}
