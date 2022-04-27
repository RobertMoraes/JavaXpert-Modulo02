package br.com.aula7.implementacao;

import br.com.aula7.beans.Aluno;

import javax.swing.*;

public class ExecutarVetor {
    public static void main(String[] args) {
        String listaNome[] = {"Ana", "Beatriz","Maria"};

        // Apresentação
        System.out.println("ListaNome: " + listaNome);
        System.out.println("Visualizar ListaNome[1]: " + listaNome[1] );

        listaNome[1] = "Jose";
        System.out.println("Visualizar ListaNome[1]: " + listaNome[1] );

        // limite de tamanho conforme inicialização
        //listaNome[3] = "Antonio";

        System.out.println(listaNome.length);

        for (int posicao=0; posicao < listaNome.length; posicao++){
            System.out.println("indice["+posicao+"] " + listaNome[posicao]);
        }

        // pesquisar

        String procurar = JOptionPane.showInputDialog("Nome para pesquisar:");
        for (int posicao=0; posicao < listaNome.length; posicao++){
            if (listaNome[posicao].equalsIgnoreCase(procurar)) {
                JOptionPane.showMessageDialog(null,"Achei :) - " + listaNome[posicao],"aviso",2);
            }
        }

        // Usando objeto

        Aluno[] listaAlunos = new Aluno[3];

        listaAlunos[0] = new Aluno("Ana",8,0,20);
        listaAlunos[1] = new Aluno("Beatriz",6,10,25);
        listaAlunos[2] = new Aluno("Maria",9,5,18);

        //listaAlunos[3] = new Aluno("Antonio",9,5,18);
        System.out.println("Visualizar ListaAlunos[1]: " + listaAlunos[1]);
        System.out.println("Visualizar ListaAlunos[1]: " + listaAlunos[1].getNome() );

        listaAlunos[1].setFaltas(30);
        listaAlunos[1].setMedia(5);

        for (int posicao=0; posicao < listaAlunos.length; posicao++){
            if (listaAlunos[posicao].getNome().equalsIgnoreCase(procurar)) {
                JOptionPane.showMessageDialog(null,"Achei :) - " + listaAlunos[posicao].getNome(),"Ops..!!",3);
            }
        }




    }
}
