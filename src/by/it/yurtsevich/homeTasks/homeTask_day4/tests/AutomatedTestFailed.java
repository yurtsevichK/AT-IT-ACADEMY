package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.AutomatedTest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.TestLevel;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.AutomationEngineer;
import org.junit.Assert;
import org.junit.Test;

public class AutomatedTestFailed {
    @Test
    public void automatedTestFailed(){
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI,10);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("AutomationTest, GUI(9), instability 10", Result.FAILED, automatedTest.apply(automationEngineer));

    }
}
