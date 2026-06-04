package Clases;

public class Bicicleta {
    private String marca;
    private String modelo;
    private String color;
    private Cliente propietario;

    public Bicicleta(String marca, String modelo, String color, Cliente propietario) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.propietario = propietario;
    }

    // Getters y setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public Cliente getPropietario() { return propietario; }
    public void setPropietario(Cliente propietario) { this.propietario = propietario; }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + color + ") — Propietario: " + propietario.getNombre();
    }
}