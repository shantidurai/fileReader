package uk.co.bbsr;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;

import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SearchStringInFileTest {

    @Mock
    private SearchStringInFile searchStringInFile;



    @org.junit.jupiter.api.Test
    void searchInFile1() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = "C:\\Users\\shanti.durai\\fileReader\\resource\\sample1.txt";
        assertEquals(searchStringInFile.textSearch(new File(fileName),"test"), Paths.get(fileName));
    }

    @org.junit.jupiter.api.Test
    void searchInFile2() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = "C:\\Users\\shanti.durai\\fileReader\\resource\\sample2.txt";
        assertNull(searchStringInFile.textSearch(new File(fileName),"test"));
    }

    @org.junit.jupiter.api.Test
    void searchInFile3() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = "C:\\Users\\shanti.durai\\fileReader\\resource\\sample3.txt";
        assertEquals(searchStringInFile.textSearch(new File(fileName),"test"), Paths.get(fileName));
    }

    @org.junit.jupiter.api.Test
    void searchInFile4() {
        SearchStringInFile searchStringInFile = new SearchStringInFile();
        String fileName = "C:\\Users\\shanti.durai\\fileReader\\resource\\sample3.txt";
        assertNotEquals(searchStringInFile.textSearch(new File(fileName),"sample"), Paths.get(fileName));
    }


}