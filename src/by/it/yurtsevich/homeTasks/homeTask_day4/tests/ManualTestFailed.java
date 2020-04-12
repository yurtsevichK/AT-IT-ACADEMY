package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.ManualTest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.TestLevel;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualTestFailed {
    @Test
    public void manualTestFailed() {
        ManualTest manualTest = new ManualTest(TestLevel.API, 11);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("ManualTest, API(3), instability 11", Result.FAILED, manualTest.apply(automationEngineer));
    }
}
