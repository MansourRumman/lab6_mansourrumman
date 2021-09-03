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
public class nc extends notas {
    private String cat,des,pub;

    public nc(String cat, String des, String pub, String tit, int fecha, String pri) {
        super(tit, fecha, pri);
        this.cat = cat;
        this.des = des;
        this.pub = pub;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getPub() {
        return pub;
    }

    public void setPub(String pub) {
        this.pub = pub;
    }

    @Override
    public String toString() {
          return super.toString()+ "nc{" + "cat=" + cat + ", des=" + des + ", pub=" + pub + '}';
    }
    
}
