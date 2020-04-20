package by.it.yurtsevich.homeTasks.homeTask_day4.tests;

import by.it.yurtsevich.homeTasks.homeTask_day4.worker.AutomationEngineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.Engineer;
import by.it.yurtsevich.homeTasks.homeTask_day4.worker.TestEngineer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class EngineerTest {
    private Engineer engineer;

    public EngineerTest(Engineer engineer) {
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
    public void checkAnxiety() {
        assertEquals("anxiety=3", 3, 3);
    }

    @Test
    public void setSkill() {

    }
}