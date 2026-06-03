package Clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int id_cliente;
    private String nombre;
    private String email;
    private int numero;
    private List<Bicicleta> bicicletas;
    //constructor
    public Cliente(){

    }

    public Cliente(int id_cliente, String nombre, String email, int numero, List<Bicicleta> bicicletas) {
        this.id_cliente = id_cliente;
        this.nombre = nombre;
        this.email = email;
        this.numero = numero;
        this.bicicletas = new ArrayList<>();
    }
    //Getters y setters

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<Bicicleta> getBicicletas() {
        return bicicletas;
    }

    public void setBicicletas(List<Bicicleta> bicicletas) {
        this.bicicletas = bicicletas;
    }
//Método
    public void registrarBicicleta(Bicicleta bici){
        this.bicicletas.add(bici);
    }
}
