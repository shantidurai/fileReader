package uk.co.bbsr;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


public class Application {
    public static void main(String[] args) {
        if (args.length == 1) {
            System.err.println("Please enter file names to be serached for");
            System.exit(0);
        } else if (args.length == 0) {
            System.err.println("Please enter search string");
            System.exit(0);
        }
        String userDirectory = System.getProperty("user.dir");

        //Assume first argument is the search string.
        String searchString = args[0];
        //Assume second argument onwards is the list of input files.
        List<File> fileList = new ArrayList<File>();
        for (int i = 1; i < args.length; i++) {
            String fileName = userDirectory + "\\resource\\" + args[i];
            File file = new File(fileName);
            fileList.add(file);
        }
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        searchStringInFile.searchInFile(fileList, searchString );
    }
}