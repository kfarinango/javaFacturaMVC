/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.modelo.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author master
 */
@Entity
@Table(name="TB_DetFactura")
public class DetFactura {
    @Id
    @GeneratedValue
    private Integer idDetFactura;
    private String fecha;
    private Integer idCliente;
    private String rucEmpresa;

    public DetFactura() {
    }

    public DetFactura(Integer idDetFactura, String fecha, Integer idCliente, String rucEmpresa) {
        this.idDetFactura = idDetFactura;
        this.fecha = fecha;
        this.idCliente = idCliente;
        this.rucEmpresa = rucEmpresa;
    }
    
    public Integer getIdDetFactura() {
        return idDetFactura;
    }

    public void setIdDetFactura(Integer idDetFactura) {
        this.idDetFactura = idDetFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getRucEmpresa() {
        return rucEmpresa;
    }

    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }

    @Override
    public String toString() {
        return "DetFactura{" + "idDetFactura=" + idDetFactura + ", fecha=" + fecha + ", idCliente=" + idCliente + ", rucEmpresa=" + rucEmpresa + '}';
    } 
    
}
