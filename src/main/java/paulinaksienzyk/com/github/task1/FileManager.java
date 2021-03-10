package paulinaksienzyk.com.github.task1;

import java.io.File;
import java.util.Arrays;

/**
 * Below are 3 methods you need to implement. Two of them will allow you to see some quick ways to get files in a given
 * folder. And just read the file. Again.
 *
 * Your next task is task2, start with {@code SimpleScanner} class.
 */
public class FileManager {

    public static void main(String[] args) {

        File dir = new File("src/main/resources");

        String[] namesOfAllFiles = getNamesOfAllFiles(dir);
        System.out.println("Names of all files in resources: " + Arrays.toString(namesOfAllFiles));

        String[] namesOfTextFiles = getNamesOfAllTextFiles(dir);
        System.out.println("Names of text files in resources: " + Arrays.toString(namesOfTextFiles));

        File file = new File("src/main/resources/example.txt");
        String exampleContent = readFile(file);
        System.out.println(exampleContent);
    }

    /**
     * @param dir where we want to find files/folders
     * @return an array of the names of all files in this folder
     */
    static String[] getNamesOfAllFiles(File dir){
        // TODO 1. Find all files in specific dir. Tip: see File API and its methods.
        return null;
    }

    /**
     * @param dir where we want to find files/folders
     * @return an array of the names of text files in this folder
     */
    static String[] getNamesOfAllTextFiles(File dir) {
        // TODO 2. Find all files with .txt extension in specific dir. Use FilenameFilter.
        return null;
    }

    /**
     * @param file we want to read
     * @return content of the file
     */
    static String readFile(File file) {
        // TODO 3. Again and again we read the file! We will be champions, winners, top dogs, hot dogs.. ehm ;-)
        return null;
    }
}
