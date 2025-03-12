package org.learn.polimorfismo.actividad802;

import static org.junit.Assert.*;

import org.junit.Test;

public class VinoTest {

	@Test
	public void caloriasTest() {
		Vino v1 = new Vino("ramon bilbao","rioja",10,12);
		int calorias = v1.getCalorias();
		assertEquals(100, calorias);
	}

}
