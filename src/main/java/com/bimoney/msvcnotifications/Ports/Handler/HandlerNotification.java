package com.bimoney.msvcnotifications.Ports.Handler;

import com.bimoney.msvcnotifications.Ports.In.NotificationDataEntry;
import com.bimoney.msvcnotifications.Ports.Out.ThirdPartyValidation;

import java.util.Set;

public class HandlerNotification {

    private String TRANSFER_TYPE_COBRO_BOLSILLO = "66";
    private String USERNAME_COTECH = "115673";
    private String USERNAME_TAXISLIBRES = "415744";
    private String USERNAME_RADIOTAXI = "8370083";
    private String USERNAME_TAXIMPERIAL = "2769930";
    private String USERNAME_VIASEGUROS = "2792981";
    private String RODAMIENTO = "RODAMIENTO";
    private static final Set<String> TRANSFER_TYPES_COMERCIOS = Set.of("36", "32");
    private static final Set<String> REFERENCIAS_ISLEROS = Set.of("GAS", "GASOLINA");
    private Set<String> APP = Set.of("APLICACION","APP");


    UserSearch userSearch = null;

    public void validations(NotificationData data, NotificationDataEntry dataEntry) {

        boolean isToTaxisLibres = data.getToMember().equals(USERNAME_TAXISLIBRES);
        boolean isToCotech = data.getToMember().equals(USERNAME_COTECH);
        boolean isParkingAir = data.getToMember().equals(USERNAME_TAXIMPERIAL);
        boolean isViaSeguros = data.getToMember().equals(USERNAME_VIASEGUROS);
        boolean isPlanilla = data.getToMember().equals(USERNAME_RADIOTAXI);
        boolean isRodamiento = data.getDescription().equalsIgnoreCase(RODAMIENTO) &&
                dataEntry.getToMember().equals(USERNAME_TAXISLIBRES);
        boolean isCobroBolsillo = data.getTransferTypeId().equals(TRANSFER_TYPE_COBRO_BOLSILLO);
        boolean isCommerceType = TRANSFER_TYPES_COMERCIOS.contains(data.getTransferTypeId());
        boolean isFuelStationReference = REFERENCIAS_ISLEROS.contains(data.getReferencia());
        boolean notCommerce = isToCotech || isToTaxisLibres;
        boolean isAppReference = !isCommerceType && APP.contains(data.getReferencia());

        if(isToCotech || isToTaxisLibres){
            dataEntry.setDescription(dataEntry.getReferencia1());
            dataEntry.setReferencia1("");
        }

        String referencia = data.getReferencia().toUpperCase();

        // notificar aplicacion
        if(isAppReference && notCommerce && !isFuelStationReference){
            String identificationUser = thirtValidation(data.getToMember());
            String toMember = dataEntry.getToMember().equals(USERNAME_COTECH) ? dataEntry.getToMember() : USERNAME_COTECH;


            //notificar rodamiento
        } else if (isRodamiento) {

        }

    }

    public String thirtValidation(String toMember){
        userSearch = new UserSearch();

        new ThirdPartyValidation(toMember);

    }


}
