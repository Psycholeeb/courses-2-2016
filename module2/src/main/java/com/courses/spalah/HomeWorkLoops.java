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
        int minElem = integers[0];
        for (int i = 0; i < integers.length; i++) {
            if (minElem > integers[i]) {
                minElem = integers[i];
            }
        }
        return minElem;
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
        double maxElem = doubles[0];
        for (int i = 0; i < doubles.length; i++) {
            if (maxElem < doubles[i]) {
                maxElem = doubles[i];
            }
        }
        return maxElem;
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
        int sum = 0;
        int i = 0;
        while (i < shorts.length) {
            sum += shorts[i];
            i++;
        }
        return sum / shorts.length;
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
        int i = 0;
        do {
            char tmp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = tmp;
            i++;
        } while (i < chars.length/2);
        return chars;
    }
}
