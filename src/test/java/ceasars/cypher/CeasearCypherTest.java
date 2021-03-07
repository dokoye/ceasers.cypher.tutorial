package ceasars.cypher;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CeasearCypherTest { 
	
	private CeasarsCypher mainCipher = new CeasarsCypher();

	@Test
	void testCipheredMessageWithOffsetOf12() {
		assertEquals("Zai SdW kag Va[`Y faVSk", mainCipher.cipher("how are you doing today", 12));
	}
	
	@Test
	void testEmptyString() {
		assertEquals("", mainCipher.cipher("", 12));
	}

}

