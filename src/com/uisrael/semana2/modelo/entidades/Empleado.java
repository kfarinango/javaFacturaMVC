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
@Table(name="TB_Empleado")
public class Empleado {
    @Id
    @GeneratedValue
    private Integer idEmpleado;
    private String ci;
    private String nombre;
    private String apellido;
    private String telefono;
    private String direccion;
    private String cargo;
    private Double salario;

    public Empleado() {
    }

    public Empleado(Integer idEmpleado, String ci, String nombre, String apellido, String numero, String direccion, String cargo, Double salario) {
        this.idEmpleado = idEmpleado;
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = numero;
        this.direccion = direccion;
        this.cargo = cargo;
        this.salario = salario;
    }

    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Integer idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "idEmpleado=" + idEmpleado + ", ci=" + ci + ", nombre=" + nombre + ", apellido=" + apellido + ", numero=" + telefono + ", direccion=" + direccion + ", cargo=" + cargo + ", salario=" + salario + '}';
    }

    
}
