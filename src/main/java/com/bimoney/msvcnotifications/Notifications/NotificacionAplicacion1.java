package com.bimoney.msvcnotifications.Notifications;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificacionAplicacion1 {

    private String nit;
    private String cedula;
    private Integer tipo;
    private String cuotas;
    private String valor;
    private String fecha_pago;
    private String transaccion;
    private String ciudad;
    private String placa;
    private String pin;
    private String referencia;
    private Boolean estado;
    private String descripcion;
    private String ctrlTransac = "0";

    @Override
    public String toString() {
        return "{" +
                "nit='" + nit + '\'' +
                ", cedula='" + cedula + '\'' +
                ", tipo=" + tipo +
                ", cuotas='" + cuotas + '\'' +
                ", valor='" + valor + '\'' +
                ", fecha_pago='" + fecha_pago + '\'' +
                ", transaccion='" + transaccion + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", placa='" + placa + '\'' +
                ", pin='" + pin + '\'' +
                ", referencia='" + referencia + '\'' +
                ", estado=" + estado +
                ", descripcion='" + descripcion + '\'' +
                ", ctrlTransac='" + ctrlTransac + '\'' +
                '}';
    }
}
