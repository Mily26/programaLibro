/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programalibro;

/**
 *
 * @author Milagros
 */
public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int numeroPaginas;
    private String genero;
    
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int newIsbn) {
        this.isbn = newIsbn;
    }
    
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String newTitulo) {
        this.titulo = newTitulo;
    }
    
    public String getAutor() {
        return autor;
    }
    public void setAutor(String newAutor) {
        this.autor = newAutor;
    }
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    public void setNumeroPaginas(int newNumeroPaginas) {
        this.numeroPaginas = newNumeroPaginas;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String newGenero){
        this.genero = newGenero;
    }
    
    public Libro (int isbn, String titulo, String autor, int numeroPaginas, String genero) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
        this.genero = genero;
    }
    
    public String toString() {
        return "Titulo: " + titulo + " isbn: " + isbn + " autor: " + autor + " numero de paginas: " + numeroPaginas + " genero: " + genero; 
    }
}
