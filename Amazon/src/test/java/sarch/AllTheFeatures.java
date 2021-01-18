package sarch;

import base.CommonAPI;
import datasuply.*;
import org.testng.annotations.Test;

import java.util.List;

public class AllTheFeatures extends CommonAPI {
    AmazonMusic amazonMusic = new AmazonMusic();
    DealsOfTheDay dealsOfTheDay =new DealsOfTheDay();
    ElectronicsOutlet electronicsOutlet = new ElectronicsOutlet();
    Gift gift = new Gift();
    FireTablets fireTablets =new FireTablets();
    NewItems newItems = new NewItems();
    Pharmacy pharmacy = new Pharmacy();
    PrimeVideo primeVideo = new PrimeVideo();
    WholeFoods wholeFoods = new WholeFoods();

    @Test
    public void amazonMusic() throws Exception {
        clickOnWebElement("i.hm-icon.nav-sprite");
        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(8) a");
        List<String> list19 = amazonMusic.getAmazonMusicFromDB();
        for (String items : list19) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    private void typeOnWebElementNHitEnter(String s, String items) {
    }

    @Test
    public void Gift() throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(6)");   // find a gift

        List<String> list5 = gift.getGiftFromDB();
        for (String items : list5) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void PrimeVideo() throws Exception {
        clickOnWebElement("i.hm-icon.nav-sprite");
        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(7) a");
        List<String> list2 = primeVideo.getPrimVideoFromDB();
        for (String items : list2) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void WholeFoods () throws Exception {
        clickOnWebElement("i.hm-icon.nav-sprite");
        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(25) a");
        List<String> list26 = wholeFoods.getWholeFoodsFromDB();
        for (String items : list26) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void dealsOfTheDay() throws Exception {
        clickOnWebElement("div#desktop-grid-6 div:nth-child(3)");
        List<String> list16 = dealsOfTheDay.getDealsOfTheDayFromDB();
        for (String items : list16) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void electronicsOutlet () throws Exception {
        clickOnWebElement("span.a-size-small.a-color-base.aok-align-center.aok-inline-block");  // electronic outlet
        List<String> list11 = electronicsOutlet.getElectronicsOutletFromDB();
        for (String items : list11) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void pharmacy () throws Exception {
        clickOnWebElement("div#nav-xshop.nav-progressive-content a:nth-child(11)");    // pharmacy
        clickOnWebElement("div.pui-text.medium-font.normal-font-weight.text-align-left.wrap-overflow.black-color");      // how it works

        List<String> list17 = pharmacy.getPharmacyListFromDB();
        for (String items : list17) {
            typeOnWebElementNHitEnter("#nav-bb-search", items);

        }
    }

    @Test
    public void newItems() throws Exception {
        clickOnWebElement("i.hm-icon.nav-sprite");
        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(3) a");
        List<String> list4 = newItems.getNewItemsFromDB();
        for (String items : list4) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void fireTablets() throws Exception {
        clickOnWebElement("i.hm-icon.nav-sprite");
        clickOnWebElement(".hmenu.hmenu-visible li:nth-child(10) a");
        List<String> list22 = fireTablets.getFireTabletsFromDB();
        for (String items : list22) {
            typeOnWebElementNHitEnter("#twotabsearchtextbox", items);
            clearInputField("#twotabsearchtextbox");
        }
    }

    @Test
    public void dropDownBar() {
        clickOnWebElement("div#nav-search-dropdown-card");
    }

    @Test
    public void selectCountrySection() {
        clickOnWebElement("div#nav-tools a:nth-child(1)");
        clickOnWebElement("i.a-icon.a-icon-radio");
        clickOnWebElement("input.a-button-input");          
    }

}
