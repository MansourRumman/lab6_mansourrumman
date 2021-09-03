/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_mansourrumman;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author manso
 */
public class aes {
        private ArrayList<estu> lp = new ArrayList();
    private File archivo = null;

    public aes(String path) {
        archivo=new File(path);
    }

    public ArrayList<estu> getLp() {
        return lp;
    }

    public void setLp(ArrayList<estu> lp) {
        this.lp = lp;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "aes{" + "lp=" + lp + ", archivo=" + archivo + '}';
    }
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (estu t : lp) {
                bw.write(t.getAc() + ";");
                bw.write(t.getNom() + ";");
                bw.write(t.getApel() + ";");
                bw.write(t.getCar() + ";");
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
                    lp.add(new estu(sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next())                      
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
 

}
