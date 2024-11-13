package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.Planilla;
import org.springframework.data.jpa.repository.JpaRepository;

import java.nio.file.LinkOption;

public interface PlanillaRepository extends JpaRepository<Planilla, Long> {

    void savePlanilla(Planilla planilla);

    Planilla findByTransaction(String transaction);

}
