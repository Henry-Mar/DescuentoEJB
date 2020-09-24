/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.entidades;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USUARIO
 */
@Entity
@Table(name = "DESCUENTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Descuento.findAll", query = "SELECT d FROM Descuento d"),
    @NamedQuery(name = "Descuento.findById", query = "SELECT d FROM Descuento d WHERE d.id = :id"),
    @NamedQuery(name = "Descuento.findByProducto", query = "SELECT d FROM Descuento d WHERE d.producto = :producto"),
    @NamedQuery(name = "Descuento.findByCodigo", query = "SELECT d FROM Descuento d WHERE d.codigo = :codigo"),
    @NamedQuery(name = "Descuento.findByDetalles", query = "SELECT d FROM Descuento d WHERE d.detalles = :detalles"),
    @NamedQuery(name = "Descuento.findBySucursal", query = "SELECT d FROM Descuento d WHERE d.sucursal = :sucursal")})
public class Descuento implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Id
    @SequenceGenerator(name="des_sec", sequenceName="sec_descuento", allocationSize = 1 )
 @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="des_sec")
    @Column(name = "ID")
    private BigDecimal id;
    @Size(max = 100)
    @Column(name = "PRODUCTO")
    private String producto;
    @Size(max = 50)
    @Column(name = "CODIGO")
    private String codigo;
    @Size(max = 100)
    @Column(name = "DETALLES")
    private String detalles;
    @Size(max = 100)
    @Column(name = "SUCURSAL")
    private String sucursal;

    public Descuento() {
    }

    public Descuento(BigDecimal id) {
        this.id = id;
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public String getSucursal() {
        return sucursal;
    }

    public void setSucursal(String sucursal) {
        this.sucursal = sucursal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Descuento)) {
            return false;
        }
        Descuento other = (Descuento) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.entidades.Descuento[ id=" + id + " ]";
    }
    
}
