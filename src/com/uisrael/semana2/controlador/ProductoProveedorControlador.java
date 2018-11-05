/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;
import com.uisrael.semana2.modelo.DAO.ProductoProveedorDAO;
import com.uisrael.semana2.modelo.entidades.ProductoProveedor;


/**
 *
 * @author Asus
 */
public class ProductoProveedorControlador {
     public void insertarProveedorControlador(Integer Id, Integer Idproducto, Integer IdProveedor){
        try{
            ProductoProveedorDAO sql = new ProductoProveedorDAO();
            ProductoProveedor productoProveedor1 = new ProductoProveedor();
            productoProveedor1.setIdProductoProveedor(Id);
            productoProveedor1.setIdProducto(Idproducto);
            productoProveedor1.setIdProveedor(IdProveedor);
            sql.insertarProductoProveedor(productoProveedor1);
            
        }catch (Exception ex){
        }
    }
}
