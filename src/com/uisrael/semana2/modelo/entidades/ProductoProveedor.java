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
@Table(name="TB_ProductosProveedor")
public class ProductoProveedor {
    @Id
    @GeneratedValue
    private Integer idProductoProveedor;
    private Integer idProducto;
    private Integer idProveedor;

    public ProductoProveedor() {
    }

    public ProductoProveedor(Integer idProductoProveedor, Integer idProducto, Integer idProveedor) {
        this.idProductoProveedor = idProductoProveedor;
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public Integer getIdProductoProveedor() {
        return idProductoProveedor;
    }

    public void setIdProductoProveedor(Integer idProductoProveedor) {
        this.idProductoProveedor = idProductoProveedor;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public String toString() {
        return "ProductoProveedor{" + "idProductoProveedor=" + idProductoProveedor + ", idProducto=" + idProducto + ", idProveedor=" + idProveedor + '}';
    }
    
    
}
