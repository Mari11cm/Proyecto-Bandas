/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.medios;

import static cr.ac.ucr.mainclases.ClasePrincipal.*;
import static cr.ac.ucr.medios.Despacho.despacharProductos;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mariela
 */
public class BandaComputador extends Banda implements Runnable {

    public Random ran = new Random();

    public BandaComputador(String marca, int anioFabricacion, String nombreProductoAFabricar,
            String tipoProductoAFabricar, long velocidad) {
        super(marca, anioFabricacion, nombreProductoAFabricar, tipoProductoAFabricar, velocidad);
    }

    @Override
    public void run() {
        
        while (true) {

            if (getEstado().equals("Produciendo")) {
                 producirItem(velocidad);
            }
              
            else if (getEstado().equals("Esperando")) {
                pausarBanda();
            } 
            else if (getEstado().equals("Reanudar")) {
                reanudarBanda(velocidad);
            } 
            else if (getEstado().equals("Mantenimiento")) {
                mantenimientoDeBanda(restantes);
            } 
            else if (colaDespacho.size() % CAPACIDAD_DESPACHO == 0) {
                setEstado("Dañada");
                faltaDeEspacio++;
            } 
            else if (cantidadProductosElaborados % 100 == 0) {
                setEstado("Dañada");
            } 
            else if (getEstado().equals("Dañada")) {
                pausarBanda();
            } 
            else if (getEstado().equals("Dañada") && faltaDeEspacio % 5 == 0) {
                long tiempo = (int) (ran.nextDouble() * 6 + 1) * 1000;
                despacharProductos(tiempo);
            }

        }
    }

}
