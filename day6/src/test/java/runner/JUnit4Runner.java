package runner;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import tests.BaseEngineerTest;
import tests.ExecuteTestTest;
import tests.InstabilityTest;

@RunWith(Suite.class)
@Suite.SuiteClasses({BaseEngineerTest.class, ExecuteTestTest.class, InstabilityTest.class})
public class JUnit4Runner {
}