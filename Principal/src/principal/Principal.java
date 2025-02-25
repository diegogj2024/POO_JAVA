/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package principal;

import java.util.Scanner;
public class Principal {

 public static Scanner objscanner=new Scanner(System.in);
 public static String nombre=" ";
 public static int edad=0;
 public static int cedula=0;
 
    public static void main(String[] args) {
        System.out.println("ingrese su nombre porfavor");
        nombre=objscanner.nextLine();
        System.out.println("ingrese su edad");
        edad=objscanner.nextInt();
        System.out.println("ingrese su cedula sin puntos o comas porfavor");
        cedula=objscanner.nextInt();
        Persona objPersona=new Persona(nombre,edad,cedula);
        objPersona.Reservar();
        objPersona.imprimirdatos();
    }
    
}
