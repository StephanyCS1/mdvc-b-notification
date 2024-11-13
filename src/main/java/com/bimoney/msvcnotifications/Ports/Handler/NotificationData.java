package com.bimoney.msvcnotifications.Ports.Handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationData {

    private String toMember;
    private String transferTypeId;
    private String description;
    private String referencia;

}
