/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.ifba.edu.lista4.questao7;

/**
 *
 * @author Tarcísio
 */
public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(double limiteChequeEspecial, String numeroConta, String titular, double saldo) {
        super(numeroConta, titular, saldo);
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        if (super.getSaldo() + limiteChequeEspecial < valor) {
            throw new IllegalArgumentException("Valor acima do limte de cheque especial.");
        }
        
        super.setSaldo(super.getSaldo() -  valor - 2);
    }
    
    
    
}
