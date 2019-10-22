package kuettner.kuettner.de.test;

import java.sql.Timestamp;
import java.util.Date;

public class SommerZeit {

	private int jahr;

	public SommerZeit(int jahr) {
		this.jahr = jahr;
	}

	/**
	 * Ich wuerde java.util.Date als return type benutzen
	 * Aber erstmal so ist es besser um mit Fortran ergebnisse zu vergleichen
	 * @return
	 */
	public long calcSommerAnfang() {
		long iwot = 365*(this.jahr - 1975) + (this.jahr-1973)/4+(this.jahr+3)%4/3;
		long sommend = 24;
		long sommanf = ((iwot-(iwot+92)%7+90)*sommend+2)*360000;
		return sommanf;
	}

	public long calcSommerEnd() {
		long iwot = 365*(this.jahr - 1975) + (this.jahr-1973)/4+(this.jahr+3)%4/3;
		long sommend = 24;
		int ultimo = this.jahr < 1996 ? 273 : 304;
	    sommend = ((iwot - (iwot + ultimo+2)%7 + ultimo) * sommend + 2) * 360000-1;
	    return sommend;
	}

}
