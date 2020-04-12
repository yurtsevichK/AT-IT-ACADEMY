package by.it.yurtsevich.homeTasks.homeTask_day3;

public class EngineerAutomation extends Person implements codeAble {

    public EngineerAutomation(String name, String surname, int age) {
        super(age);
    }

    public void testsAble() {
        System.out.println("Выполнить тест");
    }
}

