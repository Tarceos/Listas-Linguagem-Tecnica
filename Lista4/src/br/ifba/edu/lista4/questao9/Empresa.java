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

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        if (funcionarios == null) {
            throw new IllegalArgumentException("Funcionário inválido!");
        }
        this.funcionarios = funcionarios;
    }
    
    public void contratar(Funcionario f) {
        // setFuncionarios(funcionarios.add(f));
    }
}
