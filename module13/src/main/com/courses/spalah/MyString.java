package main.com.courses.spalah;

import java.util.ArrayList;

/**
 * Created by Роман on 01.09.2016.
 */
public class MyString {
    ArrayList<String> chars = new ArrayList<String>();
    public MyString(String... args) {
        for(int i =0;i<args.length;i++) {
            this.chars.add(i,args[i]);
        }
    }
    public void print() {
        for (String item : chars) {
            System.out.print(item);
        }
        System.out.println("");
    }
    public void reverse () {
        if(chars.size() <=0)
            return;
        String[] reverseArray = new String [chars.size()] ;
        for(int i=0;i<reverseArray.length;i++) {
            reverseArray[i] = chars.get(i);
        }
        chars.clear();
        int j = reverseArray.length-1;
        for(int i = 0;i<reverseArray.length;i++) {
            chars.add(i,reverseArray[j]);
            j--;
        }
    }
    public int length () {
        return chars.size();
    }
    public String getByIndex(int index) {
        return chars.get(index);
    }
}
