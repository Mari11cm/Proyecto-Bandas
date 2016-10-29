/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.medios;

import java.util.Queue;

/**
 *
 * @author Mariela
 */
public class Despacho {
    private Queue colaDespacho;
    private static final int CAPACIDAD_DESPACHO=50;
    private int tipoAEnDespacho;
    private int tipoBEnDespacho;
    private int totalEnDespacho;
    private int cantidadEnEspera;
    private int tipoAEnProduccion;
    private int tipoBEnProduccion;
    private int totalDeProducion;
    private int restantes;
    private long tiempoDeDespacho;
    
    public Despacho() {
    }
    /* -----------METODOS PRINCIPALES DE DESPACHO----------------*/
    public void agregarADespacho(ProductoElectronico producto){
        System.out.println(producto.toString());
    }
    public void despacharProductos(long tiempoDeDespacho){
        
    }  
    /* -----------FIN METODOS PRINCIPALES DE DESPACHO----------------*/

    public Queue getColaDespacho() {
        return colaDespacho;
    }

    public void setColaDespacho(Queue colaDespacho) {
        this.colaDespacho = colaDespacho;
    }

    public int getTipoAEnDespacho() {
        return tipoAEnDespacho;
    }

    public void setTipoAEnDespacho(int tipoAEnDespacho) {
        this.tipoAEnDespacho = tipoAEnDespacho;
    }

    public int getTipoBEnDespacho() {
        return tipoBEnDespacho;
    }

    public void setTipoBEnDespacho(int tipoBEnDespacho) {
        this.tipoBEnDespacho = tipoBEnDespacho;
    }

    public int getTotalEnDespacho() {
        return totalEnDespacho;
    }

    public void setTotalEnDespacho(int totalEnDespacho) {
        this.totalEnDespacho = totalEnDespacho;
    }

    public int getCantidadEnEspera() {
        return cantidadEnEspera;
    }

    public void setCantidadEnEspera(int cantidadEnEspera) {
        this.cantidadEnEspera = cantidadEnEspera;
    }

    public int getTipoAProducidos() {
        return tipoAEnProduccion;
    }

    public void setTipoAProducidos(int tipoAEnProduccion) {
        this.tipoAEnProduccion = tipoAEnProduccion;
    }

    public int getTipoBProducidos() {
        return tipoBEnProduccion;
    }

    public void setTipoBProducidos(int tipoBEnProduccion) {
        this.tipoBEnProduccion = tipoBEnProduccion;
    }

    public int getTotalDeProducion() {
        return totalDeProducion;
    }

    public void setTotalDeProducion(int totalDeProducion) {
        this.totalDeProducion = totalDeProducion;
    }

    public int getRestantes() {
        return restantes;
    }

    public void setRestantes(int restantes) {
        this.restantes = restantes;
    }

    public long getTiempoDeDespacho() {
        return tiempoDeDespacho;
    }

    public void setTiempoDeDespacho(long tiempoDeDespacho) {
        this.tiempoDeDespacho = tiempoDeDespacho;
    }
    @Override
    public String toString() {
        return "Despacho:\n" + "tipo A en Despacho: "+tipoAEnDespacho + " Tipo B "
                + "en Despacho: "+tipoBEnDespacho + " Total en Despacho: "
                +totalEnDespacho+" Restantes: "+restantes+"\n"+"Tipo A en Produccion: "+tipoAEnProduccion 
                + " Tipo B en Produccion: "+tipoBEnProduccion+" Total de "
                + "Producion: "  + totalDeProducion;
    }
    
    
    
        
    
}
