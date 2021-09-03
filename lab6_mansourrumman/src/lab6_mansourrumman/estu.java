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
public class estu extends U {
    private String car;
    private int ac;

    public estu(String car, int ac, String nom, String apel, String correo, String user, String con) {
        super(nom, apel, correo, user, con);
        this.car = car;
        this.ac = ac;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public int getAc() {
        return ac;
    }

    public void setAc(int ac) {
        this.ac = ac;
    }

    @Override
    public String toString() {
        return super.toString()+ "estu{" + "car=" + car + ", ac=" + ac + '}';
    }
    
}
