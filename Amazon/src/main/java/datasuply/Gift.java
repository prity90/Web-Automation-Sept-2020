package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class Gift {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();

    public List<String> getGiftFromDB() throws Exception {
        List<String> list11 = connectToSqlDB.readDataBase("Gift", "Items");
        return list11;
    }
}