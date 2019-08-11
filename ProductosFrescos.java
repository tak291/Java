package modelo;

public class ProductosFrescos extends Producto {
	private String fechaEnvasado;
	private String paisOrigen;
	
	public ProductosFrescos(String fechaEnvasado, String paisOrigen ) {
		super("04/24/2019", 3456);
		this.fechaEnvasado = fechaEnvasado;
		this.paisOrigen = paisOrigen;
		
	}

	public String getFechaEnvasado() {
		return fechaEnvasado;
	}

	public void setFechaEnvasado(String fechaEnvasado) {
		this.fechaEnvasado = fechaEnvasado;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	
	

}
