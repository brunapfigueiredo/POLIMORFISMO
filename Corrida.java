/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.brunapfigueiredo.projetocorrida.model;


import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author brunapfigueiredo
 */
public class Corrida {
    public Date inicio;
    private Pista PistaEscolhida;
    private ArrayList<Automovel> automoveis = new ArrayList();
    
    public void adicionarAutomovel(Automovel a) {
        this.automoveis.add(a);
    }
    
    public void pistaEscolhida(Pista p) {
    this.PistaEscolhida = p;
}
    
    private void liguemSeusMotores() {
        for (Automovel a : this.automoveis) {
            System.out.println(a.acelerar());
        }
    }
    
    public void iniciarCorrida() {
        this.liguemSeusMotores();
    }
    
    private void semControle() {
        for (Automovel a : this.automoveis) {
            System.out.println(a.freiar());
        }
    }
    
    public void perdeControle() {
        this.semControle();
    }
}
