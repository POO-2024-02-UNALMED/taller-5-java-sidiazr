package zooAnimales;

import gestion.Zona;

public class Animal {
	
	private static int totalAnimales;
	
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zona;
	
	public Animal() {totalAnimales++;}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre; this.edad = edad; this.habitat = habitat; this.genero = genero;
		totalAnimales++;
	}
	
	public String movimiento() {
		return "delplazarse";
	}
	
	
	public String totalPorTipo() {
		return "Mamiferos: " + Mamifero.cantidadMamiferos() + "\n" +
				"Aves: " + Ave.cantidadAves() + "\n" +
				"Reptiles: " + Reptil.cantidadReptiles() + "\n" +
				"Peces: " + Pez.cantidadPeces() + "\n" +
				"Anfibios: " + Anfibio.cantidadAnfibios() + "\n";
	}
	
	public String toString() {
		if (zona == null) {
			return "mi nombre es " +nombre + "tengo una edad de "+edad + "habito en " +habitat +
					" y mi genero es" +genero; 
		}
		else {
			return "mi nombre es " +nombre + "tengo una edad de "+edad + "habito en " +habitat +
					" y mi genero es" +genero +" la zona en la que me ubico es " +zona +" en el "+
					zona.getZoo();
		}
	}
	
	public int getTotalAnimales() {
		return totalAnimales;
	}
	
	public void setTotalAnimales(int num) {
		totalAnimales = num;
	}
	
	

}
