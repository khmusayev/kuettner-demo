package kuettner.kuettner.de.test;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;

public class SommerZeitTest {
	
	private static long[] erwarteteSommanfs = {16554960000L,  19699920000L, 22844880000L, 25989840000L};
	private static long[] erwarteteSommends = {18127439999L, 21272399999L, 24417359999L, 27562319999L};
	
	@Test
	public void sommerAnfangTest() {
		SommerZeit sz1 = new SommerZeit(1980);
		SommerZeit sz2 = new SommerZeit(1981);
		SommerZeit sz3 = new SommerZeit(1982);
		SommerZeit sz4 = new SommerZeit(1983);
		long[] aktuelleSommanfs = {sz1.calcSommerAnfang(), sz2.calcSommerAnfang(), 
				                   sz3.calcSommerAnfang(), sz4.calcSommerAnfang()};
		assertArrayEquals(erwarteteSommanfs, aktuelleSommanfs);
	}
	
	@Test
	public void sommerAnfangEnd() {
		SommerZeit sz1 = new SommerZeit(1980);
		SommerZeit sz2 = new SommerZeit(1981);
		SommerZeit sz3 = new SommerZeit(1982);
		SommerZeit sz4 = new SommerZeit(1983);
		long[] aktuelleSommends = {sz1.calcSommerEnd(), sz2.calcSommerEnd(), 
				                   sz3.calcSommerEnd(), sz4.calcSommerEnd()};
		assertArrayEquals(erwarteteSommends, aktuelleSommends);
	}

}
