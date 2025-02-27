/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sensor;

import java.util.Scanner;

public class Sensor {
    
    public Sensor(){
        Scanner objScanner=new Scanner(System.in);
        int contador=3;
        while (true){
        contador-=1;
        System.out.println("ingrese la temperatura actual del invernadero");
        float temperatura=objScanner.nextInt();
        if(temperatura<10){
            Calefactor.Prendercalefactor();
            try{
             Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }else if(temperatura>=10 && temperatura<=25){
            System.out.println("temperatura adecuada, no se activo nada");
            try{
             Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }else if(temperatura>25){
            Ventilador.Prenderventilador();
            try{
             Thread.sleep(5000);
            }catch(InterruptedException e){
                System.out.println("error");
            }
        }
        if(contador==0){
            System.out.println("bye bye");
            break;
        }
        }
    }
    
}
