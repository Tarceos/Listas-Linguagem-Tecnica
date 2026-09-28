/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista3.questao1;

/**
 *
 * @author Tarcísio
 */
public class Main {

    /**
     *
     * @param args */
    public static void main(String[] args) {
        System.out.println("teste");
        
        try {
            Contador c = new Contador(0);
            System.out.println(c.getCont());
            
            c.acres();
            System.out.println(c.getCont());
            
            c.acres();
            System.out.println(c.getCont());
            
            c.decres();
            System.out.println(c.getCont());
            
            c.decres();
            System.out.println(c.getCont());
            
            c.decres();
            System.out.println(c.getCont());
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }
        
    }
}
