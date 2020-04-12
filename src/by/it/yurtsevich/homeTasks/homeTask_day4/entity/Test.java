package by.it.yurtsevich.homeTasks.homeTask_day4.entity;

import by.it.yurtsevich.homeTasks.homeTask_day4.worker.AutomationEngineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.Engineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.TestEngineer;

import java.util.function.Function;

public abstract class Test implements Function<Engineer, Result> {
    int complexity;
    int instability;

    public int getComplexity() {
        return complexity;
    }

    public void setComplexity(int complexity) {
        this.complexity = complexity;
    }

    public int getInstability(int instability) {
        return instability;
    }

    public void setInstability(int instability) {
        this.instability = instability;
    }

    public Test(TestLevel testLevel) {
        this.complexity = testLevel.COMPLEXITY;
    }

    @Override
    public Result apply(Engineer engineer) {
        int anxiety;
        if ((this instanceof ManualTest && engineer instanceof AutomationEngineer) ||
                (this instanceof AutomatedTest && engineer instanceof TestEngineer)) {
            anxiety = engineer.getAnxiety();
        } else {
            anxiety = 1;
        }
        if (complexity * instability * anxiety > 30) {
            return Result.FAILED;
        } else {
            return Result.PASSED;
        }
    }
}