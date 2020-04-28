package tests;

import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.AutomatedTest;
import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.ManualTest;
import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Result;
import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.TestLevel;
import by.it.yurtsevich.homeTasks.homeTasks_day6.worker.AutomationEngineer;
import by.it.yurtsevich.homeTasks.homeTasks_day6.worker.Engineer;
import by.it.yurtsevich.homeTasks.homeTasks_day6.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ExecuteTestTest {
    private final Engineer engineer;
    private final int skill;
    private final by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Test test;
    private final Result expected;

    public ExecuteTestTest(Engineer engineer, int skill, by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Test test, Result expected) {
        this.engineer = engineer;
        this.skill = skill;
        this.test = test;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.UNIT, 1), Result.PASSED},
                {new AutomationEngineer(), 10, new AutomatedTest(TestLevel.GUI, 0), Result.PASSED},
                {new TestEngineer(), 1, new ManualTest(TestLevel.API, 0), Result.PASSED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.UNIT, 0), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(TestLevel.UNIT, 10), Result.PASSED},
                {new TestEngineer(), 10, new AutomatedTest(TestLevel.API, 11), Result.PASSED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.GUI, 10), Result.FAILED},
                {new TestEngineer(), 1, new ManualTest(TestLevel.GUI, 11), Result.FAILED},
                {new TestEngineer(), 1, new AutomatedTest(TestLevel.API, 0), Result.PASSED},
                {new AutomationEngineer(), 1, new AutomatedTest(TestLevel.UNIT, 11), Result.PASSED},
                {new AutomationEngineer(), 10, new AutomatedTest(TestLevel.API, 1), Result.PASSED},
                {new AutomationEngineer(), 1, new ManualTest(TestLevel.API, 10), Result.FAILED},
                {new AutomationEngineer(), 10, new ManualTest(TestLevel.GUI, 11), Result.PASSED},
                {new AutomationEngineer(), 1, new ManualTest(TestLevel.GUI, 1), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(TestLevel.API, 1), Result.PASSED},
                {new AutomationEngineer(), 10, new AutomatedTest(TestLevel.API, 10), Result.PASSED},
        });
    }

    @Test
    public void verifyExecuteTest() {
        engineer.setSkill(skill);
        Assert.assertEquals("Engineer anxiety is not correct!", expected, engineer.executeTest(test));
    }
}