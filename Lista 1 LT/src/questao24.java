/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Tarcísio
 */
public class questao24 {
    public static double gaso = 8.00;
    public static double alco = 6.00;
    
    public static void exec() {
        double litros, preco;
        char comb;
        
        System.out.println("Insira o combustível desejado.");
        System.out.println("g - gasolina $8,00;\na - álcool $6,00");
        comb = Lista1LT.ler.next().charAt(0);
        
        System.out.println("Insira a quantidade de litros.");
        litros = Lista1LT.ler.nextDouble();
        
        switch (comb) {
            case 'a':
                if (litros > 20) {
                    preco = litros*alco*0.95;
                    
                    System.out.println("Preço final: $" + Lista1LT.df.format(preco) + "\n(5% de desconto.)" );
                } else {
                    preco = litros*alco*0.97;
                    
                    System.out.println("Preço final: $" + Lista1LT.df.format(preco) + "\n(3% de desconto.)" );
                }
                break;
                
            case 'g':
                if (litros > 20) {
                    preco = litros*gaso*0.94;
                    
                    System.out.println("Preço final: $" + Lista1LT.df.format(preco) + "\n(6% de desconto.)" );
                } else {
                    preco = litros*gaso*0.96;
                    
                    System.out.println("Preço final: $" + Lista1LT.df.format(preco) + "\n(4% de desconto.)" );
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
