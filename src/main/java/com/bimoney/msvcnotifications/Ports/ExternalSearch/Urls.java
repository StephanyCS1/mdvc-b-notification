package com.bimoney.msvcnotifications.Ports.ExternalSearch;

public class Urls {

    private String host = "https://www.taxislibres.com.co";
    private String notificationHost = "192.168.20.100:12001";
    private String reciboPago = "/cuenta/reciboPago.php";
    private String app = "/cuenta/api/recibos/app.php";
    private String terceros = "/ws/tercerosWs.php";
    private String crearTerceros = "/ws/crea_terceros_cotech.php";
    private String recargaBolsillo = "/cuenta/api/recibos/?route=recargaBolsilloTi";
    private String actualizarSaldo = "/actualiza.saldo";
    private String tarjetaDeOperacion = "/cuenta/api/recibos/toBimoney.php";
    private String planilla = "/cuenta/api/recibos/?route=planillasBimoney";
    private String comercios = "/cuenta/api/recibos/comerciosGenerales.php";
    private String banco = "/cuenta/api/recibos/transfeBimoneyBancolombia.php";
    private String cajas = "/cuenta/api/recibos/pagoCajas.php";
    private String rodamiento = "/cuenta/api/recibos/rodamiento.php";
    private String parqueaderoAeropuerto = "/cuenta/api/recibos/?route=parqueaderoImperialBimoney";
    private String seguro = "/cuenta/api/recibos/?route=polizasBimoney";
}

