package com.bimoney.msvcnotifications.Ports.ExternalSearch.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateThirdParty {

    private String num_doc;
    private String nombre;
    private String email;
    private String telefono;

}
