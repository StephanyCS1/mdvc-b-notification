package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.SeguroObligarorio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeguroObligatorioRepository extends JpaRepository<SeguroObligarorio, Long> {

    void saveSeguro(SeguroObligarorio seguro);

    SeguroObligarorio findByTransaction(String transaction);

}
