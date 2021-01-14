package datafetch;

import datasources.ConnectToExcelFile;

import java.io.IOException;

public class FetchTheSteps {
    ConnectToExcelFile excelFile = new ConnectToExcelFile();

    public String[] getDataFromExcelFile() throws IOException, IOException {
        String path = System.getProperty("C:\\Users\\Prity\\IdeaProjects\\Web-Automation-Sept-2020")+"/data/nyp-test-steps.xls";
        String [] data = excelFile.fileReader2(path, 0);

        return data;
    }
}
