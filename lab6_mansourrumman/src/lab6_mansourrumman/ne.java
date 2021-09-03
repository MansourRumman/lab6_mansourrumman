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
public class ne extends notas {
    private String nr,pi,ar,rd;

    public ne(String nr, String pi, String ar, String rd, String tit, int fecha, String pri) {
        super(tit, fecha, pri);
        this.nr = nr;
        this.pi = pi;
        this.ar = ar;
        this.rd = rd;
    }

    public String getNr() {
        return nr;
    }

    public void setNr(String nr) {
        this.nr = nr;
    }

    public String getPi() {
        return pi;
    }

    public void setPi(String pi) {
        this.pi = pi;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public String getRd() {
        return rd;
    }

    public void setRd(String rd) {
        this.rd = rd;
    }

    @Override
    public String toString() {
        return super.toString()+  "ne{" + "nr=" + nr + ", pi=" + pi + ", ar=" + ar + ", rd=" + rd + '}';
    }
    
}
