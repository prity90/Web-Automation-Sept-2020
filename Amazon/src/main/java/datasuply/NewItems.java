package datasuply;
import datasources.ConnectToSqlDB;
import java.util.List;
public class NewItems {
    ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
    public List<String> getNewItemsFromDB() throws Exception {
        List<String> list4 = connectToSqlDB.readDataBase("NewReleases", "Items");
        return list4;
    }
}
