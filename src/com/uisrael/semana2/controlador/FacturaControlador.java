/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;

import com.uisrael.semana2.modelo.DAO.FacturaDAO;
import com.uisrael.semana2.modelo.entidades.Factura;


/**
 *
 * @author Asus
 */
public class FacturaControlador {
    public void InsertarFactura(int IdFactura, int cantidad,int idProducto){
       
    try{
            FacturaDAO sql = new FacturaDAO();
            Factura factura1 = new Factura();
            factura1.setIdFactura(IdFactura);
            factura1.setCantidad(cantidad);
            factura1.setIdProducto(idProducto);
            sql.insertarFactura(factura1);
            
        }catch (Exception ex){
        }
    }
}
