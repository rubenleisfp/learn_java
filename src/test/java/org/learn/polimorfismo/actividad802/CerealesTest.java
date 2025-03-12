package org.learn.polimorfismo.actividad802;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CerealesTest {

	@Test
	public void caloriasTest() {
	
		Cereales c1 = new Cereales("hola","espelta",2);
		assertEquals(5, c1.getCalorias());
		
		Cereales c2 = new Cereales("hola","maíz",3);
		assertEquals(8, c2.getCalorias());
		
		Cereales c3 = new Cereales("hola","trigo",4);
		assertEquals(12, c3.getCalorias());
		
		Cereales c4 = new Cereales("hola","otro",5);
		assertEquals(15, c4.getCalorias());
	}

}
