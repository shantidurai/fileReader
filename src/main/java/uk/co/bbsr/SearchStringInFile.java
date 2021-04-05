package uk.co.bbsr;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.regex.Pattern;

public class SearchStringInFile {

    public void searchInFile(List<File> fileList, String searchString) {
        fileList.stream().parallel().forEach(file -> {
        System.out.println(Objects.nonNull(textSearch(file, searchString))?textSearch(file, searchString):"");
        });
    }

    public Path textSearch(File fileName, String searchString) {
        Path matchendPath[] = new Path[1];
        try {
            System.out.println("\tReading file: " + fileName);
            Path filePath = Paths.get(fileName.getAbsolutePath());
            Files.readAllLines(filePath)
                    .parallelStream()
                    .map(line -> line.split("\\s+"))
                    .flatMap(Arrays::stream)
                    .parallel()
                    .filter(w -> w.matches("\\w+"))
                    .forEach(word -> {
                        if (word.contains(searchString)) {
                            System.out.println("Match Found in file : " + filePath);
                            matchendPath[0] = filePath;
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return matchendPath[0];
    }
}