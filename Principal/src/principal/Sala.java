/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;


public class Sala {
    public static int numerosala=0;
    public static String pelicula=" ";
    
    public Sala(int sala,String pelicula){
        Sala.numerosala=sala;
        Sala.pelicula=pelicula;
        System.out.println("Datos Reserva!!");
        System.out.println("numero de sala:"+sala);
        System.out.println("Pelicula:"+pelicula);
    }
    
}
