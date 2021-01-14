package sarch;

import base.CommonAPI;
import datasuply.DataReader;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import search.SearchItems;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class TestSearch extends CommonAPI {
    DataReader dataReader = new DataReader();
    @Test
    public void test1() throws Exception {
        List<String> list = dataReader.grtItemListFromDB();
        for (String items:list)
        typeOnWebElementEnter("#twotabsearchtextbox", "items");
        clearInputField("#twotabsearchtextbox");
    }
}
