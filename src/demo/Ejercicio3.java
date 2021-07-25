package demo;

import java.util.Scanner;

public class Ejercicio3 {
    public static boolean checkPrimeNumber(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return number != 0 && number != 1 && number != 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor: ");
        int n = scanner.nextInt();
        String message = (checkPrimeNumber(n)) ? n+ " es primo" : n+" no es primo";
        System.out.println(message);
        scanner.close();
    }
}
