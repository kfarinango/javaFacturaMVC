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
@Table(name="TB_Productos")
public class Productos {
    @Id
    @GeneratedValue
    private Integer idProducto;
    private String codigoBarras;
    private String Nombre;
    private Double precio;

    public Productos() {
    }

    public Productos(Integer idProducto, String codigoBarras, String Nombre, Double precio) {
        this.idProducto = idProducto;
        this.codigoBarras = codigoBarras;
        this.Nombre = Nombre;
        this.precio = precio;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    @Override
    public String toString() {
        return "Productos{" + "idProducto=" + idProducto + ", codigoBarras=" + codigoBarras + ", Nombre=" + Nombre + ", precio=" + precio + '}';
    }
    
}
