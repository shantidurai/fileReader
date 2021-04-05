package uk.co.bbsr;

import java.io.File;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;

class SearchStringInFileTest {
    private String userDirectory = System.getProperty("user.dir");
    @org.junit.jupiter.api.Test
    void searchInFile1() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = userDirectory + "\\resource\\sample1.txt";
        assertEquals(searchStringInFile.textSearch(new File(fileName),"test"), Paths.get(fileName));
    }

    @org.junit.jupiter.api.Test
    void searchInFile2() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = userDirectory + "\\resource\\sample2.txt";
        assertNull(searchStringInFile.textSearch(new File(fileName),"test"));
    }

    @org.junit.jupiter.api.Test
    void searchInFile3() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = userDirectory + "\\resource\\sample3.txt";
        assertEquals(searchStringInFile.textSearch(new File(fileName),"test"), Paths.get(fileName));
    }

    @org.junit.jupiter.api.Test
    void searchStringNotInFile3() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = userDirectory + "\\resource\\sample3.txt";
        assertNotEquals(searchStringInFile.textSearch(new File(fileName),"sample"), Paths.get(fileName));
    }
}