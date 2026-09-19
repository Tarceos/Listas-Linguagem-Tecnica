/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao1;

/**
 *
 * @author Tarcísio
 */
public class Q1 {
    public static void exec() {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        
        c1.modelo = "Civic";
        c1.marca = "Honda";
        c1.ano = 2009;
        
        c2.modelo = "Astra";
        c2.marca = "Chevrolet";
        c2.ano = 2011;
        
        c1.exibirDados();
        c2.exibirDados();
    }
}
