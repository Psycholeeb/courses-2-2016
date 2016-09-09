package com.courses.spalah;

import com.courses.spalah.Task1.TextAnalize;

import java.io.FileNotFoundException;

/**
 * Created by Artem Uskov on 01.09.2016.
 */
public class TextAnalizer {

    //private String[] args = new String[2];

    public static void main(String ... args) {

        //args[0] = "лет";
        //args[1] = "C:\\spalah\\courses-2-2016\\module13\\src\\main\\java\\com\\courses\\spalah\\Task1\\file.txt";
        String pathToFile = "C:\\spalah\\courses-2-2016\\module13\\src\\main\\java\\com\\courses\\spalah\\Task1\\file.txt";
        TextAnalize textAnalizer = new TextAnalize(args[0], pathToFile);
        try {
            System.out.println(textAnalizer.searchSequence());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
