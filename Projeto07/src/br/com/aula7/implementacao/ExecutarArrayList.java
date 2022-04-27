package br.com.aula7.implementacao;

import br.com.aula7.beans.Aluno;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutarArrayList {
    public static void main(String[] args) {
        List<String> listaNomes = new ArrayList<String>();

        listaNomes.add("Ana");
        listaNomes.add("Beatriz");
        listaNomes.add("Pedro");
        listaNomes.add("Jose");
        listaNomes.add(0,"Cris");

        System.out.println("Tamanho ListaNomes: " + listaNomes.size());
        System.out.println("Mostrar conteudo: " + listaNomes.get(0));
        System.out.println("Lista:" + listaNomes);

        Collections.sort(listaNomes);

        System.out.println("Lista ordenada:" + listaNomes);

        // Pesquisar
        String procurar = JOptionPane.showInputDialog("Digite nome para pesquisa:");

        int posicao = listaNomes.indexOf(procurar);
        if (posicao >= 0 ) {
            System.out.println("Achou :) na posição: " + posicao + " - " + listaNomes.get(posicao));
        } else {
            System.out.println(" Não localizado");
        }

        // Usando Classe

        System.out.println( " --- Agora é Classe ---");

        List<Aluno> listaAlunos = new ArrayList<Aluno>();

        Aluno a1 = new Aluno("Ana",8,0,20);
        Aluno a2 = new Aluno("Beatriz",6,10,25);
        Aluno a3 = new Aluno("Maria",9,5,18);

        listaAlunos.add(a3);
        listaAlunos.add(a1);
        listaAlunos.add(a2);
        listaAlunos.add(a3);

        System.out.println("Tamanho ListaAlunos: " + listaAlunos.size());
        System.out.println("Mostrar conteudo: " + listaAlunos.get(0).getNome());
        System.out.println("Lista:" + listaAlunos);

        for (Aluno item: listaAlunos) {
            System.out.println(item.getNome() + " - " + item.getIdade());
        }

        Collections.sort(listaAlunos);

        System.out.println("Lista:" + listaAlunos);

    }
}
