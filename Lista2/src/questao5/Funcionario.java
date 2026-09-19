/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao5;

import lista2.Lista2;

/**
 *
 * @author Tarcísio
 */
public class Funcionario {
    String nome;
    double salarioBruto,imposto;
    
    double calcularSalarioLiquido() {
        return salarioBruto - imposto;
    }
    
    double aumentarSalario(double porc) {
        return salarioBruto*(porc+1);
    }
    
    void resumo() {
        System.out.println("Nome: " + nome);
        System.out.println("Sal: " + Lista2.df.format(salarioBruto));
        System.out.println("imposto: " + Lista2.df.format(imposto));
    }
}
