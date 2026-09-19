/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

import lista2.Lista2;

/**
 *
 * @author Tarcísio
 */
public class Q4 {
    public static void exec() {
        Retangulo reto = new Retangulo();
        
        System.out.print("Insira a altura do seu retângulo:\t");
        reto.altura = Lista2.ler.nextDouble();
        
        System.out.print("Insira a base do seu retângulo:\t");
        reto.base = Lista2.ler.nextDouble();
        
        System.out.print("Sua altura:\t" + reto.altura);
        System.out.println("Sua base:\t" + reto.base);
        
        System.out.println("Área:\t" + reto.calcularArea());
        System.out.println("Perimetro:\t" + reto.calcularPerimetro());
        
    }
}
