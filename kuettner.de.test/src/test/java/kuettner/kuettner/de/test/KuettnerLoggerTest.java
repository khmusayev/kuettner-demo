package kuettner.kuettner.de.test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import java.io.File;
import java.util.logging.Level;

import org.junit.Test;

public class KuettnerLoggerTest {
	
	// Bitte hier protokolDatei eingeben
	private String protokolDatei = "C:\\Users\\khmus\\Downloads\\kuettner\\protokol.xml";
	
	@Test
	public void meldenTest() {
		File pDat = new File(protokolDatei);
		if(pDat.exists()) {
			pDat.delete();
		}
		KuettnerLogger.setProtokolDatei(protokolDatei);
		KuettnerLogger klog = KuettnerLogger.getInstance();
		klog.setLevel(Level.SEVERE);
		klog.melden(Level.SEVERE, "Etwas ist falsch");
		klog.melden(Level.INFO, "nur info");
		klog.melden(Level.FINE, "alles in Ordnung");
		assertTrue(new File(protokolDatei).exists());
	}


}
