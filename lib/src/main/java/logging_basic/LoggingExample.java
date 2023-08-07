package logging_basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * 로깅
 * @param args	
 */
	public class LoggingExample {
	
		private static final Logger log = LoggerFactory.getLogger(LoggingExample.class);

	public static void main(String[] args) {
			int result = 10;
		
		
//			log.trace("trace 기록");
			log.debug("x : {}", result);
			log.info("x : {}", result);
			log.warn("x : {}", result);
			log.error("x : {}", result);
	}

}
