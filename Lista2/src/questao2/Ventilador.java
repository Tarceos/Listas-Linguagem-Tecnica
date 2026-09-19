/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao2;

/**
 *
 * @author Tarcísio
 */
public class Ventilador {
    boolean ligado = false;
    int velocidade = 0;
    
    public void ligar() {
        ligado = true;
        velocidade = 1;
    }
    
    public void desligar() {
        ligado = false;
        velocidade = 0;
    }
    
    public void status() {
        if (ligado == true) {
            System.out.println("O ventilador está ligado na velocidade: " + velocidade);
        } else {
            System.out.println("O ventilador está desligado.");
        }
    }
}
