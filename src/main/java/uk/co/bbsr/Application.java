package uk.co.bbsr;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Application {
    private static final Class<Application> applicationClass = Application.class;

    public static void main(String[] args) {
        if (args.length > 0 && args.length < 2) {
            System.err.println("Please enter file names");
            System.exit(0);
        } else if (args.length == 0) {
            System.err.println("Please enter search string");
            System.exit(0);
        }

        String searchString = args[0];

        List<File> fileList = new ArrayList<File>();
        for (int i = 1; i < args.length; i++) {
            String fileName = "C:\\Users\\shanti.durai\\fileReader\\resource\\" + args[i];
            File file = new File(fileName);
            fileList.add(file);
        }
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        searchStringInFile.searchInFile(fileList, searchString );
    }
}