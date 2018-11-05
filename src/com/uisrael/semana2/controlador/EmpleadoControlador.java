/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;

import com.uisrael.semana2.modelo.DAO.EmpleadoDAO;
import com.uisrael.semana2.modelo.entidades.Empleado;


/**
 *
 * @author master
 */
public class EmpleadoControlador {
    public void insertarEmpleado(Integer Id, String Cedula, String Nombre, String Apellido, String Direccion, String Cargo,String Telefono, Double Salario){
        try{
            EmpleadoDAO sql = new EmpleadoDAO();
            Empleado empleado1 = new Empleado();
            empleado1.setIdEmpleado(Id);
            empleado1.setCi(Cedula);
            empleado1.setNombre(Nombre);
            empleado1.setApellido(Apellido);
            empleado1.setTelefono(Telefono);
            empleado1.setCargo(Cargo);
            empleado1.setDireccion(Direccion);
            empleado1.setSalario(Salario);
            sql.insertarEmpleado(empleado1);
            
        }catch (Exception ex){
        }
    }
}
