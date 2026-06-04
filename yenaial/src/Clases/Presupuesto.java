package Clases;

public class Presupuesto {
    private Bicicleta bicicleta;
    private Cliente cliente;
    private double precio;
    private boolean aceptado;

    public Presupuesto(Bicicleta bicicleta, Cliente cliente, double precio, boolean aceptado) {
        this.bicicleta = bicicleta;
        this.cliente = cliente;
        this.precio = precio;
        this.aceptado = aceptado;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }
    @Override
    public String toString(){
        return "Presupuesto a nombre de "+ cliente+" bicicleta "+bicicleta+" por un precio de "+precio;
    }
}
