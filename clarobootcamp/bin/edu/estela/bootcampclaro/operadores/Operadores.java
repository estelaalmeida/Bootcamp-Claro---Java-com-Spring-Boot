package clarobootcamp.bin.edu.estela.bootcampclaro.operadores;

public class Operadores {
    public static void main(String[] args) {
    
        String concatenacao = "?";

        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);
        
        int numero = 5;
    
        System.out.println(-numero);//não altera o valor
        System.out.println(numero);

        numero = -numero;
        System.out.println(numero);

        numero = + numero * -1;
        // para torna o n° positivo
        System.out.println(numero);

    
        // incremento x repeticao
        numero =  numero +1;
        System.out.println(numero);

    }
}
