/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;

import com.uisrael.semana2.modelo.DAO.ProveedoresDAO;
import com.uisrael.semana2.modelo.entidades.Proveedores;

/**
 *
 * @author Asus
 */
public class ProveedorControlador {
    public void insertarCliente(Integer Id, String Cedula, String Nombre, String Apellido,String Correo, String Direccion,String RazonSocial, String SectorComercial, String Telefono){
        try{
            ProveedoresDAO sql = new ProveedoresDAO();
            Proveedores proveedor1 = new Proveedores();
            proveedor1.setIdProveedor(Id);
            proveedor1.setCi(Cedula);
            proveedor1.setNombre(Nombre);
            proveedor1.setApellido(Apellido);
            proveedor1.setCorreo(Correo);
            proveedor1.setDireccion(Direccion);
            proveedor1.setRazonSocial(RazonSocial);
            proveedor1.setSectorComercial(SectorComercial);
            sql.insertarProveedores(proveedor1);
            
        }catch (Exception ex){
        }
    }
}
