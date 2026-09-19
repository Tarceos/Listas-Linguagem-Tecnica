/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author Tarcísio
 */
public class Aluno {
    String nome;
    int matricula;
    double nota1, nota2;

    public Aluno(String nomeInicial, int matriculaInicial) {
        this.nome = nomeInicial;
        this.matricula = matriculaInicial;
    }
    
    double obterMedia() {
        return (nota1+nota2)/2;
    }
    
    boolean aprovacao() {
        if (obterMedia() >=7) {
            return true;
        }
        return false;
    }
}
