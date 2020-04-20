package by.it.yurtsevich.homeTasks.homeTask_day4.worker;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.ATest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;

public class AutomationEngineer extends Engineer {
    public AutomationEngineer() {
        this.setSkill(skill);
    }

    @Override
    public Result executeTest(ATest test) {
        return test.apply(this);

    }
}
