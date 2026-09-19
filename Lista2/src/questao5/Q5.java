/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao5;

/**
 *
 * @author Tarcísio
 */
public class Q5 {
    public static void exec() {
        Funcionario f = new Funcionario();
        
        f.nome = "Tarceos";
        f.imposto = 800;
        f.salarioBruto = 7000;
        
        f.resumo();
        
        System.out.println("Sal liq: " + f.calcularSalarioLiquido());
        System.out.println("Aumento: "+ f.aumentarSalario(0.2));
        
        
    }
}
