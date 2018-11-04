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
@Table(name="TB_Proveedores")
public class Proveedores {
    @Id
    @GeneratedValue
    private Integer idProveedor;
    private String ci;
    private String nombre;
    private String apellido;
    private String direccion;
    private String razonSocial;
    private String correo;
    private String sectorComercial;

    public Proveedores() {
    }

    public Proveedores(Integer idProveedor, String ci, String nombre, String apellido, String direccion, String razonSocial, String correo, String sectorComercial) {
        this.idProveedor = idProveedor;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.razonSocial = razonSocial;
        this.correo = correo;
        this.sectorComercial = sectorComercial;
    }

    public Integer getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(Integer idProveedor) {
        this.idProveedor = idProveedor;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSectorComercial() {
        return sectorComercial;
    }

    public void setSectorComercial(String sectorComercial) {
        this.sectorComercial = sectorComercial;
    }

    @Override
    public String toString() {
        return "Proveedores{" + "idProveedor=" + idProveedor + ", ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", razonSocial=" + razonSocial + ", correo=" + correo + ", sectorComercial=" + sectorComercial + '}';
    }
    
    
}
