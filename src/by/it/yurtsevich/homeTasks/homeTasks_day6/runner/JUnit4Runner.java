package by.it.yurtsevich.homeTasks.homeTasks_day6.runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import by.it.yurtsevich.homeTasks.homeTasks_day6.tests.BaseEngineerTest;
import by.it.yurtsevich.homeTasks.homeTasks_day6.tests.ExecuteTestTest;
import by.it.yurtsevich.homeTasks.homeTasks_day6.tests.InstabilityTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({BaseEngineerTest.class, ExecuteTestTest.class, InstabilityTest.class})
public class JUnit4Runner {
}