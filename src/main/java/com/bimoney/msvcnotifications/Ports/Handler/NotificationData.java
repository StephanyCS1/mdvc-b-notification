package com.bimoney.msvcnotifications.Ports.Handler;

import com.bimoney.msvcnotifications.Notifications.NotificacionAplicacion1;
import com.bimoney.msvcnotifications.Notifications.NotificacionAplicacion2;
import com.bimoney.msvcnotifications.Ports.In.NotificationDataEntry;
import com.bimoney.msvcnotifications.Utils.GetDate;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


public class NotificationData {

    public NotificacionAplicacion1 notificacionReciboPago(String valor, String transaccion, String descripcion) {
        // Dividir la descripción por los dos puntos
        String[] parts = descripcion.split(":");
        String[] extractedParts = new String[10];

        // Rellenar los 10 slots con los valores del split o cadenas vacías
        for (int i = 0; i < extractedParts.length; i++) {
            extractedParts[i] = (i < parts.length) ? parts[i] : "";
        }

        // Asignar las partes
        String part0 = extractedParts[0];
        String part1 = extractedParts[1];
        String part2 = extractedParts[2];
        String part5 = extractedParts[5];
        String part7 = extractedParts[7];
        String part8 = extractedParts[8];

        // Calcular la fecha actual corregida
        String fechaTx = new GetDate().getAdjustedTime();

        // Dividir part2 por guión si es aplicable
        String[] parts1 = part2.split("-");

        // Determinar la placa según las condiciones con if-else
        String placa;
        String part2Uppercase = part2.toUpperCase();
        if (part2Uppercase.contains("CALI") || part2Uppercase.contains("APPCALI") || part2Uppercase.contains("APPCAL")) {
            placa = "APPCAL";
        } else {
            placa = "APP";
        }

        // Crear una instancia de NotificacionAplicacion1
        NotificacionAplicacion1 notificacion = new NotificacionAplicacion1();
        notificacion.setNit(part5);
        notificacion.setCedula(part7);
        notificacion.setTipo(3);
        notificacion.setCuotas(part1);
        notificacion.setValor(valor);
        notificacion.setFecha_pago(fechaTx);
        notificacion.setTransaccion(transaccion);
        notificacion.setCiudad(part8);
        notificacion.setPlaca(placa);
        notificacion.setReferencia("Aplicacion");
        notificacion.setEstado(true);
        notificacion.setDescripcion(part0);


        // Determinar y agregar el PIN
        if (!part0.toUpperCase().contains("APLICACION")) {
            notificacion.setPin("0");
        } else if (parts1.length > 0) {
            notificacion.setPin(parts1[0]);
        }
        return notificacion;
    }
    public NotificacionAplicacion2 appBimoney(NotificationDataEntry data){
        String[] parts = data.getDescription().split(":");
        String cedulaBeneficiario = parts.length < 7 ? "" : parts[7];

        NotificacionAplicacion2 notificacion = new NotificacionAplicacion2();
        notificacion.setCedulaPagador(data.getNodeidentificacion());
        notificacion.setCedulaBeneficiario(cedulaBeneficiario);
        notificacion.setValTotal(data.getAmount());
        notificacion.setValPuntos(data.getReferencia2());
        notificacion.setValValesTc(data.getReferencia3());
        notificacion.setTransac(data.getIdpagoBimoney());
        notificacion.setCtrlTransac("0");
        notificacion.setFecha(new GetDate().getAdjustedTime());

        return notificacion;
    }
}