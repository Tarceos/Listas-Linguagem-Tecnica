/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao4;

/**
 *
 * @author Tarcísio
 */
public class Retangulo {
    double base, altura;
    
    double calcularArea() {
        return base*altura;
    }
    
    double calcularPerimetro() {
        return (base + altura) * 2;
    }
}
