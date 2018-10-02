package app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import utils.HttpDataService;
import utils.MyIpService;
import utils.MyUtils;

public class App {

	private static final Logger logger = LoggerFactory.getLogger(MyUtils.class);

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// TESTING

		System.out.println("");
		System.out.println("Testing");
		System.out.println("");

		HttpDataService httpDS = new HttpDataService();
		MyIpService ipS = new MyIpService(httpDS);

		String ip = ipS.getIp().toString();
		System.out.println(ip);

		System.out.println("");
		System.out.println("Logging");
		System.out.println("");

		String message = "Ceci est une string";
		Integer zero = 0;

		try {
			logger.debug("Message de log : {}", message);
			logger.debug("Going to divide {} by {}", 42, zero);
			int result = 42 / zero;
		} catch (Exception e) {
			logger.error("Erreur de division de {} par {} ", 42, zero, e);
		}

		logger.info("Log from {}", MyUtils.class.getSimpleName());

		Logger hacka47 = (Logger) LoggerFactory.getLogger("fr.xhackax47");
		Logger testslogger = (Logger) LoggerFactory.getLogger("fr.xhackax47.tests");

		hacka47.debug("This is logged from foobar");
		logger.debug("This is not logged from logger");
		logger.info("This is logged from logger");
		testslogger.info("This is not logged from tests");

	}
}