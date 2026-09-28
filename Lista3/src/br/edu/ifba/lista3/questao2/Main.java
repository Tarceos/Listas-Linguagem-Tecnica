/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifba.lista3.questao2;

/**
 *
 * @author Tarcísio
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try {
            Ponto t = new Ponto(7, 14);
            Ponto y = new Ponto(21, 28);
            
            System.out.println("Teste criação de ponto===========");
            System.out.println("T:");
            t.mostra();
            
            System.out.println("Y:");
            y.mostra();
            
            System.out.println("Teste mover ponto===========");
            System.out.println("T:");
            t.move(7, 7);
            t.mostra();
            
            System.out.println("Y:");
            y.move(-7, -7);
            y.mostra();
            
            System.out.println("Teste comparação de ponto===========");
            System.out.println("T com Y:");
            System.out.println(t.compara(y));
            
            t.move(7, 7);
            y.move(-7, -7);
            
            System.out.println("Pontos movidos:");
            System.out.println("T:");
            t.mostra();
            System.out.println("Y:");
            y.mostra();
            
            System.out.println("Y com T:");
            System.out.println(y.compara(t));
            
            System.out.println("\nTeste mostrar ponto===========");
            System.out.println("T:");
            t.mostra();
            
            System.out.println("Y:");
            y.mostra();
            
            System.out.println("Teste distância entre pontos===========");
            System.out.println(y.distancia(t));
            
            t.move(-14, -21);
            y.move(0, -7);
            
            System.out.println("\nPontos movidos:");
            System.out.println("T:");
            t.mostra();
            System.out.println("Y:");
            y.mostra();
            
            System.out.println("Distância: " + y.distancia(t));
            
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        
    }
    
}
