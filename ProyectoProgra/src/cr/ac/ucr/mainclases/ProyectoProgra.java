/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.mainclases;


import cr.ac.ucr.archivos.ArchivoConflictos;
import cr.ac.ucr.archivos.ArchivoGerente;
import cr.ac.ucr.archivos.ArchivoProductos;
import cr.ac.ucr.medios.Computador;
import cr.ac.ucr.medios.Despacho;
import cr.ac.ucr.medios.Movil;
import cr.ac.ucr.medios.ProductoElectronico;
import cr.ac.ucr.modelos.Gerente;

/**
 *
 * @author Mariela
 */
public class ProyectoProgra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//       Gerente gerente1=new Gerente("Mariela","Calvo Méndez","62166332", "Aleja@gmail.com");
//        System.out.println(gerente1.toString());
//        Despacho desp=new Despacho();
//        Computador com1=new Computador("verde","HP","E200",32000,24,"CORE I3",4,false);
//        desp.agregarADespacho(com1);
//
//        ArchivoProductos archivo= new ArchivoProductos();
//        
//        ProductoElectronico producto= new Computador("negro", "Dell", "dgf", 1, 0, "AMD", 0, true, "A");
//        ProductoElectronico producto2= new Computador("Blanca", "Toshiba", "2dfg", 1, 0, "AMD", 0, true, "A");
//        ProductoElectronico producto3= new Movil("negro", "Samsung", "Axe",3000000,12,22.2,123.44,"B");
//        ProductoElectronico producto4= new Movil("Blanco", "Huawei", "T550",2440000,12,22.2,123.44,"B");
//        archivo.registrarProductos(producto, 3);
//        archivo.registrarProductos(producto2, 5);
//        archivo.registrarProductos(producto3, 7);
//        archivo.registrarProductos(producto4, 6);
//        
//        int[] aux= archivo.cuentaTipos();
//        
//        for(int i=0; i<aux.length; i++){
//            System.out.println(aux[i]);
//        
//        }

        ArchivoConflictos archivo= new ArchivoConflictos();
        
        String men= "Mantenimiento";
        
        archivo.guardarConflictos(men);
        
//        ArchivoProductos ar= new ArchivoProductos();
//        ProductoElectronico producto4= new Movil("Blanco", "Huawei", "T550",2440000,12,22.2,123.44,"B");
//        ar.registrarProductos(producto4, 0);
//        
//        ArchivoGerente a= new ArchivoGerente();
//        Gerente gerente1=new Gerente("Juan", "Solano","2348","jpsb22@hotmail.com","juan");
//        a.registrarNuevoGerente(gerente1);
        
        
    }
    
}
