/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao3;

/**
 *
 * @author Tarcísio
 */
public class Q3 {
    public static void exec() {
        Placar placar =  new Placar();
        
        placar.timeCasa = "Palmeiras";
        placar.timeVisitante = "Palmeiras";
        
        placar.pontosCasa = 1;
        placar.pontosVisitante = 0;
        
        placar.exibirPlacar();
        placar.marcarPontosCasa(2);
        placar.exibirPlacar();
        placar.marcarPontosVisitante(2);
        placar.exibirPlacar();
    }
}
