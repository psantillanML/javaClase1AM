package demo;
import java.util.Scanner;

public class Ejercicio4 {
    public static boolean checkPrimeNumber(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return number != 0 && number != 1 && number != 4;
    }

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int n = scanner.nextInt();
        int i = 0;
        int number = 1;
        System.out.println("Listado de "+n+" numeros primos:");
        while(i != n){
            if(checkPrimeNumber(number)){
                System.out.println(number + " es primo");
                i++;
            }
            number++;
        }
        scanner.close();
    }
}
