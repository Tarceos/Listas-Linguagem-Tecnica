/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista4.questao7;

/**
 *
 * @author Tarcísio
 */
public class ContaBancaria {
    private String numeroConta, titular;
    private double saldo;

    public ContaBancaria(String numeroConta, String titular, double saldo) {
        setNumeroConta(numeroConta);
        setTitular(titular);
        setSaldo(saldo);
    }

    

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void depositar(double valor) {
        setSaldo(saldo += valor);
    }
    
    public void sacar(double valor) {
        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo Insuficiente.");
        }
        setSaldo(saldo -= valor);
    }
}
