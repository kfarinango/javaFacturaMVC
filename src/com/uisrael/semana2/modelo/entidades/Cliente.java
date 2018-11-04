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
@Table(name="TB_Cliente")
public class Cliente {
    @Id
    @GeneratedValue
    private Integer IdCliente;
    private String ClienteCi;
    private String ClienteNombre;
    private String ClienteApellido;
    private String ClienteDireccion;
    private String ClienteTelefono;

    public Cliente() {
    }

    public Cliente(Integer IdCliente, String ClienteNombre, String ClienteApellido, String ClienteCi, String ClienteDireccion, String ClienteTelefono) {
        this.IdCliente = IdCliente;
        this.ClienteNombre = ClienteNombre;
        this.ClienteApellido = ClienteApellido;
        this.ClienteCi = ClienteCi;
        this.ClienteDireccion = ClienteDireccion;
        this.ClienteTelefono = ClienteTelefono;
    }

    public Integer getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(Integer IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getClienteNombre() {
        return ClienteNombre;
    }

    public void setClienteNombre(String ClienteNombre) {
        this.ClienteNombre = ClienteNombre;
    }

    public String getClienteApellido() {
        return ClienteApellido;
    }

    public void setClienteApellido(String ClienteApellido) {
        this.ClienteApellido = ClienteApellido;
    }

    public String getClienteCi() {
        return ClienteCi;
    }

    public void setClienteCi(String ClienteCi) {
        this.ClienteCi = ClienteCi;
    }

    public String getClienteDireccion() {
        return ClienteDireccion;
    }

    public void setClienteDireccion(String ClienteDireccion) {
        this.ClienteDireccion = ClienteDireccion;
    }

    public String getClienteTelefono() {
        return ClienteTelefono;
    }

    public void setClienteTelefono(String ClienteTelefono) {
        this.ClienteTelefono = ClienteTelefono;
    }

    public void setIdCliente(Cliente id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
   
}
