/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atividadeconta;

import java.util.Set;
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
       for(Conta indice : lista){
           if(nome.equals(indice.getNome())){
               return indice.toString();
               
           }
       }
       return "Cliente não encontrado!";
   }
   
   public void exibirClientesOrdenados(){
       for(Conta indice : lista){
           System.out.println(indice.getNome());
       }
       
   }
   
   public void retornarTotal(){
       double total = 0;
       for(Conta indice : lista){
            total += indice.calcularValor();
       }
    }

}
