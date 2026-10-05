/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifba.lista4.questao1;

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
            System.out.println("Teste com dados corretos:");
            Paciente t = new Paciente("Tarcisio", "77777777777", 17);
            Paciente y = new Paciente("Ythilla", "77777777777", 17);
            
            Consulta p1 = new Consulta("29/09/2026", "Excelente", y);
            Consulta p2 = new Consulta("29/09/2026", "Gripe", t);

        } catch(IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
        
    }
    
}
