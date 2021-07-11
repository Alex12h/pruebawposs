package com.banco.banco.persistence.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Usuario")
public class Usuario {
    @Id
    @Column(name = "num_doc")
    private Integer numDoc;

    @Column(name = "nombre_completo")
    private String nombreCompleto;

    @Column(name = "id_tipo_documento")
    private Integer idTipoDocumento;

    @Column(name = "num_celular")
    private String numCelular;

    private String email;

    private String password;

    private Boolean estado;

    @ManyToOne
    @JoinColumn(name = "id_tipo_documento", insertable = false, updatable = false)
    private TipoDocumento tipoDocumento;

    @OneToMany(mappedBy = "usuario")
    private List<NroCuenta> nroCuentas;


    public Integer getNumDoc() {
        return numDoc;
    }

    public void setNumDoc(Integer numDoc) {
        this.numDoc = numDoc;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    public String getNumCelular() {
        return numCelular;
    }

    public void setNumCelular(String numCelular) {
        this.numCelular = numCelular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public List<NroCuenta> getNroCuentas() {
        return nroCuentas;
    }

    public void setNroCuentas(List<NroCuenta> nroCuentas) {
        this.nroCuentas = nroCuentas;
    }
}
