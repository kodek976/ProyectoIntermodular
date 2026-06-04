package Clases;

import java.time.LocalDate;

public class Cita {
    private Cliente cliente;
    private Bicicleta bicicleta;
    private LocalDate fecha;
    private String hora;
    private String motivo;
    private boolean confirmada;

    public Cita(Cliente cliente, Bicicleta bicicleta, LocalDate fecha, String hora, String motivo, boolean confirmada) {
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.fecha = fecha;
        this.hora = hora;
        this.motivo = motivo;
        this.confirmada = confirmada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Bicicleta getBicicleta() {
        return bicicleta;
    }

    public void setBicicleta(Bicicleta bicicleta) {
        this.bicicleta = bicicleta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isConfirmada() {
        return confirmada;
    }

    public void setConfirmada(boolean confirmada) {
        this.confirmada = confirmada;
    }

    @Override
    public String toString(){
        return "Cita para el " +fecha+ "a las " +hora
                + "\nNombre: " + cliente.getNombre()
                + "\nBicicleta: " + bicicleta
                + "\nMotivo: " + motivo
                + "\nConfirmada: " + confirmada;
    }
}
