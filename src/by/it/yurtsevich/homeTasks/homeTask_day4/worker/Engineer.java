package by.it.yurtsevich.homeTasks.homeTask_day4.worker;


import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.ATest;

public abstract class Engineer {

    public int skill = (int) (Math.random() * 10) + 1;

    public int anxiety = 3;

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public int getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(int anxiety) {
        this.anxiety = anxiety;
    }

    public Result executeTest(ATest test) {
        return (test.apply(this));
    }
}
