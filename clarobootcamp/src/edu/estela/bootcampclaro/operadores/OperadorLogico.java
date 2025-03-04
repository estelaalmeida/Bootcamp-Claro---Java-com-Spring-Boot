package edu.estela.bootcampclaro.operadores;

public class OperadorLogico {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 &&( 7 > 4)){
            System.out.println("Condiçõe verdadeira");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das duas condições é verdadeira");
}
    
}  
}
