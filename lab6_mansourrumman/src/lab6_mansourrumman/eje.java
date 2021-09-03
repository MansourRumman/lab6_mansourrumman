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
public class eje extends U {
    private String cargo, emp,tu,tm;

    public eje(String cargo, String emp, String tu, String tm, String nom, String apel, String correo, String user, String con) {
        super(nom, apel, correo, user, con);
        this.cargo = cargo;
        this.emp = emp;
        this.tu = tu;
        this.tm = tm;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmp() {
        return emp;
    }

    public void setEmp(String emp) {
        this.emp = emp;
    }

    public String getTu() {
        return tu;
    }

    public void setTu(String tu) {
        this.tu = tu;
    }

    public String getTm() {
        return tm;
    }

    public void setTm(String tm) {
        this.tm = tm;
    }

    @Override
    public String toString() {
        return super.toString()+ "eje{" + "cargo=" + cargo + ", emp=" + emp + ", tu=" + tu + ", tm=" + tm + '}';
    }
    
}
