package kuettner.de.test;

import kuettner.kuettner.de.test.SommerZeit;

public class SommerZeitDev {

	public static void main(String[] args) {
		SommerZeit sommZeit = new SommerZeit(1980);
		System.out.println(sommZeit.calcSommerAnfang());
		System.out.println(sommZeit.calcSommerEnd());
	}
}
