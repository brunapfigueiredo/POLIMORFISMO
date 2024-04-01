/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.brunapfigueiredo.projetocorrida.model;

/**
 *
 * @author brunapfigueiredo
 */
public class Moto implements Automovel {
    private String nome;
    
    public Moto(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
    
    public String acelerar() {
        return "RAM-RAM";
    }
    
    public String freiar() {
        return "Mreeeeghh";
    }
    
    public String ligar() {
        return null;
    }
    
    public String desligar() {
        return null;
    }
}
