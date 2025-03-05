package edu.estela.bootcampclaro.desafios;


import java.util.Scanner;


public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String agencia, nomeCliente ;
        String saldo;
        String numero;

        System.out.println("Por favor, digite o número da Agência !");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        numero = sc.nextLine();

        System.out.println("Por favor, digite o digito da conta!");
        numero = sc.nextLine();

        System.out.println("Informe o seu nome!.");
        nomeCliente = sc.nextLine();
        System.out.println("Informe o seu saldo!");
        saldo =sc.nextLine();

        String usuario = "Olá".concat(nomeCliente)

                 .concat(", obrigado por criar uma conta em nosso banco, sua agência é")
                 .concat(agencia).concat("conta"  )
                 .concat(numero).concat("e seu saldo")
                 .concat(saldo).concat(" \"já está disponível para saque.\"");
    
                 System.out.println(usuario);
       
    }
}


