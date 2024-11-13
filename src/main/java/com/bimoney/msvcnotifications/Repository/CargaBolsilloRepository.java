package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.CargaBolsillo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CargaBolsilloRepository extends JpaRepository<CargaBolsillo, Long> {

    void saveCargaBolsillo(CargaBolsillo cargaBolsillo);

    CargaBolsillo findByTransaction(String transaction);

}
