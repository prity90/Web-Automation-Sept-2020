package sarch;

import base.CommonAPI;
import org.testng.annotations.Test;

import java.util.List;

public class PrimeTest extends CommonAPI {

    PrimeTest prime = new PrimeTest();

    @Test
    public void primeTest() throws Exception {

        clickOnWebElement("nav-link-prime");
        List<String> list2 = prime.getPrimeListFromDB();
        for (String items : list2) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    private void typeOnWebElementNHitEnter(String s, String items) {
    }

    private List<String> getPrimeListFromDB() {
        return null;
    }

}
