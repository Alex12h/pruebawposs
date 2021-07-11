package com.banco.banco.persistence;

import com.banco.banco.persistence.crud.MovimientoCrudRepository;
import com.banco.banco.persistence.entity.Movimiento;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class MovimientoRepository {
    private MovimientoCrudRepository movimientoCrudRepository;

    public Optional<List<Movimiento>> getMovimientosCuentaOrigenId(Integer idCuentaOrigen){
        return movimientoCrudRepository.findByIdCuentaOrigenOrderByIdMovimientoAsc(idCuentaOrigen);

    }

    public Optional<List<Movimiento>> getMovimientosCuentaDestinoId(Integer idCuentaDestino) {
        return movimientoCrudRepository.findByIdCuentaDestinoOrderByIdMovimientoAsc(idCuentaDestino);
    }
}
