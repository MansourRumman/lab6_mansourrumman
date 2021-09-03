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
public class U {
   private String nom,apel,correo,user,con;
   private ArrayList<notas> n= new ArrayList();
    public U(String nom, String apel, String correo, String user, String con) {
        this.nom = nom;
        this.apel = apel;
        this.correo = correo;
        this.user = user;
        this.con = con;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApel() {
        return apel;
    }

    public void setApel(String apel) {
        this.apel = apel;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCon() {
        return con;
    }

    public void setCon(String con) {
        this.con = con;
    }

    @Override
    public String toString() {
        return "U{" + "nom=" + nom + ", apel=" + apel + ", correo=" + correo + ", user=" + user + ", con=" + con + '}';
    }
   
}
