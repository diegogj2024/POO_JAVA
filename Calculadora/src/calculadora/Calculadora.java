/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

/**
 *
 * @author SENA
 */
public class Calculadora {
    private static int resultado;
    
    public Calculadora(){
        
    }
    
    public static void haceroperacion(int numero,int numero2,String operacion){
        
        switch (operacion) {
            case "+":
                Calculadora.resultado=numero+numero2;
                break;
            case "-":
                Calculadora.resultado=numero-numero2;
                break;
            case "X":
                Calculadora.resultado=numero*numero2;
                break;
            case "/":
                Calculadora.resultado=numero/numero2;
                break;
            default:
                System.out.println("esta opcion no existe");
        }
        System.out.println("resultado: "+Calculadora.resultado);
    }
    
}
