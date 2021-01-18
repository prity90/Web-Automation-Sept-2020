package datasuply;

import datasources.ConnectToSqlDB;

import java.util.List;

public class PrimeVideo {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getPrimVideoFromDB() throws Exception {
        List<String> list19 = connectToSqlDB.readDataBase("PrimeVideo", "Items");
        return list19;
    }
}
