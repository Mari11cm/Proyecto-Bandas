/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.medios;

import java.util.Date;

/**
 *
 * @author Mariela
 */
public abstract class Banda  {
    private String marca;
    private int anioFabricacion;
    private String nombreProductoAFabricar;
    private String tipoProductoAFabricar;
    private String estado;
    private int cantidadProductosElaborados;
    private long velocidad;
    private int tiempoActual;
    private int tiempoRestante;
    private  Date horaYFechaActual;
    /*OPCIONAL
    private Date horaActual;
    private Date fechaActual;*/

    public Banda(String marca, int anioFabricacion, String nombreProductoAFabricar, 
            String tipoProductoAFabricar) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.nombreProductoAFabricar = nombreProductoAFabricar;
        this.tipoProductoAFabricar = tipoProductoAFabricar;
        estado="Dañada";
        cantidadProductosElaborados=0;
        velocidad=1000;
        tiempoActual=0;
        tiempoRestante=0;
        horaYFechaActual=new Date();
    }
    /* -----------METODOS PRINCIPALES DE LAS BANDAS----------------*/
  
    public void producirItem(String tipoProducto, long velocidad){
        cantidadProductosElaborados++;
    }
    public void pausarBanda(){
        
    }
    public void reanudarBanda(long velocidad){
        this.velocidad=velocidad;
                
    }
    public void mantenimientoDeBanda(int tiempoRestante){
        
    }
    public void bandaDañada(){
        
    }
    /* -----------FIN METODOS PRINCIPALES DE LAS BANDAS----------------*/
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public String getNombreProductoAFabricar() {
        return nombreProductoAFabricar;
    }

    public void setNombreProductoAFabricar(String nombreProductoAFabricar) {
        this.nombreProductoAFabricar = nombreProductoAFabricar;
    }

    public String getTipoProductoAFabricar() {
        return tipoProductoAFabricar;
    }

    public void setTipoProductoAFabricar(String tipoProductoAFabricar) {
        this.tipoProductoAFabricar = tipoProductoAFabricar;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCantidadProductosElaborados() {
        return cantidadProductosElaborados;
    }

    public void setCantidadProductosElaborados(int cantidadProductosElaborados) {
        this.cantidadProductosElaborados = cantidadProductosElaborados;
    }

    public long getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(long velocidad) {
        this.velocidad = velocidad;
    }

    public int getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(int tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public int getTiempoRestante() {
        return tiempoRestante;
    }

    public void setTiempoRestante(int tiempoRestante) {
        this.tiempoRestante = tiempoRestante;
    }

    public Date getHoraYFechaActual() {
        return horaYFechaActual;
    }

    public void setHoraYFechaActual(Date horaYFechaActual) {
        this.horaYFechaActual = horaYFechaActual;
    }

    @Override
    public String toString() {
        return "Banda\n"+"Marca: " + marca + "Año Fabricacion: " 
                +anioFabricacion+"Nombre del Producto a Fabricar: "
                + nombreProductoAFabricar + "Tipo de Producto a Fabricar: " 
                + tipoProductoAFabricar;
    }
   
            
}
