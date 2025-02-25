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
    public static String controlador=" ";
    public static int silla=1;
    
    public Persona(String nombre,int edad,int cedula){
    Persona.nombre=nombre;
    Persona.edad=edad;
    Persona.cedula=cedula;
    }
    
    public void Reservar() {
        String respuesta=" ";
        int control=1;

        while (!Persona.controlador.equals("NO") && !Persona.controlador.equals("SI")) {
            System.out.println("Desea reservar un asiento (Si, No)");
            respuesta = objscanner.nextLine();
            Persona.controlador = respuesta.toUpperCase();

            if (!Persona.controlador.equals("NO") && !Persona.controlador.equals("SI")) {
                System.out.println("Error: opcion incorrecta, por favor ingrese 'Si' o 'No'.");
            }else if("SI".equals(Persona.controlador)){
               while (control==1){
                System.out.println("que asiento deseas? elige entre el 1 al 20");
                silla=objscanner.nextInt();
                if (Persona.silla<1 || Persona.silla>20){
                  System.out.println("ERROR, ingresaste un numero fuera del rango de 1 a 20.... intenta de nuevo");
                }else {
                  control=0;
                }
                }
            }
        }
    }
    
    public void imprimirdatos(){
        System.out.println("nombre del cliente:"+Persona.nombre);
        System.out.println("edad:"+Persona.edad);
        System.out.println("cedula:"+Persona.cedula);
        System.out.println("Reservo?:"+Persona.controlador);
        System.out.println("silla elegida:"+Persona.silla);
    }
}
    

