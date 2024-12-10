package zooAnimales;

import java.util.ArrayList;

public class Pez extends Animal {
	
	private static ArrayList<Pez> listado = new ArrayList<Pez>();
	public static int salmones;
	public static int bacalaos;
	
	private String colorEscamas;
	private int cantidadAletas;
	
	public Pez() {listado.add(this);}
	
	public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas) {
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.cantidadAletas = cantidadAletas;
		listado.add(this);
	}
	
	@Override
	public String movimiento() {
		return "nadar";
	}
	
	public static int cantidadPeces() {
		return listado.size();
	}
	
	public static Pez crearSalmon(String nombre, int edad, String genero) {
		salmones++;
		return new Pez(nombre, edad, "oceano", genero, "rojo", 6);
	}
	
	public static Pez crearBacalao(String nombre, int edad, String genero) {
		bacalaos++;
		return new Pez(nombre, edad, "oceano", genero, "gris", 6);
	}
	
	public void setColorEscamas(String color) {
		colorEscamas = color;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setCantidadAletas(int num) {
		cantidadAletas = num;
	}
	
	public int getCantidadAletas() {
		return cantidadAletas;
	}

}
