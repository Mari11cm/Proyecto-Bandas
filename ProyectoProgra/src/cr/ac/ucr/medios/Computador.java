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
public class Computador extends ProductoElectronico{
    private String tipoProcesador;
    private int cantidadMemoriaRam;
    private boolean pantallaTactil;

    public Computador(String color, String marca, String modelo, double precio,
            int mesesDEGrarantia, String tipoProcesador, int cantidadMemoriaRAM, 
            boolean pantallaTactil) {
        super(color, marca, modelo, precio, mesesDEGrarantia);
        this.tipoProcesador=tipoProcesador;
        this.cantidadMemoriaRam=cantidadMemoriaRAM;
        this.pantallaTactil=pantallaTactil;
    }
   
    public String getTipoProcesador() {
        return tipoProcesador;
    }

    public void setTipoProcesador(String tipoProcesador) {
        this.tipoProcesador = tipoProcesador;
    }

    public int getCantidadMemoriaRam() {
        return cantidadMemoriaRam;
    }

    public void setCantidadMemoriaRam(int cantidadMemoriaRam) {
        this.cantidadMemoriaRam = cantidadMemoriaRam;
    }

    public boolean isPantallaTactil() {
        return pantallaTactil;
    }

    public void setPantallaTactil(boolean pantallaTactil) {
        this.pantallaTactil = pantallaTactil;
    }

    @Override
    public String toString() {
        return "Computador " + " Tipo de Procesador: "+tipoProcesador
                +" CantidadMemoriaRAM: "+cantidadMemoriaRam+ " PantallaTactil: "
                + pantallaTactil+super.toString();
    }
    
}
