/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author james Honeyman
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class Control {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int i = 1;
        while (i == 1) {
            try {

                System.out.println("Ingrese su Número:");
                String Num_str = scanner.next();
                int Num = Integer.parseInt(Num_str);
                String Num_invertido= "";
                for (int x = Num_str.length(); x > 0; x--) {
                    Num_invertido += Num_str.charAt(x - 1);

                }
                System.out.println("=======================================");
                System.out.println("Su Numero Invertido es : " + Num_invertido);
                System.out.println("=======================================");
                break;

            } catch (InputMismatchException ex) {
                System.out.println("Error,dato Invalido");
                scanner.nextInt();
            }    
        }
        scanner.close();
    }
}
