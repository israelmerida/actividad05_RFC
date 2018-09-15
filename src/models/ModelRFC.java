/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import javax.swing.JOptionPane;

/**
 *
 * @author LENOVO
 */
public class ModelRFC {
   //se pide en texto para poder contarlos en caracter y separar
   private String nombre;
   private String appaterno;
   private String apmaterno;
   private int anio;
   private int mes;
   private int dia;
   private String Anio1;
   private String Mes1;
   private String Dia1;
   private String rfc;
   
    //get y set de cada variable creada
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return appaterno;
    }

    public void setApellidop(String apellp) {
        this.appaterno = apellp;
    }

    public String getApellidom() {
        return apmaterno;
    }

    public void setApellidom(String apellm) {
        this.apmaterno = apellm;
    }

    public int getAnio() {
        return anio;
        
    }

    public void setAnio(int anio) {
        //en el año debe de ser mañor a 1960 y menor a 2018
        this.anio = anio;
        if (anio >= 1960 && anio <= 2018 ) {
        } 
        else {
            JOptionPane.showMessageDialog(null, "Año invalido");
        } 
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        //en el mes debe de ser mañor a 01 y menor a 12
        this.mes = mes;
        if (mes >= 01 && mes <= 12 ) {
        } 
        else {
            JOptionPane.showMessageDialog(null, "Mes invalido");
        } 
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        //en el dia debe de ser mañor a 01 y menor a 31
        this.dia = dia;
        if (dia >= 01 && dia <= 31 ) {
        } 
        else {
            JOptionPane.showMessageDialog(null, "Dia invalido");
        } 
    }
    public String getAnio1() {
        return Anio1;
    }

    public void setAnioo(String Anio1) {
        this.Anio1 = Anio1;
    }

    public String getMes1() {
        return Mes1;
    }

    public void setMess(String Mes1) {
        this.Mes1 = Mes1;
    }

    public String getDia1() {
        return Dia1;
    }

    public void setDiaa(String Dia1) {
        this.Dia1 = Dia1;
    }
    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    
    public void rfc() {
        // trim para que no cuente los espacios como caracter 
        // substring es para separar las letras 
        rfc = appaterno.trim().substring(0, 2);
        rfc = rfc.concat(apmaterno.trim().substring(0, 1));
        rfc = rfc.concat(nombre.trim().substring(0, 1));
        rfc = rfc.concat(Anio1.substring(2, 4));
        rfc = rfc.concat(Mes1);
        rfc = rfc.concat(Dia1);
        
    }

    
}




    

