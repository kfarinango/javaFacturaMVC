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
    private String nombreProducto;
    private Integer cantidad;
    private Double subTotal;
    private Double impuestos;
    private Double total;
    private String vendedor;

    public Factura() {
    }

    public Factura(Integer idFactura, String nombreProducto, Integer cantidad, Double subTotal, Double impuestos, Double total) {
        this.idFactura = idFactura;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.subTotal = subTotal;
        this.impuestos = impuestos;
        this.total = total;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(Integer idFactura) {
        this.idFactura = idFactura;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(Double impuestos) {
        this.impuestos = impuestos;
    }

    @Override
    public String toString() {
        return "Factura{" + "idFactura=" + idFactura + ", nombreProducto=" + nombreProducto + ", cantidad=" + cantidad + ", subTotal=" + subTotal + ", impuestos=" + impuestos + ", total=" + total + '}';
    }
    
}
