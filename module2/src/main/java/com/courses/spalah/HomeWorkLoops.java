package com.courses.spalah;

/**
 * Модифицируйте этот класс(файл)
 *
 * @author Ievgen Tararaka
 */
public class HomeWorkLoops {
    /**
     * Метод должен вернуть минимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=3 при заданном массиве=[5, 4, 3, 4, 5]
     *
     * @param integers заданный массив типа int[]
     * @return минимальное число из массива
     */
    public static int min(int[] integers) {
        int var1 = integers[0];
        for(int i=0;i<integers.length;i++){
            if(var1 > integers[i])
                var1 = integers[i];
        }
        return var1;
    }

    /**
     * Метод должен вернуть максимальное число
     * из заданного массива.
     * <p>Например:
     * вернуть число=6.0 при заданном массиве=[5.1, 4.33, 3.0, 6.0, 5.999]
     *
     * @param doubles заданный массив типа double[]
     * @return максимальное число из массива
     */
    public static double max(double[] doubles) {
        double var1 = doubles[0];
        for(int i=0;i<doubles.length;i++){
            if(var1 < doubles[i])
                var1 = doubles[i];
        }
        return var1;
    }

    /**
     * Метод должен вернуть среднее арифмитическое число
     * из заданного массива.
     * <p>Например:
     * вернуть число=8.0 при заданном массиве=[1, 3, 8, 10, 25, 1]
     *
     * @param shorts заданный массив типа short[]
     * @return среднее арифмитическое число из массива
     */
    public static float average(short[] shorts) {
        float var1 = 0;
        for(int i=0;i<shorts.length;i++)
            var1+=shorts[i];
        //System.out.println(var1);
        return var1/shorts.length;
    }

    /**
     * Метод должен перевернуть массив.
     * <p>Например:
     * вернуть массив=[f, e, d, c, b, a] из заданного массива=[a, b, c, d, e, f]
     *
     * @param chars заданный массив типа char[]
     * @return перевернутый массив
     */
    public static char[] reverse(char[] chars) {
        char[] massiv = new char[chars.length] ;
        for(int i=0;i<chars.length;i++) {
            massiv[i] = chars[(chars.length-1) - i];
        }
        /*System.out.println("hello!!!!");
        System.out.println(chars.toString());
        System.out.println(massiv.toString());*/

        return massiv;
    }
}
