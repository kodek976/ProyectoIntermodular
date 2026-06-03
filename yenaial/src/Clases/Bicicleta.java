package Clases;

import java.util.List;

public class Bicicleta {
    private int id_bicleta;
    private String marca;
    private String modelo;
    private String color;
    private List<Cliente> dueño;

    public Bicicleta (){

    }

    public Bicicleta(int id_bicleta, String marca, String modelo, String color, List<Cliente> dueño) {
        this.id_bicleta = id_bicleta;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.dueño = dueño;
    }

    public int getId_bicleta() {
        return id_bicleta;
    }

    public void setId_bicleta(int id_bicleta) {
        this.id_bicleta = id_bicleta;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public List<Cliente> getDueño() {
        return dueño;
    }

    public void setDueño(List<Cliente> dueño) {
        this.dueño = dueño;
    }
}
