/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

/**
 *
 * @author SENA
 */
public class Cine {
    private static String nombre;
    private static int edad;
    private static int cedula;
    private static String correo;
    private static int asientoocupado;
    private static int sala;
    private static String pelicula;
    
    public Cine(String nombre,int edad,int cedula,String correo,int asientoocupado,int sala,String pelicula){
        Cine.nombre=nombre;
        Cine.edad=edad;
        Cine.cedula=cedula;
        Cine.correo=correo;
        Cine.asientoocupado=asientoocupado;
        Cine.sala=sala;
        Cine.pelicula=pelicula;
        System.out.println("datos guardados");
    }
}
