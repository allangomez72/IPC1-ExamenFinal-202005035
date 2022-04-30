/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenfinal;

import java.util.Scanner;

/**
 *
 * @author Allan
 */
public class ExamenFinal {

    /**
     * @param args the command line arguments
     */
    public static Scanner leer = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opc=0;
        do {            
            try {
                System.out.println("-----------------MENU-----------------\n"
        + "Eliga una opcion: \n"
                        + "**************************");
                System.out.println("*1. Ejercicio 1          *");
                System.out.println("*2. Ejercicio 2          *");
                System.out.println("*3. Ejercicio 3          *");
                System.out.println("*4. Salir                *");
                System.out.println("**************************");
                
                opc = leer.nextInt();
                switch (opc) {
                    case 1:
                        Ejercicio_1();
                        break;
                    case 2:
                        Ejercicio_2();
                        break;
                    case 3:
                        Vacas nueva = new Vacas();
                       nueva.comparacion8();
                        break;
                    case 4:
                        System.out.println("Adios");
                        opc = 0;
                        break;
                    default:
                        System.out.println("Elija una opcion valida");
                        break;
                }
                
            } catch (Exception e) {
                System.out.println("A ocurrido un error pruebe de nuevo");
                opc = 0;
            }
        } while (opc != 0);
        
    }
    
    public static void Ejercicio_1(){
        // double por si acaso ingresa numeros racionales y no enteros
        double num1,num2;
        System.out.println("Por favor ingrese 2 numeros");
        System.out.println("Ingrese el primer numero: ");
        num1= leer.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2=leer.nextDouble();
        if (num1>num2) {
            System.out.println("El numero mayor que ingreso es: "+num1);
        }else{
            System.out.println("El numero mayor que ingreso es: "+num2);
        }
        
    }
    
    public static void Ejercicio_2(){
        System.out.println("-------Piramide impar------");
        // debe de ingresar un numero entero
        int numero, filas;
        filas=0;
        System.out.println("Por favor ingrese cualquier numero impar: ");
        numero=leer.nextInt();
        if (numero%2==1) {
            for (int i = 0; i <= numero; i++) {
                if (i%2!=0) {
                    filas++;
                } 
            }
            System.out.println("");
            for (int alto = 1; alto <= filas; alto++) {
                //espacios
                for (int espacio = 1; espacio <= filas-alto; espacio++) {
                    System.out.print(" ");
                }
                //asteriscos
                for (int asteriscos = 1; asteriscos <=(alto*2)-1; asteriscos++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        }else{
            System.out.println("Usted a ingresado un numero par, pruebe otra vez");
        }
    
    }
}
