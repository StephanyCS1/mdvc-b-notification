package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.Rodamiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RodamientoRepository extends JpaRepository<Rodamiento, Long> {

    void saveRodamiento(Rodamiento rodamiento);

    Rodamiento findNotificationByTransaction(String transaction);

}
