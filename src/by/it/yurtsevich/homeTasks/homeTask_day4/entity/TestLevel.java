package by.it.yurtsevich.homeTasks.homeTask_day4.entity;

public enum TestLevel {
    UNIT(1),
    API(3),
    GUI(9);
    public int COMPLEXITY;

    TestLevel(int COMPLEXITY) {
        this.COMPLEXITY = COMPLEXITY;
    }

}
