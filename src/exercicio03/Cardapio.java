package exercicio03;

import java.util.ArrayList;
import java.util.Scanner;

public class Cardapio {
    private String nomePrato;
    private String ingredientes;

    Scanner input = new Scanner(System.in);

    ArrayList<Cardapio> listaDeIngredientes = new ArrayList<>();
    ArrayList<Cardapio> listadePratos = new ArrayList<>();

    public Cardapio() {

    }

    public Cardapio(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    //Metodos
    public void adicionarPrato() {


        System.out.println("Qual o nome do Prato? ");
        String prato = input.next();
        Cardapio novoPrato = new Cardapio(prato);
        listadePratos.add(novoPrato);
    }

    public void adicionarIngrediente() {
        boolean testeIngred = true;
        System.out.println("Favor digitar o ingrediente que compõe esse prato: ");
        String ingredientes = input.next();
        Cardapio novoIngrediente = new Cardapio(ingredientes);
        listaDeIngredientes.add(novoIngrediente);

        System.out.println("Tem mais ingredientes para adicionar nesse prato? 1 - Sim / 2 - Não: ");

        int resposta = input.nextInt();
        while (resposta == 1) {
                System.out.println("Informe o próximo ingrediente: ");
                ingredientes = input.next();
                System.out.println("Tem mais ingredientes para adicionar nesse prato? 1 - Sim / 2 - Não: ");
                resposta = input.nextInt();
            switch (resposta){
                case 2:
                    System.out.println("Nenhum outro ingrediente a adicionar!");
            }
            novoIngrediente = new Cardapio(ingredientes);
            listaDeIngredientes.add(novoIngrediente);
        }
    }
    public void exibirPrato() {

        for (int i = 0; i < listadePratos.size(); i++) {
            System.out.println("Pratos do Cardápio: " + listadePratos.get(i).getNomePrato());
        }
    }

    public void excluirPrato() {
        System.out.println("Qual prato você deseja retirar do Cardápio? ");
        exibirPrato();
        String excluirPrato = input.next();

        for (int i = 0; i < listadePratos.size(); i++) {
            if (listadePratos.get(i).getNomePrato().equals(excluirPrato)) {
                listadePratos.remove(i);
                System.out.println("O prato foi removido com sucesso!");
                exibirPrato();
            }
        }
    }

    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
}
