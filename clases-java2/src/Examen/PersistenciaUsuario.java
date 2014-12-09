/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examen;

import java.io.*;
public class PersistenciaUsuario {
    
    public void guardarUsuario(Usuario u)throws Exception{
    
        File f=new File ("C:\\archivaldo.xxx");
        FileOutputStream fos=new FileOutputStream(f);
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(u);
         System.out.println("Objeto Usuario Guardado");
    }
    public Usuario leerUsuario()throws Exception{
        File f=new File ("C:\\archivaldo.xxx");
         FileInputStream fis=new FileInputStream(f);
         ObjectInputStream ois=new ObjectInputStream(fis);
        Usuario u=(Usuario)ois.readObject();
        System.out.println("Usuario recobrado");
        return u;
  }
}
