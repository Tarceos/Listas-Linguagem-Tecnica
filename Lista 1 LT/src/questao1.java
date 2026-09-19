/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarcísio
 */
public class questao1 {
    public static void exec() {
        double num1, num2;
        double som, sub, mult, div;
        
        System.out.println("Insira um número:");
        num1 = Lista1LT.ler.nextDouble();
        
        System.out.println("Insira outro número:");
        num2 = Lista1LT.ler.nextDouble();
        
        som = num1 + num2;
        sub = num1 - num2;
        mult = num1 * num2;
        div = num1 / num2;
        
        System.out.println("Soma:\t " + som);
        System.out.println("Subtração:\t" + sub);
        System.out.println("Multiplicação:\t" + mult);
        System.out.println("Divisão:\t" + div);
    }
}
