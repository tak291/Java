package modelo;

public class Producto {
	
	//Declarar los atributos
	
	private String fechaCaducidad;
	private int lote;
	
	
	//Constructor
	public Producto(String fechaCaducidad, int lote) {
		this.fechaCaducidad = fechaCaducidad;
		this.lote = lote;
	}
	
	//Set y getters de atributos

	public String getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(String fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

	public int getLote() {
		return lote;
	}

	public void setLote(int lote) {
		this.lote = lote;
	}

	
	
	

}
