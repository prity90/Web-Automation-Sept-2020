package testTableData;

import org.testng.annotations.Test;
import table.SqlTablePage;

public class TestTableData extends SqlTablePage {
    @Test
    public void readWebText(){
        readTableData();
    }
}
