package edu.estela.bootcampclaro.operadores;

public class OperadoRelacional {
    public static void main(String[] args) {
        String nomeUm    = "Estela";
        String nomeDois  = new String("Estela");
        // new cria um novo objeto
        System.out.println(nomeDois.equals(nomeUm));
        //equals compara objetos  igualdade
        
        int numero1 = 1;
        int numero2 = 2;


        if(numero1 < numero2){
            System.out.println("Nossa condição é verdadeira");//true
        }

        boolean simNao = numero1 == numero2;
        System.out.println("numero1 é igual a numero2? " + simNao);

        simNao = numero1 != numero2;
        System.out.println("numero1 é diferente de numero2? " + simNao);

        simNao = numero1 >= numero2;
        System.out.println("numero1 é maior que numero2? " + simNao);

        simNao = numero1 <= numero2;
        System.out.println("numero1 é menor que numero2? " + simNao);
    }
}
