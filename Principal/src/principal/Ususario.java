/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;
public class Ususario extends Persona{
    public static String correo;
    public Ususario(String nombre,int edad,int cedula,String correo){
        super(nombre, edad, cedula);
        Ususario.correo=correo;
    }
    public void imprimir(){
        System.out.println("USUARIO");
        System.out.println("");
    }
}

