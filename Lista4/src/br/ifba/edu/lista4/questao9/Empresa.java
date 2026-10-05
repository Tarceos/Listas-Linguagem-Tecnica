/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifba.edu.lista4.questao9;

import java.util.ArrayList;

/**
 *
 * @author Tarcísio
 */
public class Empresa {
    private String cnpj, razaoSocial;
    private ArrayList<Funcionario> funcionarios;

    public Empresa(String cnpj, String razaoSocial, ArrayList<Funcionario> funcionarios) {
        setCnpj(cnpj);
        setRazaoSocial(razaoSocial);
        setFuncionarios(funcionarios);
    }

    public String getCnpj() { // cnpj
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() { // razao social
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public ArrayList<Funcionario> getFuncionarios() { // funcionario {dev, designer}
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios == null) {
            throw new IllegalArgumentException("Funcionário inválido!");
        }
        this.funcionarios = funcionarios;
    }
    
    public void contratar(Funcionario f) {
        if (f == null) {
            throw new IllegalArgumentException("Erro na contratação, Funcionário inválido!");
        }
        funcionarios.add(f);
    }
    
    public double calcularFolhaTotal() {
        double numDevs = 0, numDes = 0;
        for (Funcionario f: funcionarios) {
            if (f != null) {
                if (f.getClass() == Desenvolvedor.class) {
                    numDevs++;
                } else {
                    numDes++;
                }
            }
        }
        return numDevs*3000 + numDes*2000;
    }
    
    public void listarEquipe() {
        for (Funcionario f: funcionarios) {
            f.obterDescricaoFuncao();
        }
    }
}
