import java.util.ArrayList;
import java.util.Scanner;

public class ProdutosMain {

    public static void main(String[] args) {
        boolean produto = true;
        Scanner teste = new Scanner(System.in);
        Produtos produtos = new Produtos();
        System.out.println("=== Cadastro de Produtos ===");
        System.out.println("Ainda não há nenhum produto produto cadastrado no sistemma. " +
                "Favor iniciar escolhendo a primeira opção para realizar o primeiro cadastro!!");

        while (produto == true){

            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("\n1 - Cadastro de Produtos");
            System.out.println("2 - Exibir Lista de Produtos");
            System.out.println("3 - Excluir/Remover Produto");
            System.out.println("4 - Sair");

            int resposta = teste.nextInt();

            switch (resposta){
                case 1:
                    produtos.adicionarProduto();
                    System.out.println("Produto adicionado com sucesso!!\n");
                    break;
                case 2:
                    produtos.listarProduto();
                    break;
                case 3:
                    produtos.excluirProduto();
                    System.out.println("Produto excluido/removido com sucesso!!");
                    break;
                case 4:
                    produto = false;
                    System.out.println("Operação finalizada pelo usuário.");
                    break;
                default:
                    System.out.println("Número Inválido. Nenhuma operação pôde ser realizada!");
            }

        }
    }
}

