package com.bimoney.msvcnotifications.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comercios")
public class Comercios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transaction;

    private String data;

    private String response;

}
