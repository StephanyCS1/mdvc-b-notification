package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.ParqueaderoAeropuerto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParqueaderoAeropuertoRepository extends JpaRepository<ParqueaderoAeropuerto, Long> {

    void saveParqueadero(ParqueaderoAeropuerto aeropuerto);

    ParqueaderoAeropuerto findByTransaction(String transaction);

}
