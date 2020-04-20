package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.AutomatedTest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.ManualTest;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.Result;
import by.it.yurtsevich.homeTasks.homeTask_day4.entity.TestLevel;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.AutomationEngineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.Engineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class FirstTest {
    private Engineer engineer;

    public FirstTest(Engineer engineer) {
        this.engineer = engineer;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer()},
                {new AutomationEngineer()}
        });
    }
    @Test
    public void automatedTestFailed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.GUI, 12);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("AutomationTest, GUI(9), instability 12", Result.FAILED, automatedTest.apply(automationEngineer));
    }

    @Test
    public void automatedTestPassed() {
        AutomatedTest automatedTest = new AutomatedTest(TestLevel.API, 3);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("AutomationTest, API(3), instability 3", Result.PASSED, automatedTest.apply(testEngineer));
    }

    @Test
    public void manualTestFailed() {
        ManualTest manualTest = new ManualTest(TestLevel.API, 11);
        AutomationEngineer automationEngineer = new AutomationEngineer();
        Assert.assertEquals("ManualTest, API(3), instability 11", Result.FAILED, manualTest.apply(automationEngineer));
    }

    @Test
    public void manualTestPassed() {
        ManualTest manualTest = new ManualTest(TestLevel.UNIT, 1);
        TestEngineer testEngineer = new TestEngineer();
        Assert.assertEquals("ManualTest, UNIT(1), instability 1", Result.PASSED, manualTest.apply(testEngineer));
    }
}

