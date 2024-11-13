package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.Cajas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CajasRepository extends JpaRepository<Cajas, Long> {

    void saveCajas(Cajas cajas);

    Cajas findByTransaction(String transaction);
}
