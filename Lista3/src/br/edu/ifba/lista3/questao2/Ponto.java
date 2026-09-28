/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ifba.lista3.questao2;

/**
 *
 * @author Tarcísio
 */
public class Ponto {
    private double x, y;

    
    public Ponto() {
        this.x = 0;
        this.y = 0;
    }
    
    public Ponto(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public void move(double dx, double dy) {
        setX(x += dx);
        setY(y += dy);
    }
    
    public boolean compara(Ponto p) {
        return this.x == p.x && this.y == p.y;
    }
    
    public void mostra() {
        System.out.println("X:" + getX());
        System.out.println("Y:" + getY() + "\n");
    }
    
    public double distancia(Ponto p) {
        return Math.sqrt(Math.pow(this.x - p.x, 2) + Math.pow(this.y - p.y, 2));
    }
}
