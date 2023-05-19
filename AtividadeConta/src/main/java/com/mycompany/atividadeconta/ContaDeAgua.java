/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeconta;

/**
 *
 * @author João Igor
 */
public class ContaDeAgua extends Conta {
    
    //atributos 
    private double consumoEmMetroCubico;
    private double valorPorMetroCubico;
    //construtor
    public ContaDeAgua(String nome, int diaDoPagamento, double consumoEmMetroCubico, double valorPorMetroCubico) {
        super(nome, diaDoPagamento);
        this.consumoEmMetroCubico = consumoEmMetroCubico;
        this.valorPorMetroCubico = valorPorMetroCubico;
    }
    
    
    
    
    //sobrescrita do método abstrato
    @Override
    public double calcularValor() {
        double total = (consumoEmMetroCubico * valorPorMetroCubico + 30);
        return total;
    }
    
    //métodos de acesso e métodos modificadores

    public double getConsumoEmMetroCubico() {
        return consumoEmMetroCubico;
    }

    public void setConsumoEmMetroCubico(double consumoEmMetroCubico) {
        this.consumoEmMetroCubico = consumoEmMetroCubico;
    }

    public double getValorPorMetroCubico() {
        return valorPorMetroCubico;
    }

    public void setValorPorMetroCubico(double valorPorMetroCubico) {
        this.valorPorMetroCubico = valorPorMetroCubico;
    }

}
