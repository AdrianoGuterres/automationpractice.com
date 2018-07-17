package guterres.adriano.testsuites;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import guterres.adriano.ressources.Report;
import guterres.adriano.testcases.ChromeBuyTheFirstProductCorrectlyTestCase;
import guterres.adriano.testcases.FirefoxBuyTheFirstProductCorrectlyTestCase;

@RunWith(Suite.class)
@SuiteClasses({ 
	ChromeBuyTheFirstProductCorrectlyTestCase.class,
	FirefoxBuyTheFirstProductCorrectlyTestCase.class
	})
public class AllTests {


	@BeforeClass
	public static void startTests() {

		System.out.println("The tests were started!");
		Report.create("automationpractice.com", "Test Case");
	}

	@AfterClass
	public static void endTests() {

		System.out.println("The tests are over!");
		Report.close();
	}

}
