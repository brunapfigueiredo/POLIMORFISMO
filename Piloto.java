/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.brunapfigueiredo.projetocorrida.model;

/**
 *
 * @author brunapfigueiredo
 */
public class Piloto extends Pessoa {
    
    public Piloto(String nome) {
        super(nome);
    }

    @Override
    public String ligarVeiculo() {
        return "gira a chave na ignicao";
    }

    @Override
    public String aquecerMotor() {
        return "aquece o motor, acelerando aos poucos";
    }
    
    @Override
    public String semControle() {
        return "perde o controle";
    }

    @Override
    public String freiarNaCurva() {
        return "freia na curva";
    }

    @Override
    public String trocarMarcha() {
        return "troca de marcha";
    }

    @Override
    public String pararVeiculo() {
        return "estaciona";
    }
}



