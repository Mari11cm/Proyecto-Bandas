
package cr.ac.ucr.archivos;

import cr.ac.ucr.medios.ProductoElectronico;
import cr.ac.ucr.modelos.Gerente;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Solano
 */
public class ArchivoGerente {
    

    public ArchivoGerente() {
        
    }
    
   

   
 
    
    public void registrarNuevoGerente(Gerente gerenteNuevo){
        
   
        try {
            File listaGerentes= new File("Gerentes");
            FileOutputStream fos = new FileOutputStream(listaGerentes,true);
            PrintStream ps= new PrintStream(fos);
            
            if(!buscaGerentes(gerenteNuevo.getCorreo()))
                 ps.println("\n"+gerenteNuevo.getNombre()+";"+gerenteNuevo.getApellidos()+";"+gerenteNuevo.getCorreo()+";"+gerenteNuevo.getTelefono()+";"+gerenteNuevo.getContrasenia());
            else 
                System.out.println("El correo ya está asociado a un gerente");
       
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    
    }


    
  
    public BufferedReader getBufferedReader(){

    BufferedReader entradaArchivo=null;

    File listaGerente= new File("Gerentes");
        try {
            FileInputStream fis = new FileInputStream(listaGerente);
            InputStreamReader isr=new InputStreamReader(fis);
            entradaArchivo=new BufferedReader(isr);
        }//fin try
        catch(FileNotFoundException fnfe){

            JOptionPane.showMessageDialog(null,"Problemas con el archivo");

        }//fin catch

    return entradaArchivo;

    }//fin BufferedReader
    public boolean buscaGerentes(String correoGerenteNuevo) {
        boolean encontrado= false;
   
        try {
            BufferedReader br=getBufferedReader();
            String registroActual =br.readLine();
            
            while(registroActual!=null && encontrado==false){
                StringTokenizer st= new StringTokenizer(registroActual,";");
                
                String nombreGerente= "", apellidos="", correo="",telefono="",contrasenia="";
                
                
                int NOMBREGERENTE=1, APELLIDOS=2, CORREO=3 , TELEFONO= 4, CONTRASENIA=5, cont=1;
                
                    while(st.hasMoreTokens()){
                    if(cont==NOMBREGERENTE)
                        nombreGerente= st.nextToken();
                    
                    else if(cont==APELLIDOS)
                        apellidos= st.nextToken();
                    
                    else if(cont==CORREO)
                        correo= st.nextToken();
                    
                    else if(cont==TELEFONO)
                        telefono=st.nextToken();
                    
                    else if(cont==CONTRASENIA)
                        contrasenia=st.nextToken();
                
                
                    cont++;
                    
                  
                    }//while(st.hasMoreTokens())
                      if(correoGerenteNuevo.equalsIgnoreCase(correo))
                         encontrado= true;
                     else
                         registroActual=br.readLine();
            
            }// fin while(registroActual!=null && encontrado==false

            
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    return encontrado;
    }
    
    public boolean gerenteLogin(String correoGerenteNuevo, String contrasenaGerenteNuevo) {
        boolean encontrado= false;
   
        try {
            BufferedReader br=getBufferedReader();
            String registroActual =br.readLine();
            
            while(registroActual!=null && encontrado==false){
                StringTokenizer st= new StringTokenizer(registroActual,";");
                
                String nombreGerente= "", apellidos="", correo="",telefono="",contrasenia="";
                
                
                int NOMBREGERENTE=1, APELLIDOS=2, CORREO=3 , TELEFONO= 4, CONTRASENIA=5, cont=1;
                
                    while(st.hasMoreTokens()){
                    if(cont==NOMBREGERENTE)
                        nombreGerente= st.nextToken();
                    
                    else if(cont==APELLIDOS)
                        apellidos= st.nextToken();
                    
                    else if(cont==CORREO)
                        correo= st.nextToken();
                    
                    else if(cont==TELEFONO)
                        telefono=st.nextToken();
                    
                    else if(cont==CONTRASENIA)
                        contrasenia=st.nextToken();
                
                
                    cont++;
                    
                  
                    }//while(st.hasMoreTokens())
                      if(correoGerenteNuevo.equalsIgnoreCase(correo) && contrasenaGerenteNuevo.equals(contrasenia))
                         encontrado= true;
                     else
                         registroActual=br.readLine();
            
            }// fin while(registroActual!=null && encontrado==false

            
        } catch (IOException ex) {
            Logger.getLogger(ArchivoGerente.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    return encontrado;
    }
    
    
}
