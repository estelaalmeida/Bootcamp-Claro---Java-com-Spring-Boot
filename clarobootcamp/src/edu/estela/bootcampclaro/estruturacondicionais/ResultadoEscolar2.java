package edu.estela.bootcampclaro.estruturacondicionais;

//*Fluxo Condicional Encadeado.*/

public class ResultadoEscolar2 {
    
   public static void main(String[] args) {
    
    int nota = 10;
    if(nota >=7) //true
        System.out.println("Aprovado");

    else if ((nota >5 && nota <7)) //true ou false {
        System.out.println("Prova de recuperação.");
        
    else
        System.out.println("Reprovado");
   }
}
