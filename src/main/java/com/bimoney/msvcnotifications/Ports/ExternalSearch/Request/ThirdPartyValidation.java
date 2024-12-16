package com.bimoney.msvcnotifications.Ports.ExternalSearch.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ThirdPartyValidation {

    String identificacion;

    @Override
    public String toString() {
        return "{\"identificacion\":\"" + identificacion + "\"}";
    }
}
