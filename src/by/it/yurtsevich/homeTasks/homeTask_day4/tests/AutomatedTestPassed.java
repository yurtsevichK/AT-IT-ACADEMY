package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.AutomatedTest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.TestLevel;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.TestEngineer;
import org.junit.Test;
import org.junit.Assert;

public class AutomatedTestPassed {
    @Test
    public void automatedTestPassed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 3);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("AutomationTest, API(3), instability 3", Result.PASSED, automatedTest.apply(testEngineer));
    }
}
