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
public class crea extends U {
   private String ocupacion;
   private int edad;

    public crea(String ocupacion, int edad, String nom, String apel, String correo, String user, String con) {
        super(nom, apel, correo, user, con);
        this.ocupacion = ocupacion;
        this.edad = edad;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return super.toString()+ "crea{" + "ocupacion=" + ocupacion + ", edad=" + edad + '}';
    }
    
}
