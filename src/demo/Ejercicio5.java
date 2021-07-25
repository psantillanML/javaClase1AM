package demo;

import java.util.Scanner;

public class Ejercicio5 {
    public static boolean countDigits(String n, int m, String d) {
        int totalCharacters = 0;
        for (int i = 0; i < n.length(); i++) {
            if (n.charAt(i) == d.charAt(0)){
                totalCharacters++;
            }
        }
        return totalCharacters >= m;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor n: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese otro valor m: ");
        int m = scanner.nextInt();
        System.out.print("Ingrese otro valor d: ");
        int d = scanner.nextInt();
        int i = 0;
        int number = 1;
        System.out.println("Listado de "+n+" números que contienen al menos "+m+" digitos "+d+":");
        while (i != n) {
            String numberDString = String.valueOf(d);
            String numberString = String.valueOf(number);
            if (countDigits(numberString, m, numberDString)) {
                System.out.println(number);
                i++;
            }
            number++;
        }
        scanner.close();
    }
}
