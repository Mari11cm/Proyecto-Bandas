
package cr.ac.ucr.archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
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
public class ArchivoConflictos {

    public ArchivoConflictos() {
    }
    
    public void guardarConflictos(String conflicto){
        
       
        try {
            File listaProductos= new File("Conflictos.txt");
            FileOutputStream fos = new FileOutputStream(listaProductos,true);
            PrintStream ps= new PrintStream(fos);
            Calendar calendario = Calendar.getInstance();
            int hora,min,seg;
            hora= calendario.get(Calendar.HOUR_OF_DAY);
            min= calendario.get(Calendar.MINUTE);
            seg= calendario.get(Calendar.SECOND);
            String reloj= hora+":"+min+":"+seg;
            
            ps.println(generaAutoIncremental()+" - "+conflicto+" - "+ reloj);
            
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoConflictos.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    
    
    }
    
        public BufferedReader getBufferedReader(){

        BufferedReader entradaArchivo=null;

        File listaConflictos= new File("Conflictos");
            try {
                FileInputStream fis = new FileInputStream(listaConflictos);
                InputStreamReader isr=new InputStreamReader(fis);
                entradaArchivo=new BufferedReader(isr);
            }//fin try
            catch(FileNotFoundException fnfe){

                JOptionPane.showMessageDialog(null,"Problemas con el archivo");

            }//fin catch

        return entradaArchivo;

    }//fin BufferedReader
        
    public int generaAutoIncremental(){
     int num=0;
    File archivoCon=new File("Conflictos.txt");
    
        try {
            BufferedReader buf= new BufferedReader(new FileReader(archivoCon));
            String linea="";
            
       try {
            //En este caso la condicion final del while corresponde a null, para indicar el final de linea
             while((linea = buf.readLine()) != null){
             num++;
            }
                System.out.println("El número de líneas :" + num);
               } catch (IOException e) {
                // TODO Bloque catch generado automáticamente
                e.printStackTrace();
                }
        } catch (FileNotFoundException e) {
                e.printStackTrace();
  }
    
    
    
    return num+1;

    }
    
  
    
}
