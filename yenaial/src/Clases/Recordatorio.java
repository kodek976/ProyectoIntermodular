package Clases;

import java.time.LocalDate;

public class Recordatorio {
    private Cliente cliente;
    private Bicicleta bicicleta;
    private String mensaje;
    private LocalDate fechaAviso;
    private boolean enviado;

    public Recordatorio(Cliente cliente, Bicicleta bicicleta, String mensaje, LocalDate fechaAviso, boolean enviado) {
        this.cliente = cliente;
        this.bicicleta = bicicleta;
        this.mensaje = mensaje;
        this.fechaAviso = fechaAviso;
        this.enviado = enviado;
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

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDate getFechaAviso() {
        return fechaAviso;
    }

    public void setFechaAviso(LocalDate fechaAviso) {
        this.fechaAviso = fechaAviso;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    @Override
    public String toString() {
        return "Recordatorio{" +
                "cliente=" + cliente +
                ", bicicleta=" + bicicleta +
                ", mensaje='" + mensaje + '\'' +
                ", fechaAviso=" + fechaAviso +
                ", enviado=" + enviado +
                '}';
    }
}
