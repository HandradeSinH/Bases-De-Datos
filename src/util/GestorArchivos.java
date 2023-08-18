package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sala_12
 */
public class GestorArchivos {
    public static boolean guardarInfo(List<String> datos, String archivo, String ruta){
        if (archivo.isEmpty()|| datos.size() == 0)
            return false;
        File f = null;
        if (ruta == null || ruta.isEmpty()){
            f = new File(archivo);
        }else{
            f = new File(ruta, archivo);
        }
        FileWriter fw;
        try {
            fw = new FileWriter(f, true);
            for (String dato : datos) {
                fw.write(dato+"\n");
            }
            fw.close();
            return true;

        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        return false;
    }
    public static List<String> leerInfo(String archivo, String ruta){
        if (archivo.isEmpty())
            return null;
        File f = null;
        if (ruta == null || ruta.isEmpty()){
            f = new File(archivo);
        }else{
            f = new File(ruta, archivo);
        }
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br =new BufferedReader(fr);
            
            List<String> datos = new ArrayList<>();
            String linea = "";
            while((linea = br.readLine()) != null){
                datos.add(linea);
            }
            return datos;
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestorArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return null;
    }
}
