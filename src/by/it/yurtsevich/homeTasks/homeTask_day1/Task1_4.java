package by.it.yurtsevich.homeTasks.homeTask_day1;

import java.util.Arrays;
import java.util.Scanner;

public class Task1_4 {
    // 4. Пройти по массиву и поменять местами каждые 2 соседних элемента.
    // Пример:
    public static void main(String[] args) {
        System.out.println("Размер массива: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Массив" + Arrays.toString(array));
        System.out.println();
        System.out.println(Arrays.toString(changeIndex(array, 0, 1, 2, 3)));
    }

    public static int[] changeIndex(int[] array, int firstIndex, int secondIndex, int thirdIndex, int fourthIndex) {
        int a;
        int b;
        a = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = a;
        b = array[thirdIndex];
        array[thirdIndex] = array[fourthIndex];
        array[fourthIndex] = b;

        return array;
    }
}