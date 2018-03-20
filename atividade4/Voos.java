
package atividade4;

import java.util.ArrayList;

public class Voos {
    AviaoPatio acervo[];
    
    
    ArrayList<Aeroporto> saida;
    ArrayList<Aeroporto> chegada;
    
    public Voos(){
        saida = new ArrayList();
        chegada = new ArrayList();
    }
    
    public void Chegada(Aeroporto a){
        chegada.add(a);
    }
    
    public void Saida(Aeroporto a){
        saida.add(a);
    }
    
    public void listar(){
        boolean saida = true;
        for(AviaoPatio a : acervo){
            if(a != null){
               System.out.println("Prefixo: " + a.prefix);
               System.out.println("Marca: " + a.marca);
               System.out.println("Companhia: " + a.companhia);
               System.out.println("");
            }
   
        }
    }
        }
    



