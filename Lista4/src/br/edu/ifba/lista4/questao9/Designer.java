/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista4.questao9;

/**
 *
 * @author Tarcísio
 */
public class Designer extends Funcionario {
    private String ferramentaPreferida;

    public Designer(String ferramentaPreferida) {
        setFerramentaPreferida(ferramentaPreferida);
    }
    
    public String getFerramentaPreferida() {
        return ferramentaPreferida;
    }

    public void setFerramentaPreferida(String ferramentaPreferida) {
        if (ferramentaPreferida == null || ferramentaPreferida.trim().length() == 0) {
            throw new IllegalArgumentException("Ferramenta preferida inválida!");
        }
        this.ferramentaPreferida = ferramentaPreferida;
    }
    
    @Override
    public void obterDescricaoFuncao() {
        System.out.println("Eu sou designer e uso " + ferramentaPreferida);
    }
    
}
