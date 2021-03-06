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
public abstract class ProductoElectronico {
    private String color; 
    private String marca;
    private String modelo;
    private double precio;
    private int mesesDEGrarantia;
    private String tipo;

    public ProductoElectronico(String color, String marca, String modelo, double 
            precio, int mesesDEGrarantia, String tipo) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.mesesDEGrarantia = mesesDEGrarantia;
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getMesesDEGrarantia() {
        return mesesDEGrarantia;
    }

    public void setMesesDEGrarantia(int mesesDEGrarantia) {
        this.mesesDEGrarantia = mesesDEGrarantia;
    }

    @Override
    public String toString() {
        return  " Color: " + color + "Marca: " + marca
                +"Modelo: "+ modelo+"Precio: "+ precio+"Meses de grarantia: "
                + mesesDEGrarantia;
    }
   
    
}
