package zooAnimales;

import java.util.ArrayList;

public class Mamifero extends Animal {
	
	private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
	public static int caballos;
	public static int leones;
	
	private boolean pelaje;
	private int patas;
	
	public Mamifero() {listado.add(this);}
	
	public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas) {
		super(nombre, edad, habitat, genero);
		this.pelaje = pelaje;
		this.patas = patas;
		listado.add(this);
	}
	
	public static int cantidadMamiferos() {
		return listado.size();
	}
	
	public static Mamifero crearLeon(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "selva", genero, true, 4);
	}
	
	public static Mamifero crearCaballo(String nombre, int edad, String genero) {
		leones++;
		return new Mamifero(nombre, edad, "pradera", genero, true, 4);
	}
	
	public void setPelaje(boolean pelaje) {
		this.pelaje = pelaje;
	}
	
	public boolean getPelaje() {
		return pelaje;
	}
	
	public void setPatas(int num) {
		patas = num;
	}
	
	public int getPatas() {
		return patas;
	}

}