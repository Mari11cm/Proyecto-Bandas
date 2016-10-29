/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.ac.ucr.modelos;

/**
 *
 * @author Mariela
 */
public class Gerente {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String correo;
    private String contrasenia;

    public Gerente(String nombre, String apellidos, String telefono, String correo) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.correo = correo;
        contrasenia="";
    }
    
    public void crearContrasenia(){
       contrasenia=nombre.charAt(0)+""+apellidos.charAt(0);
        for (int i = 0; i < apellidos.length(); i++) {
            if(apellidos.charAt(i)==' '){
                contrasenia+=apellidos.charAt(i+1)+""+(int)(Math.random()*234);
            }
        }
    }
    public void cambiarContrasenia(String contrasenia) {
            this.contrasenia = contrasenia;
    }
    public void restaurarContrasenia(){
        //CORREO
    }     

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    @Override
    public String toString(){
        return "Gerente:\nNombre: "+nombre+" Apellidos: "+apellidos+" Telefono: "
                +telefono+" Correo: "+correo+" Contraseña: "+contrasenia;
    }
    
    
}
