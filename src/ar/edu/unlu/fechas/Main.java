package ar.edu.unlu.fechas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fecha1 = "2023-01-15";
		String fecha2 = "2023-02-21";
		String fecha3 = "2023-07-17";
		String fecha4 = "2023-02-21";
		
				
		Comparador c = new Comparador();
		
		c.comparaDosFechas(fecha1, fecha2);
		
		c.comparaDosFechas(fecha3, fecha4);
		
		c.comparaDosFechas(fecha2, fecha4);
		
		// verifica si fecha1 se encuentra entre fecha2 y fecha3
		c.comparaTresFechas(fecha1, fecha2, fecha3);
		c.comparaTresFechas(fecha2, fecha1, fecha3);
		
		
	}

}
