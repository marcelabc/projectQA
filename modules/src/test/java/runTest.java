import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import static com.liferay.gs.testFramework.SeleniumReadPropertyKeys.DRIVER;
import static com.liferay.gs.testFramework.SeleniumWaitMethods.waitMediumTime;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "modules/src/test/resources",
        glue = {"steps"},
        plugin = {"pretty", "html:reports/cucumber"}
	)
public class runTest {

	  @AfterClass
	  public static void afterClass() throws Exception {
	    isRunnedFromAllTestsSuite = false;
	    closeDriver();
	  }

	  @BeforeClass
	  public static void beforeClass() throws Exception {
	    isRunnedFromAllTestsSuite = true;
	  }

	  public static void closeDriver() {
	    if (isRunnedFromAllTestsSuite == false) {
	      DRIVER.close();
	      waitMediumTime();
	      waitMediumTime();
	      waitMediumTime();
	      DRIVER.quit();
	    }
	  }

	  public static Boolean isRunnedFromAllTestsSuite = false;

}
