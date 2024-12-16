package com.bimoney.msvcnotifications.Notifications;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificacionPlanillayTarjetaOperacion {

    private String cedulaPagador;
    private String placa;
    private String valTotal;
    private String valPuntos;
    private String valValesTc;
    private String transac;
    private String ctrlTransac;
    private String fecha;

    @Override
    public String toString() {
        return "{" +
                "cedulaPagador='" + cedulaPagador + '\'' +
                ", placa='" + placa + '\'' +
                ", valTotal='" + valTotal + '\'' +
                ", valPuntos='" + valPuntos + '\'' +
                ", valValesTc='" + valValesTc + '\'' +
                ", transac='" + transac + '\'' +
                ", ctrlTransac='" + ctrlTransac + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
