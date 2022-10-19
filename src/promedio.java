import java.util.Scanner;
public class promedio {
    public static void main(String[] args) {
        double c1, c2 , c3 , c4 , S, P;

        Scanner leer = new Scanner(System.in); // Preparo el programa para leer desde el teclado

        System.out.print("Introduce el número c1="); //Leo el primer número
        c1 = leer.nextDouble();
        System.out.print("Introduce el número c2="); // Leo el segundo número
        c2 = leer.nextDouble();
        System.out.print("Introduce el número c3="); // Leo el tercero número
        c3 = leer.nextDouble();
        System.out.print("Introduce el número c4="); // Leo el cuarto número
        c4 = leer.nextDouble();


        S= c1 + c2 + c3 + c4;
        System.out.println("La suma de las calificaciones es=" + S);

        P= S/4;
        System.out.println("El promedio de las calificaciones es="+ P);


    }
}
