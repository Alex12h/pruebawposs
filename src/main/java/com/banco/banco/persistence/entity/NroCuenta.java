package com.banco.banco.persistence.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Table(name = "nro_cuenta")
public class NroCuenta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cuenta")
    private Integer idCuenta;

    @Column(name = "num_cuenta")
    private String numCuenta;

    @Column(name = "num_doc")
    private Integer numDocumento;

    private Double monto;

    @ManyToOne
    @JoinColumn(name = "num_doc", insertable = false, updatable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "nroCuentaOrigen")
    private List<Movimiento> movimientoListOrigen;

    @OneToMany(mappedBy = "nroCuentaDestino")
    private List<Movimiento> movimientoListDestino;

    public Integer getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(Integer idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Integer getNumDocumento() {
        return numDocumento;
    }

    public void setNumDocumento(Integer numDocumento) {
        this.numDocumento = numDocumento;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Movimiento> getMovimientoListOrigen() {
        return movimientoListOrigen;
    }

    public void setMovimientoListOrigen(List<Movimiento> movimientoListOrigen) {
        this.movimientoListOrigen = movimientoListOrigen;
    }

    public List<Movimiento> getMovimientoListDestino() {
        return movimientoListDestino;
    }

    public void setMovimientoListDestino(List<Movimiento> movimientoListDestino) {
        this.movimientoListDestino = movimientoListDestino;
    }
}
