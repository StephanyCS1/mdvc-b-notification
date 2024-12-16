package com.bimoney.msvcnotifications.Notifications;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificacionAplicacion2 {

    private String cedulaPagador;
    private String cedulaBeneficiario;
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
                ", cedulaBeneficiario='" + cedulaBeneficiario + '\'' +
                ", valTotal='" + valTotal + '\'' +
                ", valPuntos='" + valPuntos + '\'' +
                ", valValesTc='" + valValesTc + '\'' +
                ", transac='" + transac + '\'' +
                ", ctrlTransac='" + ctrlTransac + '\'' +
                ", fecha='" + fecha + '\'' +
                '}';
    }
}
