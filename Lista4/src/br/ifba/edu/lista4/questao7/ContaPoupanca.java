/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifba.edu.lista4.questao7;

/**
 *
 * @author Tarcísio
 */
public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.taxaRendimento = 0.5;
    }
    
    public void aplicarRendimento() {
        super.setSaldo(super.getSaldo() + super.getSaldo() * taxaRendimento);
    }
    
}
