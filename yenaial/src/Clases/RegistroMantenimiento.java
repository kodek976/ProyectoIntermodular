package Clases;

import java.time.LocalDate;

public class RegistroMantenimiento {
    private Bicicleta bicicleta;
    private Cliente cliente;
    private Cita cita;
    private double Solucion;

    public RegistroMantenimiento(Bicicleta bicicleta, Cita cita, Cliente cliente, double solucion) {
        this.bicicleta = bicicleta;
        this.cita = cita;
        this.cliente = cliente;
        Solucion = solucion;
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

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public double getSolucion() {
        return Solucion;
    }

    public void setSolucion(double solucion) {
        Solucion = solucion;
    }
    @Override
    public String toString() {
        return "RegistroMantenimiento{" +
                "bicicleta=" + bicicleta +
                ", cliente=" + cliente +
                ", cita=" + cita +
                ", Solucion=" + Solucion +
                '}';
    }
}
