package com.banco.banco.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "movimiento")
public class Movimiento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_movimiento")
    private Integer idMoviemiento;


    @Column(name = "id_cuenta_origen")
    private Integer idCuentaOrigen;

    @Column(name = "id_tipo_movimiento")
    private Integer idTipoMoviemiento;

    private Double valor;

    @Column(name = "id_cuenta_destino")
    private Integer idCuentaDestino;

    @ManyToOne
    @JoinColumn(name = "id_tipo_movimiento", insertable = false, updatable = false)
    private TipoMovimiento tipoMovimiento;

    @ManyToOne
    @JoinColumn(name = "id_cuenta_origen", insertable = false, updatable = false)
    private NroCuenta nroCuentaOrigen;

    @ManyToOne
    @JoinColumn(name = "id_cuenta_destino", insertable = false, updatable = false)
    private NroCuenta nroCuentaDestino;

    public Integer getIdMoviemiento() {
        return idMoviemiento;
    }

    public void setIdMoviemiento(Integer idMoviemiento) {
        this.idMoviemiento = idMoviemiento;
    }

    public Integer getIdCuentaOrigen() {
        return idCuentaOrigen;
    }

    public void setIdCuentaOrigen(Integer idCuentaOrigen) {
        this.idCuentaOrigen = idCuentaOrigen;
    }

    public Integer getIdTipoMoviemiento() {
        return idTipoMoviemiento;
    }

    public void setIdTipoMoviemiento(Integer idTipoMoviemiento) {
        this.idTipoMoviemiento = idTipoMoviemiento;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Integer getIdCuentaDestino() {
        return idCuentaDestino;
    }

    public void setIdCuentaDestino(Integer idCuentaDestino) {
        this.idCuentaDestino = idCuentaDestino;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public NroCuenta getNroCuentaOrigen() {
        return nroCuentaOrigen;
    }

    public void setNroCuentaOrigen(NroCuenta nroCuentaOrigen) {
        this.nroCuentaOrigen = nroCuentaOrigen;
    }

    public NroCuenta getNroCuentaDestino() {
        return nroCuentaDestino;
    }

    public void setNroCuentaDestino(NroCuenta nroCuentaDestino) {
        this.nroCuentaDestino = nroCuentaDestino;
    }
}
