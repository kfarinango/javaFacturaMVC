/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;


import com.uisrael.semana2.controlador.ClienteControlador;
import com.uisrael.semana2.controlador.DetFacturaControlador;
import com.uisrael.semana2.controlador.EmpleadoControlador;
import com.uisrael.semana2.controlador.FacturaControlador;
import com.uisrael.semana2.controlador.ProductoProveedorControlador;
import com.uisrael.semana2.controlador.ProductosControlador;
import com.uisrael.semana2.controlador.ProveedorControlador;

/**
 *
 * @author master
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Insertar cliente
        ClienteControlador sql= new ClienteControlador();
        sql.insertarCliente(13,"1726666","Davi","Cinilin","Comite","023455767");
        //Insertar detalle factura 
        DetFacturaControlador detFactura = new DetFacturaControlador();
        detFactura.InsertarDetFactura(5,"20/12/2012",1);
        //Insertar Empleado
        EmpleadoControlador empleado = new EmpleadoControlador();
        empleado.insertarEmpleado(3, "1725569733", "Kevin", "Farinango", "Publo blanco", "Sistemas", "3256487", 320.00);
        //Insertar Factura
        FacturaControlador factura = new  FacturaControlador();
        factura.InsertarFactura(3, 2, 2);
        //Insertar producto proveedro
        ProductoProveedorControlador productoProveedor = new ProductoProveedorControlador();
        productoProveedor.insertarProveedorControlador(3, 2, 2);
        //Insertar producto
        ProductosControlador producto = new ProductosControlador();
        producto.insertarProducto(4, "10292829", 23.00, "platano");
        //Insertar proveedro
        ProveedorControlador proveedor = new ProveedorControlador();
        proveedor.insertarCliente(3, "1725569724","Cinthy", "Rivas", "gygy@hotmail.com", "Pueblo blanco", "COMPAÑÍA ANÓNIMA", "educativo", "08765322");
    }
    
}
