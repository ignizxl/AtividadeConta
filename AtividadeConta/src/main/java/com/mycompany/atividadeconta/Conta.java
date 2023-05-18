/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeconta;

/**
 *
 * @author João Igor
 */
public abstract class Conta {
    //atributos 
    private String nome;
    private int DiaDoPagamento;
    //método abstrato
    public abstract double calcularValor();
    
    //métodos de acesso e métodos modificadores
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDiaDoPagamento() {
        return DiaDoPagamento;
    }

    public void setDiaDoPagamento(int DiaDoPagamento) {
        this.DiaDoPagamento = DiaDoPagamento;
    }
     
}
