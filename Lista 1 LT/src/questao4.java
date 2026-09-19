/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarcísio
 */
public class questao4 {
    public static void exec() {
        int num;
        int ante, suce;
        
        System.out.print("Insira um número:\t");
        num = Lista1LT.ler.nextInt();
        
        ante = num-1;
        suce = num+1;
        
        System.out.print("Antecessor:\t" + ante);
        System.out.print("\nSucessor:\t" + suce);
    }
}
