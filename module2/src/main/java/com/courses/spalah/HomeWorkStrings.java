package com.courses.spalah;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWorkStrings {
    /**
     * Метод должен вернуть количество четных чисел в строке.
     * <p>Например:
     * дана строка - 1_4_8_11_22, ответ - 3
     *
     * @param s строка типа число1_число2_число3_число4
     * @return количество четных числе в строке
     */
    public static int countEvenInString(String s) {
        String[] new_array = s.split("_");
        int j = 0;
        for(int i=0;i<new_array.length;i++) {
            if((Integer.parseInt(new_array[i])%2) == 0)
                j++; //System.out.println(Integer.parseInt(new_array[i])%2);
        }
        return j;
    }
    //hello!!
	//Hello after changin origin2 to origin3!
//<<<<<<< HEAD
	//Master
//=======
	//Hello from branch2!
//>>>>>>> branch2
    /**
     * Метод должен удалить указанный символ из строки (кроме случая, если
     * символ находится на первой, последней или срединной позиции)
     * <p>Например:
     * данна строка - xabxxxx, символ - x, ответ - xabx
     *
     * @param symbol символ который необходимо удалить
     * @param s      исходная строка
     * @return результирующая строка
     */
    public static String removeSymbolFromString(String symbol, String s) {
        int center = 0;
        String[] new_array = s.split("");
        String s1 = "";
        center = new_array.length/2;
        s1 = new_array[0];
        for(int i =1;i<new_array.length-1;i++)
            if(new_array[i] == symbol && i != center)
                s1 += "";
        else
                s1 += new_array[i];
        s1 += new_array[new_array.length-1];
        return s1;
    }
}
