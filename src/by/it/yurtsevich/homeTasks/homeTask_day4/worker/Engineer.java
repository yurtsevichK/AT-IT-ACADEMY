package by.it.yurtsevich.homeTasks.homeTask_day4.worker;


import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Test;

public abstract class Engineer {
    public int a = 0;
    public int b = 10;

    public int skill;
    public int anxiety = 3;

    public int getSkill() {
        return skill;
    }

    public void setSkill() {
        this.skill = a + (int) (Math.random() * b);
    }

    public int getAnxiety() {
        return anxiety;
    }

    public Result executeTest(Test test) {
        return null;
    }
}
