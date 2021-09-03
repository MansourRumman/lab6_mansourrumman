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
public class nest extends notas {
   private String trec,fr,pd;

    public nest(String trec, String fr, String pd, String tit, int fecha, String pri) {
        super(tit, fecha, pri);
        this.trec = trec;
        this.fr = fr;
        this.pd = pd;
    }

    public String getTrec() {
        return trec;
    }

    public void setTrec(String trec) {
        this.trec = trec;
    }

    public String getFr() {
        return fr;
    }

    public void setFr(String fr) {
        this.fr = fr;
    }

    public String getPd() {
        return pd;
    }

    public void setPd(String pd) {
        this.pd = pd;
    }

    @Override
    public String toString() {
        return super.toString()+ "nest{" + "trec=" + trec + ", fr=" + fr + ", pd=" + pd + '}';
    }
   
}
