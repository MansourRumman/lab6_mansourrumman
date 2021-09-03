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

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author manso
 */
public class ano {

    private ArrayList<norm> lp = new ArrayList();
    private File archivo = null;

    public ano(String path) {
        archivo = new File(path);
    }

    public ArrayList<norm> getLp() {
        return lp;
    }

    public void setLp(ArrayList<norm> lp) {
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
            for (norm t : lp) {
                bw.write(t.getHob() + ";");
                bw.write(t.getNom() + ";");
                bw.write(t.getApel() + ";");
                bw.write(t.getIntes() + ";");
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
                    lp.add(new norm(sc.next(), sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next())
                    );
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }

}
