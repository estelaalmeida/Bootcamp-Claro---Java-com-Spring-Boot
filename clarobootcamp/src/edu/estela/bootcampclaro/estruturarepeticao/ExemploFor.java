package edu.estela.bootcampclaro.estruturarepeticao;

import java.util.Scanner;

public class ExemploFor {
    /**
     * @param args
     */
    public static void main(String[] args) {
            int carneiros; 
            try (Scanner sc = new Scanner (System.in)) {
                for (carneiros = 1; carneiros <= 20; carneiros ++ ){
                    System.out.println("contagem: " + carneiros );
                    String contadorCarneirinho;
                    contadorCarneirinho = sc.nextLine();
                    System.out.println(contadorCarneirinho);
                        
                }
            }

    }

}