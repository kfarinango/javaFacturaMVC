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
@Table(name="TB_DetFactura")
public class DetFactura {
    @Id
    @GeneratedValue
    private Integer idDetFactura;
    private String fecha;
    private String nombCliente;
    private String ci_Ruc;
    private String dirCliente;
    private String telfCliente;

    public DetFactura() {
    }

    public DetFactura(Integer idDetFactura, String fecha, String nombCliente, String ci_Ruc, String dirCliente, String telfCliente) {
        this.idDetFactura = idDetFactura;
        this.fecha = fecha;
        this.nombCliente = nombCliente;
        this.ci_Ruc = ci_Ruc;
        this.dirCliente = dirCliente;
        this.telfCliente = telfCliente;
    }

    public String getTelfCliente() {
        return telfCliente;
    }

    public void setTelfCliente(String telfCliente) {
        this.telfCliente = telfCliente;
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

    public String getNombCliente() {
        return nombCliente;
    }

    public void setNombCliente(String nombCliente) {
        this.nombCliente = nombCliente;
    }

    public String getCi_Ruc() {
        return ci_Ruc;
    }

    public void setCi_Ruc(String ci_Ruc) {
        this.ci_Ruc = ci_Ruc;
    }

    public String getDirCliente() {
        return dirCliente;
    }

    public void setDirCliente(String dirCliente) {
        this.dirCliente = dirCliente;
    }

    @Override
    public String toString() {
        return "DetFactura{" + "idDetFactura=" + idDetFactura + ", fecha=" + fecha + ", nombCliente=" + nombCliente + ", ci_Ruc=" + ci_Ruc + ", dirCliente=" + dirCliente + ", telfCliente=" + telfCliente + '}';
    }
    
    
}
