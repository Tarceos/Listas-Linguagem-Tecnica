/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarcísio
 */
public class questao5 {
    public static void exec() {
        int mins, horas;
        
        System.out.print("Insira as horas:\t");
        horas = Lista1LT.ler.nextInt();
        
        System.out.print("Insira os minutos:\t");
        mins = Lista1LT.ler.nextInt();
        
        mins = mins + horas*60;
        System.out.println("Minutos desde o início do dia:\t" + mins);
    }
}
