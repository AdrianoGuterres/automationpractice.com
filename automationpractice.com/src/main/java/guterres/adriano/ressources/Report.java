package guterres.adriano.ressources;

import java.io.IOException;
import java.net.InetAddress;
import java.time.LocalDateTime;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class Report { 
	private static final String DEFAULT_DESCRIPTION = "Test DBServer";
	private static final String DEFAULT_PATH = "./reports/report_%s.html";
	private static ExtentReports exReport;
	private static ExtentTest logger;
	
	public static void create(String title, String description) {
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(String.format(DEFAULT_PATH, LocalDateTime.now().getNano()));
		
		htmlReporter.config().setChartVisibilityOnOpen(true);
		htmlReporter.config().setDocumentTitle("Results Report"); 
		htmlReporter.config().setReportName("Automatized Test Cycle");
		
		exReport = new ExtentReports();
		exReport.attachReporter(htmlReporter);
		exReport.setSystemInfo("OS: "            , System.getProperty("os.name"));
		exReport.setSystemInfo("OS Version: "    , System.getProperty("os.version"));
		exReport.setSystemInfo("OS Architecture:", System.getProperty("os.arch"));
		exReport.setSystemInfo("Java Version: "  , System.getProperty("java.version"));		
   try {exReport.setSystemInfo("IP Address: "    , InetAddress.getLocalHost().getHostAddress());} catch (Exception e) {System.err.println(e +"  "+ e.getMessage());}
   		
	
	}
	
	public static void startTest(String testDescription) {
		if(exReport == null) {
			create(DEFAULT_DESCRIPTION, testDescription);
		}
		
		logger = exReport.createTest(testDescription);
	}	

	public static void log(Status logStatus, String message, String imagePath) {		
		try {
			if(logger == null) {
				startTest(DEFAULT_DESCRIPTION);
			}
			
			logger.log(logStatus, message, MediaEntityBuilder.createScreenCaptureFromPath(imagePath).build());
		} catch (IOException ex) {
			logger.log(logStatus, message + " (Screenshot fail)");
		}
	}	

	public static void log(Status logStatus, String message) {		
		if(logger == null) {
			startTest(DEFAULT_DESCRIPTION);
		}
		
		logger.log(logStatus, message);
	}
		
	public static void close() {
		if(exReport != null) {
			exReport.flush();
		} else {
			startTest("The test passed!");
			log(Status.INFO, "The tests ended.");
			close();
		}
	}
	
	

}
