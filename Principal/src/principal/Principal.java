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
 public static String correo;
 
    public static void main(String[] args) {
        System.out.println("ingrese su nombre porfavor");
        Principal.nombre=objscanner.nextLine();
        System.out.println("ingrese su edad");
        Principal.edad=objscanner.nextInt();
        System.out.println("ingrese su cedula sin puntos o comas porfavor");
        Principal.cedula=objscanner.nextInt();
        System.out.println("ingrese su correo electronico");
        objscanner.nextLine();
        Principal.correo=objscanner.nextLine();
        Usuario objusuario=new Usuario(Principal.nombre,Principal.edad,Principal.cedula,Principal.correo);
        objusuario.Reservar(Principal.correo);
        objusuario.imprimir();
    }
    
}
