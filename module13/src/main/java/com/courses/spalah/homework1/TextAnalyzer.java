package com.courses.spalah.homework1;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by Татьяна on 31.08.2016.
 */
public class TextAnalyzer {
    public ArrayList<String> findStrings(String str, File file) {
        ArrayList<String> stringsList = new ArrayList<>();
        try (Reader reader = new InputStreamReader(new FileInputStream(file), "Cp1251")) {
            char[] buffer = new char[(int) file.length()];
            reader.read(buffer);
            String text = new String(buffer);

            String[] strings = text.split("\n");
            for (String s : strings) {
                String[] words = s.toLowerCase().split(" ");
                for (String w : words) {
                    if (w.contains(str)) {
                        stringsList.add(s);
                        break;
                    }
                }
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        for (String s : stringsList) {
            System.out.println(s);
        }
        return stringsList;
    }
}
