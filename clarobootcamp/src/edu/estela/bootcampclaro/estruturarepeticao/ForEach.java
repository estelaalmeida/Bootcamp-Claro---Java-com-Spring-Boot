package edu.estela.bootcampclaro.estruturarepeticao;

public class ForEach {

    /**
     * @param args
     */
    public static void main(String[] args) {
        String alunos [] = { "ESTELA","EULER","FELIPE"};

        //For abreviado. Para interagir sobre array

        for (String aluno : alunos){
                System.out.println("Nome do aluno é:" + aluno);
        }
    }
}