/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;

import com.uisrael.semana2.modelo.DAO.ClienteDAO;
import com.uisrael.semana2.modelo.entidades.Cliente;

/**
 *
 * @author master
 */
public class ClienteControlador {
    int id;
    public void insertarCliente(Integer Id, String Cedula, String Nombre, String Apellido, String Direccion, String Telefono){
        try{
            ClienteDAO sql = new ClienteDAO();
            Cliente cliente1 = new Cliente();
            cliente1.setIdCliente(Id);
            cliente1.setClienteNombre(Nombre);
            cliente1.setClienteApellido(Apellido);
            cliente1.setClienteDireccion(Direccion);
            cliente1.setClienteCi(Cedula);
            cliente1.setClienteTelefono(Telefono);
            sql.insertarCliente(cliente1);
            
        }catch (Exception ex){
        }
    }
}
