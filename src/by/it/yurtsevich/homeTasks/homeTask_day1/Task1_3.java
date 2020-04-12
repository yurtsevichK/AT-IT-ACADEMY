package by.it.yurtsevich.homeTasks.homeTask_day1;

public class Task1_3 {
    // Используя for вывести каждое четное число от 2 до 20 включительно и больше 10.
    // Пример: от 2 до 20
    public static void main(String[] args) {
        for (int i = 2; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        // Пример: от 10 до 20
        for (int i = 10; i < 21; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
