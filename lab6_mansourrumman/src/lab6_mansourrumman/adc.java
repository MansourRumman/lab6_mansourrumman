/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_mansourrumman;

/**
 *
 * @author manso
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class adc {

    private ArrayList<crea> lp = new ArrayList();
    private File archivo = null;

    public adc(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<crea> getlp() {
        return lp;
    }

    public void setlp(ArrayList<crea> lp) {
        this.lp=lp;
    }


    @Override
    public String toString() {
        return "adc{" + "lp=" + lp + ", archivo=" + archivo + '}';
    }

 

    //extra mutador
    public void setPersona(crea p) {
        this.lp.add(p);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (crea t : lp) {
                bw.write(t.getEdad() + ";");
                bw.write(t.getNom() + ";");
                bw.write(t.getApel() + ";");
                bw.write(t.getOcupacion() + ";");
                bw.write(t.getUser() + ";");
                bw.write(t.getCon() + ";");
                bw.write(t.getCorreo() + ";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner sc = null;
        lp = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    lp.add(new crea(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next())                      
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
