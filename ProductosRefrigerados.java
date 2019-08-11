package modelo;

public class ProductosRefrigerados {
    private int codsup;
    private String fechaEnvasado;
    private String paisOrigen;

    public ProductosRefrigerados(int codsup, String fechaEnvasado, String paisOrigen){
        super("06/06/2019", 121345);
        this.codsup = codsupç;
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public int getCodsup() {
        return codsup;
    }

    public void setCodsup(int codsup) {
        this.codsup = codsup;
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
