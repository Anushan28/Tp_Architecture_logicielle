package fr.esiea.unique.ahingora.nadeswaran.letterpot;

import org.junit.*;

public class LetterPotTest {
	private LetterPot lettre;
	
	@Before
	public void doBefore() {
		lettre = new LetterPot();
	}
	
	@Test
	public void testPot() {
		final String l;
		l= " ";
		
		final String result = LetterPot.l;
		
		equals(result);
	}

}
