/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.controlador;

import com.uisrael.semana2.modelo.DAO.DetFacturaDAO;
import com.uisrael.semana2.modelo.entidades.DetFactura;
import java.util.Date;

/**
 *
 * @author Asus
 */
public class DetFacturaControlador {
    public void InsertarDetFactura(int IddetFactura, String fecha, Integer idCliente){
        final String ruc= "172376001";
    try{
            DetFacturaDAO sql = new DetFacturaDAO();
            DetFactura detFactura1 = new DetFactura();
            detFactura1.setIdDetFactura(IddetFactura);
            detFactura1.setIdCliente(idCliente);
            detFactura1.setFecha(fecha);
            detFactura1.setRucEmpresa(ruc);
            sql.insertarDetfactura(detFactura1);
            
        }catch (Exception ex){
        }
    }
}
