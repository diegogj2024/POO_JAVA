/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aireacondicionado;

import java.util.Random;

/**
 *
 * @author SENA
 */
public class Aireacondicionado {
    public static Random random = new Random();
    public static int humedad = random.nextInt(100) + 1;
    public static int temperatura=random.nextInt(50)+1;
    
    
    public static void Validartemperatura(){
        if (humedad>60 && temperatura>28 && temperatura<=34){
            System.out.println(".");
            Sensor.Encenderaire();
        }else if (temperatura>34){
            Sensor.Encenderaire();
        }else{
            Sensor.Apagaraire();
        }
    }
}
