package demo;
import java.util.Scanner;

public class Ejercicio2 {
    public static boolean checkMultiple(int n, int m){
        return n%m == 0;
    }
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un valor n: ");
        int n = scanner.nextInt();
        System.out.print("Ingrese otro valor m: ");
        int m = scanner.nextInt();
        int i = 0;
        int number = 1;
        System.out.println("Listado de "+n+" multiplos de "+m+":");
        while(i != n){
            if(checkMultiple(number,m)){
                System.out.println(number);
                i++;
            }
            number++;
        }
        scanner.close();
    }
}
