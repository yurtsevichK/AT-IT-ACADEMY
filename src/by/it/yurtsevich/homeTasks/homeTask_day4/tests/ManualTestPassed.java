package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.ManualTest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.TestLevel;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;

public class ManualTestPassed {
    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 1);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("ManualTest, UNIT(1), instability 1", Result.PASSED, manualTest.apply(testEngineer));
    }
}
