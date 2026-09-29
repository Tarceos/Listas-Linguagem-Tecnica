/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifba.edu.lista4.questao9;

/**
 *
 * @author Tarcísio
 */
public class Designer extends Funcionario {
    private String ferramentaPreferida;


    public String getFerramentaPreferida() {
        return ferramentaPreferida;
    }

    public void setFerramentaPreferida(String ferramentaPreferida) {
        this.ferramentaPreferida = ferramentaPreferida;
    }
    
    @Override
    public void obterDescricaoFuncao() {
        System.out.println("Eu sou designer e uso " + ferramentaPreferida);
    }
    
}
