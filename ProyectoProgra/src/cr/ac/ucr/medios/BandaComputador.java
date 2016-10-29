/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.medios;

/**
 *
 * @author Mariela
 */
public class BandaComputador extends Banda implements Runnable{
    Thread hiloComputador;

    public BandaComputador(Thread hiloComputador, String marca, 
            int anioFabricacion, String nombreProductoAFabricar, 
            String tipoProductoAFabricar) {
        super(marca, anioFabricacion, nombreProductoAFabricar, tipoProductoAFabricar);
        this.hiloComputador = hiloComputador;
    }

    @Override
    public void run() {
        
    }
}
