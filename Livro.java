public class Livro{

    private String titulo;
    private String autor;
    private boolean estaEmprestado;

public Livro(String titulo, String autor){
    this.titulo = titulo;
    this.autor = autor;
    this.estaEmprestado = false;
}

public String getTitulo() {return titulo;}
public String getAutor() {return autor;}
public boolean isEstaEmprestado() {return estaEmprestado;}

public void emprestar(){
    this.estaEmprestado = true;
}

public void devolver(){
    this.estaEmprestado = false;
}
}