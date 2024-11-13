package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.Banco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BancoRepository extends JpaRepository<Banco, Long> {

    void saveBanco(Banco banco);

    Banco findByTransaction(String transaction);
}
