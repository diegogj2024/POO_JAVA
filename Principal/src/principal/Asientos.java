/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Asientos {
    public static int asientosocupados;
    public static String nombre;
    public Asientos(int asiento,String nombre){
        Asientos.asientosocupados=asiento;
        Asientos.nombre=nombre;
        System.out.println("el asiento: "+asientosocupados+" ya esta siendo ocupado por el cliente: "+nombre);
    }
}
