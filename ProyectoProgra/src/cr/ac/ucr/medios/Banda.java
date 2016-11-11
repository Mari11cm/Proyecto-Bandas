
package cr.ac.ucr.medios;

import static cr.ac.ucr.mainclases.ClasePrincipal.*;
import static cr.ac.ucr.medios.Despacho.agregarADespacho;
import static java.lang.Thread.sleep;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariela
 */
public abstract class Banda extends Thread {

    private String marca;
    private int anioFabricacion;
    private String nombreProductoAFabricar;
    private String tipoProductoAFabricar;
    private String estado;
    private int cantidadProductosElaborados;
    long velocidad;
    private int tiempoActual;
    private int tiempoRestante;
    private Date horaYFechaActual;
    private boolean pausa;


    /*OPCIONAL
    private Date horaActual;
    private Date fechaActual;*/
    public Banda(String marca, int anioFabricacion, String nombreProductoAFabricar,
            String tipoProductoAFabricar, long velocidad) {
        this.marca = marca;
        this.anioFabricacion = anioFabricacion;
        this.nombreProductoAFabricar = nombreProductoAFabricar;
        this.tipoProductoAFabricar = tipoProductoAFabricar;
        this.velocidad = velocidad;
        estado = "Dañada";
        //cantidadProductosElaborados=0;
        tiempoActual = 0;
        tiempoRestante = 0;
        horaYFechaActual = new Date();
        pausa = true;
    }

    /* -----------METODOS PRINCIPALES DE LAS BANDAS----------------*/
    public void producirItem(long velocidad) {
        if(tipoProductoAFabricar.equals("A")){
            Computador com1 = new Computador("verde", "HP", "E200", 32000, 24, "CORE I3", 4, false, "A");
            agregarADespacho(com1);
            tipoAEnProduccion++;
        }
        else{
            Movil mov1 = new Movil("negro", "Samsung", "E200", 32000, 12, 32.9,12.3,"B");
            agregarADespacho(mov1);
            tipoBEnProduccion++;
        }
        try {
            sleep(velocidad);
        } catch (InterruptedException ex) {
            Logger.getLogger(Banda.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public synchronized void pausarBanda() {
        if (pausa) {
            try {
                sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BandaComputador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    public synchronized void reanudarBanda(long velocidad) {
        setEstado("Produciendo");
        pausa = false;
        setVelocidad(velocidad);
        System.out.println("Banda Reanudada");
    }

    public synchronized void mantenimientoDeBanda(int tiempoRestante) {
        try {
            pausa=false;
            System.out.println("\nBANDA EN MANTENIMIENTO" + getId());
            sleep(30000);
            System.out.println("\nYA DORMI VUELVO A PRODUCIR" + getId());
            setEstado("Produciendo");
            setVelocidad(restantes);
        } catch (InterruptedException ex) {
            Logger.getLogger(Banda.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void bandaDañada() {
         if (pausa) {
            try {
                sleep(4000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BandaComputador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
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
        return "Banda\n" + "Marca: " + marca + "Año Fabricacion: "
                + anioFabricacion + "Nombre del Producto a Fabricar: "
                + nombreProductoAFabricar + "Tipo de Producto a Fabricar: "
                + tipoProductoAFabricar;
    }

}
