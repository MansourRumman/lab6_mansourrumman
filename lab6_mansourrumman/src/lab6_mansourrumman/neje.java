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
public class neje extends notas {
    private String rt,pi,ar,rd;

    public neje(String rt, String pi, String ar, String rd, String tit, int fecha, String pri) {
        super(tit, fecha, pri);
        this.rt = rt;
        this.pi = pi;
        this.ar = ar;
        this.rd = rd;
    }


    public String getRt() {
        return rt;
    }

    public void setRt(String rt) {
        this.rt = rt;
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
        return super.toString()+ "neje{" + "rt=" + rt + ", pi=" + pi + ", ar=" + ar + ", rd=" + rd + '}';
    }
    
}
