/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista4.questao10;

import java.util.ArrayList;

/**
 *
 * @author Tarcísio
 */
public class Modulo {
    private String tituloModulo;
    private ArrayList<Aula> aulas;

    public Modulo(String tituloModulo, ArrayList<Aula> aulas) {
        setTituloModulo(tituloModulo);
        setAulas(aulas);
    }

    public String getTituloModulo() {
        return tituloModulo;
    }

    public void setTituloModulo(String tituloModulo) {
        if (tituloModulo == null || tituloModulo.trim().length() < 3) {
            throw new IllegalArgumentException("Titulo do modulo inválido ou inexistente.");
        }
        this.tituloModulo = tituloModulo;
    }

    public ArrayList<Aula> getAulas() {
        return aulas;
    }

    public void setAulas(ArrayList<Aula> aulas) {
        if (aulas == null) {
            throw new IllegalArgumentException("Lista de aulas inválida.");
        }
        this.aulas = aulas;
    }
    
    public void adicionarAula(Aula a) {
        aulas.add(a);
    }
    
    public int obterDuracaoTotalDoModulo() {
        int duracao = 0;
        for (Aula a: aulas) {
            duracao += a.getDuracaoMinutos();
        }
        return duracao;
    }
    
}
