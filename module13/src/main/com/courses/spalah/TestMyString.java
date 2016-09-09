package main.com.courses.spalah;

/**
 * Created by Роман on 01.09.2016.
 */
public class TestMyString {
    public static void main(String []args) {
        /*StringBuffer sb = new StringBuffer("Котэ");
        System.out.println("Длина: " + sb.length());*/
        MyString string = new MyString("a","b","c","d");
        string.print();
        string.reverse();
        string.print();
        System.out.println(string.length());
        System.out.println(string.getByIndex(0));
    }
}
