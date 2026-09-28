/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista3.questao1;

/**
 *
 * @author Tarcísio
 */
public class Contador {
    private int cont;

    public Contador(int cont) {
        setCont(cont);
    }

    public int getCont() {
        return cont;
    }

    public void setCont(int cont) {
        if ( cont < 0 ) {
            throw new IllegalArgumentException("O contador não pode ser negativo!");
        }
        this.cont = cont;
    }
    
    public void acres() {
        setCont(++cont);
    }
    
    public void decres() {
        setCont(--cont);
    }
}
