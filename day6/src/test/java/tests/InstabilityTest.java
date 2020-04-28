package tests;

import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.AutomatedTest;
import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.ManualTest;
import by.it.yurtsevich.homeTasks.homeTasks_day6.entity.TestLevel;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class InstabilityTest {
    private final by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Test test;
    private final int expected;

    public InstabilityTest(by.it.yurtsevich.homeTasks.homeTasks_day6.entity.Test test, int expected) {
        this.test = test;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> primeNumbers() {
        return Arrays.asList(new Object[][]{
                {new ManualTest(TestLevel.UNIT, 0), 1},
                {new ManualTest(TestLevel.API, 1), 1},
                {new AutomatedTest(TestLevel.API, 10), 10},
                {new AutomatedTest(TestLevel.GUI, 11), 10},
        });
    }

    @Test
    public void verifyInstability() {
        Assert.assertEquals("Test instability is not correct!", expected, test.getInstability());
    }
}