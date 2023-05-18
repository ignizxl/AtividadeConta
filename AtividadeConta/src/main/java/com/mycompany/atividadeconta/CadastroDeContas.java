/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeconta;

import java.util.TreeSet;

/**
 *
 * @author João Igor
 */
public class CadastroDeContas {
   TreeSet<Conta> lista = new TreeSet<>();
   
   public void adicionarClientes(Conta conta){
       lista.add(conta);
       
   }
   
   public String pesquisarConta(String nome){
       for(Conta contas : lista){
           if(nome.equals(contas)){
               return contas.toString();
               
           }
       }
       return null;
   }
   
   public void exibirClientesOrdenados(){
       
   }
   
   public void retornarTotal(){
       double total = 0;
       for(Conta contas : lista){
        total += contas.calcularValor();
       }
    }

}
