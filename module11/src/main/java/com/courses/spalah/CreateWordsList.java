package com.courses.spalah;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Artem Uskov on 22.08.2016.
 */
public class CreateWordsList {

    private static ArrayList<String> stringArrayList = new ArrayList<>();

    public static ArrayList<String> createArrayList(String input) throws IOException {
        String str = String.join("\n", Files.readAllLines(Paths.get(input)));
        ArrayList<String> stringArrayList = new ArrayList<String>(Arrays.asList(str.split("\\s")));
        for(int i = 0; i < stringArrayList.size(); i++) {
            if(stringArrayList.get(i).equals("") || (stringArrayList.get(i).equals("\n"))){
                stringArrayList.remove(i);
            }
            if(stringArrayList.get(i).endsWith(",") | stringArrayList.get(i).endsWith(".")) {
                stringArrayList.set(i, stringArrayList.get(i).substring(0, stringArrayList.get(i).length() - 1));
            }
            stringArrayList.set(i, stringArrayList.get(i).toLowerCase());
        }

        return stringArrayList;
    }
}
