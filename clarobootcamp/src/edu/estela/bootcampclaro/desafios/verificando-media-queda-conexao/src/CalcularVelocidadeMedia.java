import java.util.Scanner;

 // TODO: Preencha a função para verificar queda de conexão
public class CalcularVelocidadeMedia {
    
    public static String verificarQuedaConexao(String[] velocidades) {
        String retorno = "Sem Quedas";
        
        try {
          for(String velocidade : velocidades) {
            if (velocidade.equals("0")) {
              retorno = "Queda de Conexao";
              return retorno;
            }
          }
        } catch (NumberFormatException e){
          System.out.println("Erro: Número inválido");
        }
        
        return retorno;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();


        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");


        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);


        // Exibindo o resultado da verificação
        System.out.println(resultado);


        scanner.close();
    }
    
}



