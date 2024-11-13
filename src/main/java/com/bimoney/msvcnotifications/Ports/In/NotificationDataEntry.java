package com.bimoney.msvcnotifications.Ports.In;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationDataEntry {

    private String ToMember;
    private String FromMember;
    private String idpagoBimoney;
    private String Description;
    private String Amount;
    private String Nodeidentificacion;
    private String emailpagador;
    private String pagador;
    private String direccionenvio;
    private String telefonodeenvio;
    private String nombrecomprador;
    private String paisdeenvio;
    private String ciudaddeenvio;
    private String codigopostaldeenvio;
    private String referencia1;
    private String referencia2;
    private String referencia3;
    private String referencia;
    private String TransferTypeId;
    private String Tipo;
    private String codAfiliadora;

}
