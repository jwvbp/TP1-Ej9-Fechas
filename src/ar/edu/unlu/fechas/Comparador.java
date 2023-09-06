package ar.edu.unlu.fechas;

import java.time.LocalDate;

public class Comparador {

	public void comparaDosFechas(String fecha1, String fecha2) {

		LocalDate f1 = LocalDate.parse(fecha1);
		LocalDate f2 = LocalDate.parse(fecha2);
		int valor = f1.compareTo(f2);
		if (valor < 0) {
			System.out.println(fecha1 + " es menor que " + fecha2);
		}
		if (valor == 0) {
			System.out.println(fecha1 + " es la misma que " + fecha2);
		}
		if (valor > 0) {
			System.out.println(fecha1 + " es mayor que " + fecha2);
		}
	}

	public void comparaTresFechas(String fecha1, String fecha2, String fecha3) {
		/*
		 * Si fecha1 se encuentra entre fecha2 y fecha3, entonces debe ser mayor que
		 * fecha2 y menor que fecha3
		 */
		LocalDate f1 = LocalDate.parse(fecha1);
		LocalDate f2 = LocalDate.parse(fecha2);
		LocalDate f3 = LocalDate.parse(fecha3);
		int valor1 = f1.compareTo(f2);
		int valor2 = f1.compareTo(f3);
		if ((valor1 > 0) && (valor2 < 0)) {
			System.out.println(fecha1 + " se encuentra entre " + fecha2 + " y " + fecha3);
		} else {
			System.out.println(fecha1 + " fuera de rango");
		}
	}
}