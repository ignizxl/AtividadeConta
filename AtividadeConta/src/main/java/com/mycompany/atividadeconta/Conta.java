/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeconta;

/**
 *
 * @author João Igor
 */
public abstract class Conta implements Comparable<Conta> {
    //atributos 
    private String nome;
    private int diaDoPagamento;
    
    //construtor
    public Conta(String nome, int diaDoPagamento) {
        this.nome = nome;
        this.diaDoPagamento = diaDoPagamento;
    }
    
    
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
        return diaDoPagamento;
    }

    public void setDiaDoPagamento(int DiaDoPagamento) {
        this.diaDoPagamento = DiaDoPagamento;
    }
    
    @Override
    public int compareTo(Conta conta){
        return this.getNome().compareTo(conta.getNome());
    }
        
}
