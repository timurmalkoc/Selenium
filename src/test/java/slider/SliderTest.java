package slider;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HorizontalSlider;

import static org.testng.Assert.assertEquals;

public class SliderTest extends BaseTest {
    @Test
    public void setSliderTestValue4() {
        HorizontalSlider slider = homePage.clickHorizontalSlider();
        slider.leftClickUntilValue(4.0);
        assertEquals(slider.getValue(),"4","Value does not match");
    }

}
