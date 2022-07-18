package exercicio02;

import java.util.Scanner;

public class CandidatosMain {
    public static void main(String[] args) {
        boolean teste = true;
        Scanner candid = new Scanner(System.in);
        Candidatos candidato = new Candidatos();

        while(teste == true){
            System.out.println("Escolha uma das opções abaixo: ");
            System.out.println("\nDigite 1 - adicionar candidato");
            System.out.println("Digite 2 - exibir candidato");
            System.out.println("Digite 3 - excluir candidato");
            System.out.println("Digite 4 - sair\n");

            int resposta = candid.nextInt();

            switch (resposta){

                case 1:
                    candidato.adicionar();
                    break;

                case 2:
                    candidato.exibir();
                    break;

                case 3:
                    candidato.excluir();
                    System.out.println("Número de matrícula/candidato excluido com sucesso!");
                    break;

                case 4:
                    teste = false;
                    System.out.println("Programa finalizado pelo usuário.");
                    break;

                default:
                    System.out.println("Nenhuma ação foi realizada." +
                            "Favor digitar um número válido!\n ");
            }
        }
    }
}
