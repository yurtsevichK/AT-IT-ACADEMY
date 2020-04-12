package by.it.yurtsevich.homeTasks.homeTask_day3;

public class EngineerManual extends Person implements codeAble {

    public EngineerManual(String name, String surname, int age) {
        super(age);
    }

    public void testsAble() {
        System.out.println("Выполнить тест");
    }
}

