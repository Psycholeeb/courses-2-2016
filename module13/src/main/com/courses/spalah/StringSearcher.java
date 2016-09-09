package main.com.courses.spalah;
import java.io.*;
/**
 * Created by Роман on 01.09.2016.
 */
public class StringSearcher {
    public static void main(String []args) {
        String findMe = "лет";
        String pathToFile = "D:/Java/courses-2-2016/module13/src/main/com/courses/spalah/1.txt";//
        String SearchHere = "";
        try(FileReader reader = new FileReader(pathToFile))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1)
                SearchHere += (char)c;
            //System.out.println(SearchHere);
            String [] Searchlines = SearchHere.split("\\n");
            for(int i =0;i<Searchlines.length;i++) {
                if(Searchlines[i].contains(findMe)) {
                    System.out.println(Searchlines[i]);
                }
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
