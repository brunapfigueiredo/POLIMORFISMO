/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.brunapfigueiredo.projetocorrida;

import br.brunapfigueiredo.projetocorrida.model.Pista;
import br.brunapfigueiredo.projetocorrida.model.Carro;
import br.brunapfigueiredo.projetocorrida.model.Moto;
import br.brunapfigueiredo.projetocorrida.model.Corrida;
import br.brunapfigueiredo.projetocorrida.model.Pessoa;
import br.brunapfigueiredo.projetocorrida.model.Piloto;
/**
 *
 * @author brunapfigueiredo
 */
public class Projetocorrida {

    public static void main(String[] args) {
        Pista p = new Pista("Circuito de Mônaco");
        
        Pessoa piloto1 = new Piloto("Bruna");
        Pessoa piloto2 = new Piloto("Maya");
        Pessoa piloto3 = new Piloto("Lais");
        Pessoa piloto4 = new Piloto("Kaue");

        Corrida corrida = new Corrida();
        corrida.pistaEscolhida(p);
        
       

        System.out.println("Liguem seus motores!\n");
        
        Carro carro1 = new Carro("Ferrari SF90 Stradale");
        corrida.adicionarAutomovel(carro1);
        System.out.println(piloto1.nome + " com o " + carro1.getNome() + " " + piloto1.ligarVeiculo() + " e " + piloto1.aquecerMotor());
        corrida.iniciarCorrida();
        
        Carro carro2 = new Carro("McLaren Senna GTR");
        corrida.adicionarAutomovel(carro2);
        System.out.println(piloto3.nome + " com o " + carro2.getNome() + " " + piloto3.ligarVeiculo() + " e " + piloto3.aquecerMotor());
        corrida.iniciarCorrida();
        
        Moto moto1 = new Moto("Ducati Panigale V4 R");
        corrida.adicionarAutomovel(moto1);
        System.out.println(piloto2.nome + " com o " + moto1.getNome() + " " + piloto2.ligarVeiculo() + " e " + piloto2.aquecerMotor());
        corrida.iniciarCorrida();
        
        Moto moto2 = new Moto("Yamaha YZF-R1M");
        corrida.adicionarAutomovel(moto1);
        System.out.println(piloto4.nome + " com o " + moto2.getNome() + " " + piloto4.ligarVeiculo() + " e " + piloto4.aquecerMotor());
        corrida.iniciarCorrida();
        
        System.out.println("Preparados...A postos...Fogo!\n");
        corrida.iniciarCorrida();
        System.out.println("Primeira curva...\n");
        
        System.out.println(piloto4.nome + " " + piloto4.freiarNaCurva());
        corrida.perdeControle();
        System.out.println("e acaba perdendo o controle pela alta velocidade... \n"+piloto4.nome+" esta desclassificado.");
        
        System.out.println("\n...\n");
        
        System.out.println(piloto1.nome + " com grande vantagem, cruza a linha de chegada e vence a corrida!");
        
        

        
    }
}
