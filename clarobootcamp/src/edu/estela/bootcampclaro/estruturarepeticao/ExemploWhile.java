package edu.estela.bootcampclaro.estruturarepeticao;
 

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    String Comprar;

    public static void main(String[] args) {
        double mesada = 50.0;
        while (mesada > 0) {

             Double valorDoce = valorAleatorio();
            if (valorDoce > mesada) 
                valorDoce = mesada;
            System.out.println("Doce: " + valorDoce + "Adicionado ao carrinho");
 
            mesada = mesada -valorDoce;
        }
    System.err.println("Mesada" + mesada);
    


    System.out.println("Joãozinho gastou toda sua mesada em doces");
        }
       public static double valorAleatorio(){
            return ThreadLocalRandom.current().nextDouble(2,15);
    }
}
