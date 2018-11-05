/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uisrael.semana2.modelo.DAO;

import com.uisrael.semana2.modelo.entidades.Productos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Asus
 */
public class ProductosDAO {
    private static EntityManager getEntityManger() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("semana2PU");
        EntityManager em = emf.createEntityManager();
        return em;
    }
    public void insertarProducto(Productos producto){
           
       try{
        EntityManager em = getEntityManger();
        if(em.isOpen()){
            System.out.println("Cambio exitoso");
            
        }else{
            System.err.println("Error revise la conexcion a la base de datos"); 
        }
                  
        EntityTransaction etx = em.getTransaction();
        etx.begin();
        em.persist(producto);
        etx.commit();
        
        } catch(Exception ex){
            ex.printStackTrace();
        }
    }
}
