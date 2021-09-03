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
public class norm extends U {
    private String hob,intes;

    public norm(String hob, String intes, String nom, String apel, String correo, String user, String con) {
        super(nom, apel, correo, user, con);
        this.hob = hob;
        this.intes = intes;
    }

    public String getHob() {
        return hob;
    }

    public void setHob(String hob) {
        this.hob = hob;
    }

    public String getIntes() {
        return intes;
    }

    public void setIntes(String intes) {
        this.intes = intes;
    }

    @Override
    public String toString() {
        return super.toString()+ "norm{" + "hob=" + hob + ", intes=" + intes + '}';
    }
    
}
