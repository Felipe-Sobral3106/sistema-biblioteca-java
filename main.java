public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien");
    
        System.out.println("=== bliblioteca ===");
        System.out.println("Livro: " + livro1.getTitulo());
        System.out.println("Autor: " + livro1.getAutor());
        System.out.println("Status: " + (livro1.isEstaEmprestado() ? "Emprestado" : "Disponível"));

        //simulando o emprestimo do livro
        System.out.println("\nRealizando o empréstimo de:" + livro1.getTitulo());
        livro1.emprestar();

        //verificando o status do livro após o empréstimo
        System.out.println("Status: " + (livro1.isEstaEmprestado()  ? "Emprestado" : "Disponível"));

        System.out.println("=========================================");
    }
}
