package com.courses.spalah.homework1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Татьяна on 31.08.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Tanya\\Java\\Courses\\courses-2-2016\\module13\\text.txt");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Строка для нахождений: ");
        String str = reader.readLine();
        TextAnalyzer textAnalyzer = new TextAnalyzer();
        textAnalyzer.findStrings(str, file);
    }
}
