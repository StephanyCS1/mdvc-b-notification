package com.bimoney.msvcnotifications.Repository;

import com.bimoney.msvcnotifications.Entity.TarjetaOperacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarjetaOperacionRepository extends JpaRepository<TarjetaOperacion, Long> {

    void saveTarjetaOperacion(TarjetaOperacion tarjetaOperacion);

    TarjetaOperacion findByTransaccion(String transaccion);

}
