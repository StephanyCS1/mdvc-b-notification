package com.bimoney.msvcnotifications.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "pagoAplicacion")
public class Aplicacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transaction;

    private String dataReciboPago;

    private String responseReciboPago;

    private String dataApp;

    private String responseApp;

}
