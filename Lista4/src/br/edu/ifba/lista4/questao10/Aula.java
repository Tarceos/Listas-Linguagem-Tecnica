/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista4.questao10;

/**
 *
 * @author Tarcísio
 */
public class Aula {
    private String titulo;
    private int duracaoMinutos;

    public Aula(String titulo, int duracaoMinutos) {
        setTitulo(titulo);
        setDuracaoMinutos(duracaoMinutos);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().length() < 3) {
            throw new IllegalArgumentException("Titulo da aula inválido ou inexistente.");
        }
        this.titulo = titulo;
    }

    public int getDuracaoMinutos() {
        return duracaoMinutos;
    }

    public void setDuracaoMinutos(int duracaoMinutos) {
        if (duracaoMinutos < 1) {
            throw new IllegalArgumentException("Duração da aula deve ter pelo menos 1 minuto.");
        }
        this.duracaoMinutos = duracaoMinutos;
    }
    
    
}
