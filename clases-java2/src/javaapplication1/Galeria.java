/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;

/**
 *
 * @author T107
 */
public class Galeria {
    ArrayList<Imagencita> imagenes;

    public Galeria() {
        imagenes= new ArrayList<Imagencita>();
        Imagencita a1=new Imagencita ();
        a1.setUrl("/javaapplication1/ima1.png");
        a1.setTitulo("El logo de asus");
        a1.setDescripcion("este es el logo tipo que pertenece a ala empresa asus dedicada a graficos de juegos ");
        
        
        Imagencita a2=new Imagencita ();
        a2.setUrl("/javaapplication1/ima2.png");
        a2.setTitulo("El logo de mi empresa");
        a2.setDescripcion("este es el logo tipo de mi futura empresa jejeje ");
        
        
        Imagencita a3=new Imagencita ();
        a3.setUrl("/javaapplication1/ima3.png");
        a3.setTitulo("El universo");
        a3.setDescripcion("Asi se me imagino que se ve el universo ");
        
        Imagencita a4=new Imagencita ();
        a4.setUrl("/javaapplication1/ima4.png");
        a4.setTitulo("El Auto Deseado");
        a4.setDescripcion("Este el auto de ultimo modelo de modelo 2015 con una potencia en Ph ");
        
        Imagencita a5=new Imagencita ();
        a5.setUrl("/javaapplication1/ima5.png");
        a5.setTitulo("El logo de liga de asecinos");
        a5.setDescripcion("Este el logotipo del video juego de liga de asecionos ");
        
        
        //Agregar estas imagenes al ArrayList
        
       imagenes.add(a1);
       imagenes.add(a2);
       imagenes.add(a3);
       imagenes.add(a4);
       imagenes.add(a5);
       
    }

    public ArrayList<Imagencita> leerTodas() {
        return imagenes;
    }

    public void setImagenes(ArrayList<Imagencita> imagenes) {
        this.imagenes = imagenes;
    }
    
    
}
