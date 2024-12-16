package com.bimoney.msvcnotifications.Ports.ExternalSearch;

import lombok.Data;

@Data
public class Urls {

    private  String HOST = "https://www.taxislibres.com.co";
    private  String NOTIFICATION_HOST = "192.168.20.100:12001";
    // Endpoints
    private  String RECIBO_PAGO = "/cuenta/reciboPago.php";
    private  String APP_BIMONEY = "/cuenta/api/recibos/?route=appBimoney";
    private  String APP = "/cuenta/api/recibos/app.php";
    private  String TERCERO_EXISTE = "/ws/tercerosWs.php";
    private  String CREAR_TERCEROS = "/ws/crea_terceros_cotech.php";
    private  String RECARGA_BOLSILLO = "/cuenta/api/recibos/?route=recargaBolsilloTi";
    private  String ACTUALIZAR_SALDO = "/actualiza.saldo";
    private  String TARJETA_DE_OPERACION = "/cuenta/api/recibos/toBimoney.php";
    private  String PLANILLA = "/cuenta/api/recibos/?route=planillasBimoney";
    private  String COMERCIOS = "/cuenta/api/recibos/comerciosGenerales.php";
    private  String BANCO = "/cuenta/api/recibos/transfeBimoneyBancolombia.php";
    private  String CAJAS = "/cuenta/api/recibos/pagoCajas.php";
    private  String RODAMIENTO = "/cuenta/api/recibos/rodamiento.php";
    private  String PARQUEADERO_AEROPUERTO = "/cuenta/api/recibos/?route=parqueaderoImperialBimoney";
    private  String SEGURO = "/cuenta/api/recibos/?route=polizasBimoney";

    // Consultas
    private String CONSULT_ROD = "/cuenta/api/tarifas/?route=rodamientoBimoney";


    public String buildUrl(String endpoint) {
        return HOST + endpoint;
    }
}

