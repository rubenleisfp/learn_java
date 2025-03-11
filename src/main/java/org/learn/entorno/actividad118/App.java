package org.learn.entorno.actividad118;

import org.apache.commons.lang3.StringUtils;

public class App {

	public static void main(String[] args) {
		boolean numeric = StringUtils.isNumeric("99A");
		System.out.println(numeric);
	}
}
