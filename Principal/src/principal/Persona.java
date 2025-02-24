/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

import java.util.Scanner;

public class Persona {

    public  static Scanner objscanner=new Scanner(System.in);
    private static String nombre;
    private static int edad;
    private static int cedula;
    
    public Persona(String nombre,int edad,int cedula){
    Persona.nombre=nombre;
    Persona.edad=edad;
    Persona.cedula=cedula;
    }
    
    public void Comprarboleta(){
        System.out.println("elija la pelicula que desea ver(sonic)");
        String respuesta=objscanner.nextLine();
    }
    
}
