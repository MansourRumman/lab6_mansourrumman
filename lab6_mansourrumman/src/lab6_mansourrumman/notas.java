/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6_mansourrumman;

import java.util.ArrayList;

/**
 *
 * @author manso
 */
public class notas {
    private String tit;
    private int fecha;
    private String pri;
    private ArrayList<String> e=new ArrayList();

    public notas(String tit, int fecha, String pri) {
        this.tit = tit;
        this.fecha = fecha;
        this.pri = pri;
    }

    public String getTit() {
        return tit;
    }

    public void setTit(String tit) {
        this.tit = tit;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getPri() {
        return pri;
    }

    public void setPri(String pri) {
        this.pri = pri;
    }

    public ArrayList<String> getE() {
        return e;
    }

    public void setE(ArrayList<String> e) {
        this.e = e;
    }

    @Override
    public String toString() {
        return "notas{" + "tit=" + tit + ", fecha=" + fecha + ", pri=" + pri + ", e=" + e + '}';
    }
    
    
}
