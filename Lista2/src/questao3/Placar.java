/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;

/**
 *
 * @author Tarcísio
 */
public class Placar {
    String timeCasa, timeVisitante;
    int pontosCasa, pontosVisitante;
    
    void marcarPontosCasa(int quantPontos) {
        pontosCasa+=quantPontos;
    }
    
    void marcarPontosVisitante(int quantPontos) {
        pontosVisitante+=quantPontos;
    }
    
    void exibirPlacar() {
        System.out.println("Placar: ");
        System.out.println(timeCasa + ": "+ pontosCasa);
        System.out.println(timeVisitante + ": "+ pontosVisitante);
    }
}
