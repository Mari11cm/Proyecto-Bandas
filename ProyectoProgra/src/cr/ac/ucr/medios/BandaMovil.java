/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.medios;

/**
 *
 * @author Mriela
 */
public class BandaMovil extends Banda implements Runnable{
    private Thread hiloMovil;

    @Override
    public void run() {
        
    }

    public BandaMovil(Thread hiloMovil, String marca, int anioFabricacion, 
            String nombreProductoAFabricar, String tipoProductoAFabricar) {
        super(marca, anioFabricacion, nombreProductoAFabricar, 
                tipoProductoAFabricar);
        this.hiloMovil = hiloMovil;
    }

    
    
}
