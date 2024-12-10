package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;

public class Prueba {

	public static void main(String[] args) {
		Animal an1 = new Animal();
		Animal an2 = new Animal("Perro", 10, "casa", "m");
		
		System.out.println(an2.getNombre() == "Perro" && an2.getEdad() == 10
				&& an2.getHabitat().equals("casa") && an2.getGenero().equals("m"));

	}

}
