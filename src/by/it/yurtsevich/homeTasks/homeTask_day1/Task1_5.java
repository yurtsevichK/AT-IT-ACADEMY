package by.it.yurtsevich.homeTasks.homeTask_day1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_5 {
    // Циклически сдвинуть все элементы вправо на 2 позиции (1-й элемент станет 3-м, 2-й станет 4-м и т.д.)
    // Пример:
    public static int[] cycle(int[] inArray, int shift) {
        if ((inArray == null) || (inArray.length == 0) || (shift <= 0)) {
            throw new IllegalArgumentException();
        }
        while (shift > 0) {
            int lastVar = inArray[inArray.length - 1];
            for (int counter = 0; counter < inArray.length; counter++) {
                int curVal = inArray[counter];
                inArray[counter] = lastVar;
                lastVar = curVal;
            }
            shift--;
        }
        return inArray;
    }

    public static void main(String[] args) {
        System.out.println("Размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив" + Arrays.toString(array));

        array = cycle(array, 2);
        for (int value : array) System.out.print(value + " ");
    }
}