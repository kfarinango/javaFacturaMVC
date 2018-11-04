/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;


import com.uisrael.semana2.controlador.ClienteControlador;

/**
 *
 * @author master
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ClienteControlador sql= new ClienteControlador();
        sql.insertarCliente(11,"1726666","Davi","Cinilin","Comite","023455767");
    }
    
}
