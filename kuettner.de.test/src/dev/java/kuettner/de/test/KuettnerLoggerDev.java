package kuettner.de.test;

import java.io.IOException;
import java.util.logging.Level;

import kuettner.kuettner.de.test.KuettnerLogger;

public class KuettnerLoggerDev {
	
    public static void main(String[] args) throws SecurityException, IOException {
    	String pfad = "C:\\Users\\khmus\\Downloads\\kuettner\\protokol.xml";
    	KuettnerLogger.setProtokolDatei(pfad);
    	KuettnerLogger logger = KuettnerLogger.getInstance();
    	logger.setLevel(Level.ALL);
    	logger.melden(Level.FINE, "Finer logged");
    }

}
