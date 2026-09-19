/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarcísio
 */
public class questao7 {
    public static void exec() {
        int num1, num2;
        
        System.out.println("Insira o número 1:");
        num1 = Lista1LT.ler.nextInt();
        
        System.out.println("Insira o número 2:");
        num2 = Lista1LT.ler.nextInt();
        
        System.out.println("Número 1:\t" + num1);
        System.out.println("Número 2:\t" + num2);
        
        num1 += num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        
        System.out.println("Troca de valores");
        
        System.out.println("Número 1 agora:\t" + num1);
        System.out.println("Número 2 agora:\t" + num2);
    }
}