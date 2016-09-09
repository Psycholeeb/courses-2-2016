package com.courses.spalah.Task1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class TextAnalize {

    private String inputText;
    private String pathToFile;

    public TextAnalize(String inputText, String pathToFile) {
        this.inputText = inputText;
        this.pathToFile = pathToFile;
    }

    public String searchSequence() throws FileNotFoundException {
        File file = new File(pathToFile);
        Scanner scanner = new Scanner(file);
        String returnString = "";
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if(line.contains(inputText)) {
                returnString += line + "\n";
            }
        }
        return returnString;
    }
}
