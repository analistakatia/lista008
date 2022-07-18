package exercicio02;

import java.util.ArrayList;
import java.util.Scanner;

public class Candidatos {

    private String numeroMatricula;
    private float nota;

    Scanner input = new Scanner(System.in);

    ArrayList<Candidatos> listaCandidatos = new ArrayList<>();

    //Construtor
    public Candidatos(String numeroMatricula, float nota) {
        this.numeroMatricula = numeroMatricula;
        this.nota = nota;
    }

    public Candidatos() {
    }

    //Métodos
    //Método Adicionar Candidato
    public void adicionar() {

        System.out.println("Informe o número de matrícula do candidato: ");
        String matricula = input.next();

        System.out.println("Informe a nota do candidato: ");
        float nota = input.nextFloat();

        System.out.println("Você adicionou um novo candidato! \nO novo candidato tem como número de matrícula: " + matricula + " e nota: " + nota);

        Candidatos novoCandidato = new Candidatos(matricula, nota);
        listaCandidatos.add(novoCandidato);
    }

    //Método Exibir Candidatos
    public void exibir() {

        for (int i = 0; i < listaCandidatos.size(); i++) {
            System.out.println("Número de matrícula: " + listaCandidatos.get(i).getNumeroMatricula() + " - Nota: " + listaCandidatos.get(i).getNota());
        }
    }

    //Métodos Excluir Candidato
    public void excluir() {

        System.out.println("Informe a matrícula que deseja excluir? \n");
        exibir();
        String excluirCandidato = input.next();

        for (int i = 0; i < listaCandidatos.size(); i++) {
            if (listaCandidatos.get(i).getNumeroMatricula().equals(excluirCandidato)) {
                listaCandidatos.remove(i);
            }
        }
    }

    //Getters and Setters
    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}

