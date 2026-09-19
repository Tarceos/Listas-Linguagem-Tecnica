/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarcísio
 */
public class questao6 {
    public static void exec() {
        double raio, pi = 3.14;
        
        System.out.print("Insira o raio:\t");
        raio = Lista1LT.ler.nextDouble();
        
        System.out.println("Circunferência:\t" + Lista1LT.df.format(2*pi*raio) );
    }
}
