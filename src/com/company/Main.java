package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        ivedimas();
        System.out.println("Jusu KMI: " + skaiciavimas.KMIskaiciuokle(a,b));

    }
    static float a;
    static float b;

    public static void ivedimas(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Iveskite savo svori KG");
        a = sc.nextFloat();
        System.out.println("Iveskite savo ugi M");
        b = sc.nextFloat();
    }

}