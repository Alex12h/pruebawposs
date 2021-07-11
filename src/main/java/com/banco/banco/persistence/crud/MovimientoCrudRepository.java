package com.banco.banco.persistence.crud;

import com.banco.banco.persistence.entity.Movimiento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface MovimientoCrudRepository extends CrudRepository<Movimiento, Integer> {
    Optional<List<Movimiento>> findByIdCuentaOrigenOrderByIdMovimientoAsc(Integer idCuentaOrigen);

    Optional<List<Movimiento>> findByIdCuentaDestinoOrderByIdMovimientoAsc(Integer idCuentaDestino);

}
