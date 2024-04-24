package org.okten.javacore;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOldDemo {

    public static void main(String[] args) {
        String pathToFile = "resources/text.txt";

        System.out.println("-- Reading from file...");
        readFromFileWithAutoClose(pathToFile);

        System.out.println("-- Writing to file...");
        writeToFile(pathToFile, "test1\n");

        System.out.println("-- Reading from file...");
        readFromFileWithManualClose(pathToFile);
    }

    private static void readFromFileWithAutoClose(String path) {
        File file = new File(path);

        // try-with-resources
        try (FileInputStream fileInputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(fileInputStream)) {
//            String content = dataInputStream.readUTF();
            String content = String.valueOf(dataInputStream.readInt());
//            byte[] bytes = fileInputStream.readAllBytes();
//            String content = new String(bytes);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("unable to read file at " + path);
        }
    }

    private static void readFromFileWithManualClose(String path) {
        File file = new File(path);

        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
            byte[] bytes = fileInputStream.readAllBytes();
            String content = new String(bytes);
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("unable to read file at " + path);
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void writeToFile(String path, String content) {
        File file = new File(path);
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
            byte[] bytes = content.getBytes();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (IOException e) {
            System.out.println("unable to write to file at " + path);
        }
    }
}
