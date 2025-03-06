package edu.estela.bootcampclaro.estruturaexepcionais;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US); 
        
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome: ");
        String sobrenome = scanner.next();

        System.out.println("Digite seu idade: ");
        String idade = scanner.next();

        System.out.println("Digite sua altura: ");
        String altura = scanner.next();
    
    //imprimindo os dadod obitidos pelo usuário
    
        System.out.println("Olá, me chamo" + nome.toUpperCase() + " " + sobrenome);
        System.out.println("Tenho " + idade + " " + "anos");
        System.out.println("Minha altura é " + altura + "cm ");
        scanner.close();
        }
        catch (InputMismatchException e) {
            System.out.println("os campos idade e altura precisam ser numéricos.");
        } 
    
    }
}
    

