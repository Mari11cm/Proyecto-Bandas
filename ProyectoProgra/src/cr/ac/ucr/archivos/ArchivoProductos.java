
package cr.ac.ucr.archivos;

import cr.ac.ucr.medios.ProductoElectronico;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Calendar;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jpsb2
 */
public class ArchivoProductos {

    public ArchivoProductos() {
    }
    
    public void registrarProductos(ProductoElectronico producto, int segundosBanda){
        
        try {
            File listaProductos= new File("Producción.txt");
            FileOutputStream fos = new FileOutputStream(listaProductos,true);
            PrintStream ps= new PrintStream(fos);
            Calendar calendario = Calendar.getInstance();
            int hora,min,seg;
            hora= calendario.get(Calendar.HOUR_OF_DAY);
            min= calendario.get(Calendar.MINUTE);
            seg= calendario.get(Calendar.SECOND);
            String reloj= hora+":"+min+":"+seg;
            
            ps.println("Hora: "+reloj+" - "+"Tipo: "+producto.getTipo()+" - "+"Modelo: "+producto.getModelo()+" - "+"Marca: "+producto.getMarca()+" - "+"Tiempo de producción: "+segundosBanda+";");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }//fin registrar productos
    
    
    public BufferedReader getBufferedReader(){

    BufferedReader entradaArchivo=null;

    File listaProductos= new File("Producción.txt");
        try {
            FileInputStream fis = new FileInputStream(listaProductos);
            InputStreamReader isr=new InputStreamReader(fis);
            entradaArchivo=new BufferedReader(isr);
        }//fin try
        catch(FileNotFoundException fnfe){

            JOptionPane.showMessageDialog(null,"Problemas con el archivo");

        }//fin catch

    return entradaArchivo;

    }//fin BufferedReader
    
    public int[] cuentaTipos(){
        int [] lista= new int[2];
        int contTipoA=0;
        int contTipoB=0;
        try {
            
            
            BufferedReader br=getBufferedReader();
            String registroActual =br.readLine();
            
            while(registroActual!=null){
                StringTokenizer st= new StringTokenizer(registroActual,"-");
                
                String hora= "", tipo="", modelo="",marca="",tiempoDeProduccion="";
                
                
                int HORA=1, TIPO=2, MODELO=3 , MARCA= 4, TIEMPODEPRODUCCION=5, cont=1;
                
                while(st.hasMoreTokens()){
                    if(cont==HORA)
                        hora= st.nextToken();
                    
                    else if(cont==TIPO)
                        tipo= st.nextToken();
                    
                    else if(cont==MODELO)
                        modelo= st.nextToken();
                    
                    else if(cont==MARCA)
                        marca=st.nextToken();
                    
                    else if(cont==TIEMPODEPRODUCCION)
                        tiempoDeProduccion=st.nextToken();
                    
                    
                    cont++;
                    
                    
                }//while(st.hasMoreTokens())
                
                char aux=tipo.charAt(tipo.length()-2);
                System.out.println(aux);
                if(aux=='A'){
                    contTipoA++;
                }
                else{
                    contTipoB++;
                }
                
                registroActual=br.readLine();
                
            }// fin while(registroActual!=null && encontrado==false
            
            lista[0]=contTipoA;
            lista[1]=contTipoB;
            
            
           
        } catch (IOException ex) {
            Logger.getLogger(ArchivoProductos.class.getName()).log(Level.SEVERE, null, ex);
        }
     return lista;
    }
    
}
