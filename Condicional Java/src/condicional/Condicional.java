/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package condicional;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTES
 */
public class Condicional {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre, apellido, sexo;
        int edad;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = scanner.nextLine();
        
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        scanner.nextLine();  // Limpia el salto de línea
        
        System.out.println("Ingrese su sexo (Masculino/Femenino): ");
        sexo = scanner.nextLine();
        
        String nombreCompleto = nombre + " " + apellido;

        if (edad >= 18) {
            System.out.println(nombreCompleto + " es mayor de edad");
        } else {
            System.out.println(nombreCompleto + " es menor de edad");
        }
        
        if (sexo.equals("Masculino")) {
            System.out.println(nombreCompleto + " es hombre");
        } else if (sexo.equals("Femenino")) {
            System.out.println(nombreCompleto + " es mujer");
        } else {
            System.out.println("Sexo no válido");
        }

        scanner.close();
    }
    
}
