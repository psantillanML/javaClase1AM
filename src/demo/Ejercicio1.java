package demo;
import java.util.Scanner;
public class Ejercicio1 {
    public static boolean checkEvenNumber(int number){
        return number%2 == 0;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int n = scanner.nextInt();
        int i = 0;
        int number = 1;
        System.out.println("Listado de "+n+" números pares: ");
        while(i != n){
            if(checkEvenNumber(number)){
                System.out.println(number);
                i++;
            }
            number++;
        }
        scanner.close();
    }
}
