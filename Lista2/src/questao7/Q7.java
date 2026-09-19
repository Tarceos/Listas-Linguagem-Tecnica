/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao7;

/**
 *
 * @author Tarcísio
 */
public class Q7 {
    public static void exec() {
        Aluno a = new Aluno("Tarcisio", 007);
        
        System.out.println(a.nome);
        System.out.println(a.matricula);
        
        a.nota1 = 7;
        a.nota2 = 7.7;
        
        System.out.println("Média: " + a.obterMedia());
        System.out.println("Aprovação: " + a.aprovacao());
    }
}
