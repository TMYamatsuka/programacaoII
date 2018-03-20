
package atividade4;

import java.util.ArrayList;

public class Aeroporto {
    String prefix;
    String marca;
    String companhia; 
    String prefAeroporto;
    String nomeAeroporto;
        
    ArrayList<AviaoPatio> lista;
    
    public Aeroporto(){
    lista = new  ArrayList(3);    
}

    public void Aterrissar(AviaoPatio a){
       lista.add(a);
    }
      
    public void Decolar(AviaoPatio a){
      for(AviaoPatio aux: lista){
          if(aux.prefix == a.prefix){
              lista.remove(aux);
              return;
          }
      }
    }
    
    public void Listar(){
        for(AviaoPatio a : lista){
            System.out.println("Prefixo: " + a.prefix);
            System.out.println("Marca: " + a.marca);
            System.out.println("Companhia: " + a.companhia);
            System.out.println("");
            
        }
    }
    
      
}
