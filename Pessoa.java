/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.brunapfigueiredo.projetocorrida.model;

/**
 *
 * @author brunapfigueiredo
 */
public abstract class Pessoa {
    public String nome;
    
    public Pessoa (String n) {
        this.nome = n;
    }
    
    public abstract String ligarVeiculo();
    public abstract String aquecerMotor();
    public abstract String freiarNaCurva();
    public abstract String trocarMarcha();
    public abstract String pararVeiculo();
    public abstract String semControle();
}
