/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juego;


public class Fizzbuzz {
    public Fizzbuzz(){
        for(int i=1;i<=100;i++){
         if (i%3==0 && i%5==0){
             System.out.println("FIZZBUZ");
         }else if(i%5==0){
             Fizz.imprimirfizz();
         }else if(i%3==0){
             Buzz.imprimirBuzz();
         }else{
             System.out.println(i);
         }
    }
    }
}
