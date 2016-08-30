package com.courses.spalah;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by Artem Uskov on 18.08.2016.
 */
public class TokensCount {

    public void calculateTokens(String input, FileWriter writer) throws IOException{
        FileReader reader = new FileReader(input);
        Scanner sc = new Scanner(reader);
        int tokensCount = 0;
        while(sc.hasNextLine()) {
            String line = sc.nextLine();
            for(int i = 0; i < line.length(); i++) {
                if(line.charAt(i) != ' ') {
                    tokensCount++;
                }
            }
        }
        writer.append("Tokens quantity - " + Integer.toString(tokensCount));
        writer.append("\n");
        writer.flush();
    }
}
