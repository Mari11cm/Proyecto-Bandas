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
public class Movil extends ProductoElectronico {

    private double tamanioPantalla;
    private double densidadPixeles;

    public Movil(String color, String marca, String modelo, double precio,
            int mesesDEGrarantia, double tamanioPantalla, double densidadPixeles) {
        super(color, marca, modelo, precio, mesesDEGrarantia);
        this.tamanioPantalla = tamanioPantalla;
        this.densidadPixeles = densidadPixeles;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(double tamanioPantalla) {
        this.tamanioPantalla = tamanioPantalla;
    }

    public double getDensidadPixeles() {
        return densidadPixeles;
    }

    public void setDensidadPixeles(double densidadPixeles) {
        this.densidadPixeles = densidadPixeles;
    }

    @Override
    public String toString() {
        return "Movil\n" + "Tamaño Pantalla: " +tamanioPantalla+" Densidad "
                + "de Pixeles: " +densidadPixeles + super.toString();
    }
    

}
