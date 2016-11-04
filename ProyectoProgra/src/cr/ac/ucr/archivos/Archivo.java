/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.archivos;

import cr.ac.ucr.medios.ProductoElectronico;

/**
 *
 * @author Mariela
 */
public class Archivo {
    private String rutaProduccion;
    private String rutaConflictos;

    public Archivo(String rutaProduccion, String rutaConflictos) {
        this.rutaProduccion = rutaProduccion;
        this.rutaConflictos = rutaConflictos;
    }
    /* -----------METODOS PRINCIPALES DE LAS BANDAS----------------*/
   
    public static void registrarProducto(ProductoElectronico producto){
        System.out.println("Registró correctamente");
        
    }
    public void registrarConflictos(){
        
    }
    /* -----------FIN METODOS PRINCIPALES DE DESPACHO----------------*/
    public String getRutaProduccion() {
        return rutaProduccion;
    }


    public void setRutaProduccion(String rutaProduccion) {
        this.rutaProduccion = rutaProduccion;
    }

    public String getRutaConflictos() {
        return rutaConflictos;
    }

    public void setRutaConflictos(String rutaConflictos) {
        this.rutaConflictos = rutaConflictos;
    }
    
    @Override
    public String toString() {
        return "Archivo\n" + "Ruta Produccion: " +rutaProduccion 
                +" Ruta Conflictos:" + rutaConflictos;
    }
    
}
