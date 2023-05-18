/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeconta;

/**
 *
 * @author João Igor
 */
public class ContaDeEnergia extends Conta {
    //atributos
    private double consumoEmWk;
    private double tarifaPorWh;
    
    //sobreescrita do método abstrato
    @Override
    public double calcularValor() {
        double total = (consumoEmWk * tarifaPorWh + 22);
        return total;
    }
    
    //métodos de acesso e métodos modificadores
    public double getConsumoEmWk() {
        return consumoEmWk;
    }

    public void setConsumoEmWk(double consumoEmWk) {
        this.consumoEmWk = consumoEmWk;
    }

    public double getTarifaPorWh() {
        return tarifaPorWh;
    }

    public void setTarifaPorWh(double tarifaPorWh) {
        this.tarifaPorWh = tarifaPorWh;
    }
    
}
