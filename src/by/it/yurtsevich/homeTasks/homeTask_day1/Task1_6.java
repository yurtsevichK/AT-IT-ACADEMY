package by.it.yurtsevich.homeTasks.homeTask_day1;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task1_6 {
    /*Используя Collection и Stream создать из массива коллекцию,
    отфильтровать оставив только четные числа,
    и вывести каждое число от 2 до 20 включительно и больше 10 в порядке по возрастанию.*/
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
        Arrays.stream(array).boxed().filter(x -> x % 2 == 0 && x > 10 && x < 21).sorted().collect(Collectors.toList())
                .forEach(System.out::print);
    }
}