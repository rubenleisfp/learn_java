package org.learn.polimorfismo.actividad802;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DetergenteTest {

	@Test
	public void detergenteDescuentoTest() {
		//Detergente sin descuento, tiene el mismo precio 10
		Detergente d = new Detergente("colon",10);
		assertEquals(10,  d.getPrecioDescuento(), 0.001);
		
		//Detergente con 20% de descuento, tiene como precio final 10€-20%=8€
		d.setDescuento(20);
		System.out.println(d.getPrecioDescuento());
		assertEquals(8, d.getPrecioDescuento(), 0.001);
	}

}
