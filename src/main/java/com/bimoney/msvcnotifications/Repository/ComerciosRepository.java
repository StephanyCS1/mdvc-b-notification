package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.Comercios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComerciosRepository extends JpaRepository<Comercios, Long> {

    void saveComercio(Comercios comercios);

    Comercios findByTransaction(String transaction);

}
