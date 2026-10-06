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
public class Curso {
    private String nomeCurso;
    private ArrayList<Modulo> modulos;

    public Curso(String nomeCurso, ArrayList<Modulo> modulos) {
        this.nomeCurso = nomeCurso;
        this.modulos = modulos;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        if (nomeCurso == null || nomeCurso.trim().length() < 3) {
            throw new IllegalArgumentException("Titulo do curso inválido ou inexistente.");
        }
        this.nomeCurso = nomeCurso;
    }

    public ArrayList<Modulo> getModulos() {
        return modulos;
    }

    public void setModulos(ArrayList<Modulo> modulos) {
        if (modulos == null) {
            throw new IllegalArgumentException("Lista de aulas inválida.");
        }
        this.modulos = modulos;
    }
    
    public void adicionarModulo(Modulo m) {
        modulos.add(m);
    }
    
    public int calcularCargaHorariaTotal() {
        int cargaHora = 0;
        for (Modulo m: modulos) {
            cargaHora += m.obterDuracaoTotalDoModulo();
        }
        return cargaHora;
    }
    
    public void exibirGradeCurricular() {
        for(Modulo m: modulos) {
            System.out.println("Modulo: " + m.getTituloModulo());
            System.out.println("Aulas: ");
            for(Aula a: m.getAulas()) {
                System.out.println(a.getTitulo());
            }
        }
    }
}
