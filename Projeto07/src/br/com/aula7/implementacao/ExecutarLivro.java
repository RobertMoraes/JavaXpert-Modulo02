package br.com.aula7.implementacao;

import br.com.aula7.beans.Livro;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExecutarLivro{
    public static void main(String[] args) {

        List<Livro> bancoLivros = new ArrayList<Livro>();

        while (true){
            System.out.println(" -- Carregar Dados de Livro");

            System.out.println("Resultado ADD: " + (bancoLivros.add(new Livro(JOptionPane.showInputDialog("Titulo:"), Float.parseFloat(JOptionPane.showInputDialog("Valor:"))))));

            Collections.sort(bancoLivros);

            System.out.println("\nLista de Livros:");
            System.out.println(bancoLivros.toString());
        }

    }
}
