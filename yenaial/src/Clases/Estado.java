package Clases;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Estado {

    private Bicicleta bicicleta;
    private Cita cita;
    private List<String> piezasUsadas;
    private LocalDate fechaEntrada;
    private LocalDate fechaEstimadaSalida;
    private String estado;
    private double costeEstimado;

    public Estado(Bicicleta bicicleta, Cita cita, List<String> piezasUsadas, LocalDate fechaEntrada, LocalDate fechaEstimadaSalida, String estado, double costeEstimado) {
        this.bicicleta = bicicleta;
        this.cita = cita;
        this.piezasUsadas = piezasUsadas;
        this.fechaEntrada = fechaEntrada;
        this.fechaEstimadaSalida = fechaEstimadaSalida;
        this.estado = estado;
        this.costeEstimado = costeEstimado;
    }

    public void añadirPieza(String pieza) {
        piezasUsadas.add(pieza);
    }

    public void avanzarEstado() {
        if (estado.equals("En diagnóstico")) {
            estado = "En reparación";
        } else if (estado.equals("En reparación")) {
            estado = "Lista para prueba";
        } else if (estado.equals("Lista para prueba")) {
            estado = "Lista para retirar";
        } else {
            System.out.println("La reparación ya está finalizada.");
        }
    }

    public Bicicleta getBicicleta() { return bicicleta; }

    public Cita getCita() {
        return cita;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }

    public List<String> getPiezasUsadas() { return piezasUsadas; }

    public LocalDate getFechaEntrada() { return fechaEntrada; }

    public LocalDate getFechaEstimadaSalida() { return fechaEstimadaSalida; }
    public void setFechaEstimadaSalida(LocalDate f) { this.fechaEstimadaSalida = f; }

    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }

    public double getCosteEstimado() { return costeEstimado; }
    public void setCosteEstimado(double coste) { this.costeEstimado = coste; }

    @Override
    public String toString() {
        return "Bici: " + bicicleta.getMarca() + " " + bicicleta.getModelo()
                + "\nCita: " + cita
                + "\nPiezas: " + piezasUsadas
                + "\nEstado: " + estado
                + "\nEntrada: " + fechaEntrada + " | Salida est.: " + fechaEstimadaSalida
                + "\nCoste estimado: " + costeEstimado + "€";
    }
}