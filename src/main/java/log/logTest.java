package log;

import org.apache.log4j.Logger;

public class logTest {
	private Logger logger = Logger.getLogger(logTest.class);
	
	public static void main(String[] args){
		new logTest().testOutLog();
	}
	
	public void testOutLog(){
		for(int i = 0; i < 3;i++){
			logger.info("info------------");
			logger.debug("debug------------");
		}
		System.out.println("++++");
	}
}
