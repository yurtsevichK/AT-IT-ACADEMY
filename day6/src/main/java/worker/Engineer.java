package worker;

import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Result;
import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Test;

import java.util.concurrent.ThreadLocalRandom;

public abstract class Engineer extends by.it.yurtsevich.homeTasks.homeTasks_day6.worker.Engineer {
    private int anxiety = 3;
    private int skill;

    public int getAnxiety() {
        return anxiety;
    }

    public void setAnxiety(int anxiety) {
        this.anxiety = anxiety;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void setRandomSkill() {
        this.skill = ThreadLocalRandom.current().nextInt(1, 11);
    }

    public Result executeTest(Test test) {
        return test.apply(this);
    }
}