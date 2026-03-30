import javax.swing.JOptionPane;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> livros = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            String menu = "---- Biblioteca ----\n" +
                          "1. Cadastrar Livro\n" +
                          "2. Listar Livros\n" +
                          "3. Emprestar Livro\n" +
                          "4. Devolver Livro\n" +
                          "0. Sair\n\n" +
                          "Escolha uma opção:";
            String input = JOptionPane.showInputDialog(menu); 

            if(input == null) break;
            opcao = Integer.parseInt(input);

            if (opcao == 1) {
                String titulo = JOptionPane.showInputDialog("Digite o título do livro:");
                String autor = JOptionPane.showInputDialog("Digite o autor do livro:");
                livros.add(new Livro(titulo, autor));
                JOptionPane.showMessageDialog(null, "Livro cadastrado com sucesso!");      
            }
            else if (opcao == 2) {
                String lista = "Livros cadastrados:\n";
                for (Livro livro : livros) {
                    lista += "- " + livro.getTitulo() + " by " + livro.getAutor() + "\n" + "  Status: " + (livro.isEstaEmprestado() ? "Emprestado" : "Disponível") + "\n";
                }
                JOptionPane.showMessageDialog(null, lista);
            }
            else if (opcao == 3) {
                String busca = JOptionPane.showInputDialog("Digite o título do livro para emprestar:");
                boolean encontrado = false;

                for (Livro livro : livros) {
                    if (livro.getTitulo().equalsIgnoreCase(busca)) {
                        encontrado = true;
                        if (!livro.isEstaEmprestado()) {
                            livro.emprestar();
                            JOptionPane.showMessageDialog(null, "Livro emprestado com sucesso!");
                        } else {
                            JOptionPane.showMessageDialog(null, "Livro já está emprestado.");
                        }
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    JOptionPane.showMessageDialog(null, "Livro não encontrado.");
                }
            }
        }
     }
    }
