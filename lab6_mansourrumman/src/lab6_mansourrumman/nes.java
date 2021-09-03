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
public class nes extends notas {
    private String tr,fr,de;

    public nes(String tr, String fr, String de, String tit, int fecha, String pri) {
        super(tit, fecha, pri);
        this.tr = tr;
        this.fr = fr;
        this.de = de;
    }

    public String getTr() {
        return tr;
    }

    public void setTr(String tr) {
        this.tr = tr;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getDe() {
        return de;
    }

    public void setDe(String de) {
        this.de = de;
    }

    @Override
    public String toString() {
        return super.toString()+  "nes{" + "tr=" + tr + ", fr=" + fr + ", de=" + de + '}';
    }
    
}
