/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacao;

public class Refrigerante {
    private double preco;
    private String nome;
    
    Refrigerante(){
        preco = 0;
        nome = "";
    }
    Refrigerante(double preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public String getNome(){
        return nome;
    }
    public void setPreco(double preco){
       this.preco = preco;
   }
    public void setNome(String nome){
       this.nome = nome;
   }
}   

