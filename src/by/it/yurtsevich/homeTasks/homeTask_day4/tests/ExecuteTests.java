package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.entity.*;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.AutomationEngineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.Engineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.TestEngineer;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static by.it.yurtsevich.homeTasks.homeTask_day4.entity.TestLevel.*;

@RunWith(Parameterized.class)
public class ExecuteTests {

    private Engineer engineer;
    private ATest test;
    private int skill;
    private Result expected;

    public ExecuteTests(Engineer engineer, int skill, ATest test, Result expected) {
        this.engineer = engineer;
        this.test = test;
        this.skill = skill;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new TestEngineer(), 1, new ManualTest(UNIT, 5), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(UNIT, 5), Result.PASSED},
                {new TestEngineer(), 1, new ManualTest(API, 9), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(API, 9), Result.PASSED},
                {new TestEngineer(), 1, new ManualTest(GUI, 5), Result.PASSED},
                {new TestEngineer(), 10, new ManualTest(GUI, 5), Result.PASSED},
        });
    }

    @Test
    public void verifyExecuteTest() {
        engineer.setSkill(skill);
        Assert.assertEquals("Engineer Anxiety is not correct!", expected, engineer.executeTest(test));
    }
}