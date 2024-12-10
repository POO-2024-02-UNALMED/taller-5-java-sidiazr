package zooAnimales;

import java.util.ArrayList;

public class Ave extends Animal {
	
	private static ArrayList<Ave> listado = new ArrayList<Ave>();
	public static int halcones;
	public static int aguilas;
	
	private String colorPlumas;
	
	public Ave() {listado.add(this);}
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas) {
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static int cantidadAves() {
		return listado.size();
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		return new Ave(nombre, edad, "montañas", genero, "cafe glorioso");
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		return new Ave(nombre, edad, "montañas", genero, "blanco y amarillo");
	}
	
	public void setColorPlumas(String color) {
		colorPlumas = color;
	}
	
	public String getColorPlumas() {
		return colorPlumas;
	}

}
