/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.mainclases;

import cr.ac.ucr.medios.ProductoElectronico;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Semaphore;

/**
 *
 * @author Mariela
 */
public class ClasePrincipal {

    public static final int CAPACIDAD_DESPACHO = 50;
    public static Queue colaDespacho = new <ProductoElectronico>LinkedList();
    public static int cantidadProductosElaborados = 0;
    public static Semaphore semaforoBanda1 = new Semaphore(1);
    public static Semaphore semaforoBanda2 = new Semaphore(0);
    public static Semaphore semaforoDespacho = new Semaphore(2);
    public static Semaphore mutex = new Semaphore(1);
    public static int tipoAEnDespacho=0;
    public static int tipoBEnDespacho=0;
    public static int totalEnDespacho=0;
    public static int cantidadEnEspera=0;
    public static int tipoAEnProduccion=0;
    public static int tipoBEnProduccion=0;
    public static int totalDeProducion=0;
    public static int restantes=0;
    public static boolean pausa=true;
    public static int faltaDeEspacio=0;
    
}
