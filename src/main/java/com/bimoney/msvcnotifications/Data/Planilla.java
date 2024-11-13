package com.bimoney.msvcnotifications.Data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Planilla {

    private String idpagoBimoney;
    private String descripcion;
    private String amount;
    private String noIdentificacion;
    private String referencia;
    private String referencia1;
    private String referencia2;
    private String referencia3;
    private String transferTypeId;
    private String tipo;
    private String codAfiliadora;

}
