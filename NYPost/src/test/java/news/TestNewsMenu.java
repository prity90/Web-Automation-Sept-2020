package news;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNewsMenu extends CommonAPI {

    @Test
    public void test1(){
        clickOnWebElement("menu-icon-svg");
    }
}
