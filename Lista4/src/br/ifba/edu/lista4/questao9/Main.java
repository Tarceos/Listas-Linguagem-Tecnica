/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.ifba.edu.lista4.questao9;

import java.util.ArrayList;

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
            Desenvolvedor t = new Desenvolvedor("JavaScript");
            Desenvolvedor y = new Desenvolvedor("Python");
            Designer x = new Designer("Canva");
            
            ArrayList<Funcionario> funcionarios = new ArrayList<>();
            
            funcionarios.add(y);
            funcionarios.add(t);
            
            Empresa e = new Empresa("1234", "Vender protetor solar noturno", funcionarios);
            
            e.listarEquipe();
            System.out.println("Folha: " + e.calcularFolhaTotal());
            
            e.contratar(x);
            
            e.listarEquipe();
            System.out.println("Folha: " + e.calcularFolhaTotal());
            
        } catch (IllegalArgumentException e) {
            System.err.println("Erro:" + e.getMessage());
        }
    }
    
}
