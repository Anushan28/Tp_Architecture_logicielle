package fr.esiea.unique.ahingora.nadeswaran.letterbag;

import org.junit.*;

public class LetterBagTest {
	private LetterBag letterr;
	
	@Before
	public void doBefore(){
		letterr = new LetterBag();
	}
	
	@Test
	public void testGetLetter() {
		char result = LetterBag.LetterRandom();
		equals(result);
	}

}
