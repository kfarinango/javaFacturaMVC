/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.modelo.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author master
 */
@Entity
@Table(name="TB_Factura")
public class Factura {
    @Id
    @GeneratedValue
    private Integer idFactura;
    private Integer cantidad;
    private Integer IdProducto;

    public Factura() {
    }

    public Factura(Integer idFactura, Integer cantidad, Integer IdProducto) {
        this.idFactura = idFactura;
        this.cantidad = cantidad;
        this.IdProducto = IdProducto;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Integer getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(Integer IdProducto) {
        this.IdProducto = IdProducto;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", cantidad=" + cantidad + ", IdProducto=" + IdProducto + '}';
    }

    
}
