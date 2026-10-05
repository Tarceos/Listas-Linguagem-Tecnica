/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista4.questao1;

/**
 *
 * @author Tarcísio
 */
public class Consulta {
    private String data, historicoSintomas;
    private Paciente paciente;

    public Consulta(String data, String historicoSintomas, Paciente paciente) {
        setData(data);
        setHistoricoSintomas(historicoSintomas);
        setPaciente(paciente);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if (data.trim().length() != 10 || data == null) {
            throw new IllegalArgumentException("Data inválida. Deve constar o modelo dd/mm/aaaa.");
        }
        this.data = data;
    }

    public String getHistoricoSintomas() {
        return historicoSintomas;
    }

    public void setHistoricoSintomas(String historicoSintomas) {
        this.historicoSintomas = historicoSintomas;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        if ( paciente == null ) {
            throw new IllegalArgumentException("Paciente inválido.");
        }
        this.paciente = paciente;
    }
    
    public void exibirResumoConsuta() {
        System.out.println("Paciente: " + paciente.getNome());
        System.out.println("Cpf: " + paciente.getCpf());
        System.out.println("Data consulta: " + getData());
        System.out.println("Data consulta: " + getHistoricoSintomas());
    }
}
