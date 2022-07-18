package exercicio03;

import java.util.Scanner;

public class CardapioMain {
    public static void main(String[] args) {

        boolean teste = true;
        Scanner input = new Scanner(System.in);
        Cardapio pratos = new Cardapio();


        while (teste == true) {
            System.out.println("\nEscolha uma das opções abaixo: ");
            System.out.println("\nDigite 1 - adicionar prato");
            System.out.println("Digite 2 - exibir pratos");
            System.out.println("Digite 3 - excluir prato");
            System.out.println("Digite 4 - finalizar\n");

            int resposta = input.nextInt();

            switch (resposta) {

                case 1:
                    pratos.adicionarPrato();
                    pratos.adicionarIngrediente();
                    break;

                case 2:
                    pratos.exibirPrato();
                    break;

                case 3:
                    pratos.excluirPrato();
                    break;

                case 4:
                    teste = false;
                    System.out.println("Cadastro finalizado pelo usuário.");
                    break;

                default:
                    System.out.println("Nenhuma ação foi realizada." +
                            "Favor digitar um número válido!\n ");
            }
        }

    }
}


