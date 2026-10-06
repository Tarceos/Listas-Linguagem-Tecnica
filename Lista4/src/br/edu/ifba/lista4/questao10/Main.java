/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.ifba.lista4.questao10;

import java.util.ArrayList;
import java.util.List;

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
            Aula a1 = new Aula("Ligar computador", 7000);
            Aula a2 = new Aula("Desligar computador", 14000);
            
            Aula a3 = new Aula("Criar bomba termonuclear", 14);
            Aula a4 = new Aula("Desenvolver acelerador de partículas com JavaScript", 7);
            
            Modulo m1 = new Modulo("Ligar e desligar o computador", new ArrayList<Aula>(List.of(a1, a2)));
            Modulo m2 = new Modulo("Transcender a matéria", new ArrayList<Aula>(List.of(a3, a4)));
            
            Curso cu = new Curso("Curso de Java", new ArrayList<Modulo>(List.of(m1, m2)));
            
            System.out.println("Carga Horaria total: " + cu.calcularCargaHorariaTotal());
            cu.exibirGradeCurricular();
            
        } catch (IllegalArgumentException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
    
}
