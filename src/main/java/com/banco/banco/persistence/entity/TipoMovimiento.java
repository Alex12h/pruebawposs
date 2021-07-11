package com.banco.banco.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_movimiento")
public class TipoMovimiento {
    @Id
    @Column(name = "id_tipo_movimiento")
    private Integer idTipoMovimiento;

    private String descripcion;

    @OneToMany(mappedBy = "tipoMovimiento")
    private List<Movimiento> movimientos;

    public Integer getIdTipoMovimiento() {
        return idTipoMovimiento;
    }

    public void setIdTipoMovimiento(Integer idTipoMovimiento) {
        this.idTipoMovimiento = idTipoMovimiento;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Movimiento> getMovimientos() {
        return movimientos;
    }

    public void setMovimientos(List<Movimiento> movimientos) {
        this.movimientos = movimientos;
    }
}
