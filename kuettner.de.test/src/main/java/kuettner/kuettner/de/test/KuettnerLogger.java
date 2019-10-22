package kuettner.kuettner.de.test;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KuettnerLogger {
	
	private static KuettnerLogger kuettnerLogger = null;
    private static final Logger LOGGER = Logger.getLogger(KuettnerLogger.class.getName());
    private static String protokolDatei;
    
    public static KuettnerLogger getInstance() {
    	if(kuettnerLogger == null) {
    		kuettnerLogger = new KuettnerLogger();
    		kuettnerLogger.initialize();
    	} 
    	return kuettnerLogger;
    }
    
    private KuettnerLogger() {
    }
    
    private void initialize() {
        Handler fileHandler  = null;
        try{
            //Creating consoleHandler and fileHandler
            fileHandler  = new FileHandler(protokolDatei);
             
            //Assigning handlers to LOGGER object
            LOGGER.addHandler(fileHandler);
             
            fileHandler.setLevel(Level.SEVERE);
            LOGGER.setLevel(Level.ALL);
             
            LOGGER.config("Configuration done.");
             
        }catch(IOException exception){
            LOGGER.log(Level.SEVERE, "Error occur in FileHandler.", exception);
        }
         
    }
    
    public void melden(Level level, String message) {
    	LOGGER.log(level, message);
    }
    
    public void setLevel(Level level) {
    	LOGGER.getHandlers()[0].setLevel(level);
    }
    
    public static void setProtokolDatei(String pfad) {
    	protokolDatei = pfad;
    }

}
