package co.edu.uniquindio;
import java.util.Scanner;

public class AlmacenarEstudiante {
    public static void Estudiante(String nombres,String apellidos,String identificacion,String correo,String telefono,int edad) {
        System.out.println("Nombres: "+nombres);
        System.out.println("Apellidos: "+apellidos);
        System.out.println("Identificacion: "+identificacion);
        System.out.println("Correo: "+correo);
        System.out.println("Telefono: "+telefono);
        System.out.println("Edad: "+edad);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese nombres: ");
        String nombres=scanner.nextLine();
        System.out.println("Ingrese apellidos: ");
        String apellidos=scanner.nextLine();
        System.out.println("Ingrese identificacion: ");
        String identificacion=scanner.nextLine();
        System.out.println("Ingrese correo: ");
        String correo=scanner.nextLine();
        System.out.println("Ingrese telefono: ");
        String telefono=scanner.nextLine();
        System.out.println("Ingrese edad: ");
        int edad=scanner.nextInt();
        Estudiante(nombres,apellidos,identificacion,correo,telefono,edad);
        scanner.close();


    }

}