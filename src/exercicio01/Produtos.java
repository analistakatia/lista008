import java.util.ArrayList;
import java.util.Scanner;

public class Produtos {
    private String nome;
    private double preco;

    Scanner input = new Scanner(System.in);
    ArrayList<Produtos> listaDeProdutos = new ArrayList<>();

    public Produtos() {

    }

    //Inicializando o Construtor
    public Produtos(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    //Adicionando métodos
    public void adicionarProduto() {

        System.out.println("Nome do Produto: ");
        nome = input.next();
        System.out.println("Valor do Produto: R$ ");
        preco = input.nextDouble();
        Produtos novoProduto = new Produtos(nome, preco);
        listaDeProdutos.add(novoProduto);
    }

    public void listarProduto() {
        for (int i = 0; i < listaDeProdutos.size(); i++) {
            System.out.println("Nome do Produto: " + listaDeProdutos.get(i).getNome() + " Preço: " + listaDeProdutos.get(i).getPreco());
        }
    }
    public void excluirProduto() {
        System.out.print("Digite o nome do produto que deseja excluir/remover: ");
        listarProduto();
        String excluirProduto = input.next();
        for (int i = 0; i < listaDeProdutos.size(); i++) {

            if (listaDeProdutos.get(i).getNome().equalsIgnoreCase(excluirProduto)) {
                listaDeProdutos.remove(i);
            }
        }
    }
    //Criando Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}


