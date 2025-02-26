/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;

public class Usuario extends Persona{

    private static String correo;
    public Usuario(String nombre,int edad,int cedula,String correo){
        super(nombre, edad, cedula);
        Usuario.correo=correo;
    }
    public void imprimir(){
        System.out.println(" DATOS DEL USUARIO");
        System.out.println("nombre del usuario:"+nombre);
        System.out.println("edad del usuario:"+edad);
        System.out.println("cedula del usuario:"+cedula);
        System.out.println("correo del usuario:"+Usuario.correo);
    }
}

