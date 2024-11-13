package com.bimoney.msvcnotifications.Entity;

import jakarta.persistence.*;

@Entity
@Table(name="rodamiento")
public class Rodamiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String transaction;

    private String data;

    private String response;


}
