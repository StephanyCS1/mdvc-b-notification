package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.Aplicacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AplicacionRepository extends JpaRepository<Aplicacion, Long> {

    void saveAPP(Aplicacion aplicacion);

    Aplicacion findNotificationByTransaction(String transaction);

}
