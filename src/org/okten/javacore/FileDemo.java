package org.okten.javacore;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Collection;
import java.util.Set;

public class FileDemo {

    public static void main(String[] args) {
        String pathToFile = "resources/text.txt";

        System.out.println("-- Reading from file...");
        readFromFile(pathToFile);

        System.out.println("-- Writing to file...");
        writeToFile(pathToFile, Set.of("line1", "line2", "line3"));

        System.out.println("-- Reading from file...");
        readFromFile(pathToFile);
    }

    private static void writeToFile(String pathToFile, Collection<String> content) {
        Path path = Paths.get(pathToFile);

        try {
            Files.write(path, content, StandardOpenOption.APPEND);
        } catch (IOException e) {
            System.out.println("Unable to write to file at " + pathToFile);
        }
    }

    private static void readFromFile(String pathToFile) {
        Path path = Paths.get(pathToFile);

        try {
            String fileContent = Files.readString(path);
            System.out.println(fileContent);
        } catch (IOException e) {
            System.out.println("Unable to read file at " + pathToFile);
        }
    }
}
