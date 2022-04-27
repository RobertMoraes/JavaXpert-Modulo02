package br.com.aula7.beans;

public class Livro implements Comparable<Livro>{

    private String titulo;
    private String isbn;
    private String autor;
    private int paginas;
    private float preco;

    public Livro(){}


    public Livro(String titulo, float preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public Livro(String titulo, String isbn, String autor, int paginas, float preco) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.paginas = paginas;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return  "\ntitulo='" + titulo + '\'' +
                 ", preco=" + preco ;
    }

    @Override
    public int compareTo(Livro outroLivro) {
        return this.titulo.compareToIgnoreCase(outroLivro.getTitulo());
    }
}
