/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.atividadeconta;

/**
 *
 * @author João Igor
 */
public class Main {

    public static void main(String[] args) {
        
        CadastroDeContas cadastrando = new CadastroDeContas();
        //2 objetos de condeDeAgua e 2 objetos de ContaDeEnergia
        Conta conta00 = new ContaDeAgua("João", 25, 45.5, 60.9);
        Conta conta01 = new ContaDeAgua("Igor", 11, 50.3, 55.0);
        Conta conta02 = new ContaDeEnergia("José", 30, 39.90, 70.3);
        Conta conta03 = new ContaDeEnergia("Fredo", 3, 29.9, 35.2);
        
        //adicionando varias
        cadastrando.adicionarClientes(conta00);
        cadastrando.adicionarClientes(conta01);
        cadastrando.adicionarClientes(conta02);
        cadastrando.adicionarClientes(conta03);
        
        //testando o método de pesquisa
        String nome00 = "João";
        System.out.println("Nome da conta pesquisada : " + nome00);
        System.out.println("Resultado da pesquisa: " + cadastrando.pesquisarConta(nome00));
        
        //testando o método de pesquisa com um cliente não cadastrado
        String nome01 = "Jeff";
        System.out.println("Nome da conta pesquisada : " + nome01);
        System.out.println("Resultado da pesquisa: " + cadastrando.pesquisarConta(nome01));
        
        //testando o método exibirClientesOrdenados
        cadastrando.exibirClientesOrdenados();
        
        //testando o método retornarTotal; 
        System.out.println("valor total: " + cadastrando.retornarTotal());

    }
}
