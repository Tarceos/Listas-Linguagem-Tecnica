/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifba.edu.lista4.questao9;

/**
 *
 * @author Tarcísio
 */
public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void obterDescricaoFuncao() {
        System.out.println("Eu sou dev e uso " + linguagemPrincipal);
    }
    
    
}
