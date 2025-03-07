package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    

    public static void main(String[] args) {
        System.out.println("Processo Seletivo");

       String [] candidatos ={"FELIPE","BEATRIZ","ESTELA","MAYRA","ESTER"};
        for(String candidato: candidatos){
            entrandoEmcontato(candidato);

        }
    }
        
    static void entrandoEmcontato( String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do{
          atendeu = atender();
          continuarTentando = !atendeu;
          if (continuarTentando) 
                tentativasRealizadas ++;
          else
                System.out.println("Contato realizado com sucesso!");
                
        }while (continuarTentando && tentativasRealizadas<3);   
    
        if(atendeu)
        System.out.println("Conseguimos contato com "+ candidato + "na" + tentativasRealizadas + "tentatia");
        else 
        System.out.println(" Não conseguimos contato com "+ candidato + "número maximo tentativas" + tentativasRealizadas + "tentatia");
          
    //imprimirSelecionados();
     //metodo auxiliar
}
      static boolean atender(){

     Random random = new Random();
     System.out.println(random.nextInt(3));
         return true ;
           
                        
        }
    
    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE","BEATRIZ","ESTELA","MAYRA","ESTER"};
        
        System.out.println("imprimindo a lista de candidatos informando o elemento");

        for(int indice = 0; indice < candidatos.length; indice ++){
            System.out.println("O candidato de n° " + (indice + 1) + "  " +" é " + "  " + " " + candidatos[indice]);
        }

        System.out.println("Forma abreviada de interação for each");
            for(String candidato : candidatos)
                 System.out.println("Forma abreviada de interação for each" + " " + candidato);
   }

        //selecaoCandidatos();
       /*System.out.println("Processo seletivo");
        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);*/
    //}
    static void selecaoCandidatos() {

        String [] candidatos = {"FELIPE","BEATRIZ","ESTELA","MAYRA","ESTER"};
        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
       
        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
            
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println(" O Candidato" + " " + candidato + "  " + " solicitou este valor de salário");
            if(salarioBase >= salarioPretendido ){
                System.out.println("O candidato"  + " "  + candidato + "foi selecionado para a vaga");
                candidatosSelecionados ++;
            }
            candidatoAtual ++;
        }
    }
    
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido ) {
            System.out.println("Ligar para o candidato");
            
        }else if (salarioBase == salarioPretendido)
        System.out.println("Ligar para o candidato com contra proposta");

    else{
            System.out.println("Aguardando o resultados dos demias candidatos" + salarioPretendido);
        }
    
            
    }
}


