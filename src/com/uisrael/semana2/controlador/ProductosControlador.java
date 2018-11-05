/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;
import com.uisrael.semana2.modelo.DAO.ProductosDAO;
import com.uisrael.semana2.modelo.entidades.Productos;

/**
 *
 * @author Asus
 */
public class ProductosControlador {
     public void insertarProducto(Integer Id, String codigoBarras, Double precio,String Nombre){
        try{
            ProductosDAO sql = new ProductosDAO();
            Productos producto1 = new Productos();
            producto1.setIdProducto(Id);
            producto1.setCodigoBarras(codigoBarras);
            producto1.setNombre(Nombre);
            producto1.setPrecio(precio);
            
            sql.insertarProducto(producto1);
            
        }catch (Exception ex){
        }
    }
}
