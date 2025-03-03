/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controltienda;

import java.util.Random;

/**
 *
 * @author SENA
 */
public class Cliente {
    public static Random random = new Random();
    public static int membresia = random.nextInt(3) + 1;
    public static int hora=random.nextInt(24)+1;
    
    public static void Validarentrada(){
        if(Cliente.membresia==1 && Cliente.hora>=6 && Cliente.hora<=18){
            String resultado="el cliente tiene membresia y pudo entrar";
            Tienda.Tiendaentrada(resultado);
        }else if (Cliente.membresia==2 && Cliente.hora>=6 && Cliente.hora<=18){
            String resultado="el cliente es empleado y pudo entrar";
            Tienda.Tiendaentrada(resultado);
        }else{
            String resultado="el cliente no pudo entrar";
            Tienda.Tiendaentrada(resultado);
        }
    }
}
