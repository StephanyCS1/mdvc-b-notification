package com.bimoney.msvcnotifications.Utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TailNotificationsToProcess {

    private String url;
    private String json;

}
