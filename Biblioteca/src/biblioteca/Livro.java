package biblioteca;

import java.util.ArrayList;

//Classe representando um livro
class Livro {
	 private String codigo;
	 private String titulo;
	 private int copiasDisponiveis;
	
	 public Livro(String code, String title, int availableCopies) {
	     this.codigo = code;
	     this.titulo = title;
	     this.copiasDisponiveis = availableCopies;
	 }
	
	 public Livro() {
		// TODO Auto-generated constructor stub
	}
	
	public String getCode() {
	     return codigo;
	 }
	
	 public String getTitle() {
	     return titulo;
	 }
	
	 public int getCopiasDisponiveis() {
	     return copiasDisponiveis;
	 }
	 
	 public void decreaseAvailableCopies() {
	     if (copiasDisponiveis > 0) {
	         copiasDisponiveis--;
	     }
	 }
	
	 public void increaseAvailableCopies() {
	     copiasDisponiveis++;
	 }
	
	 // Outros métodos e atributos necessários
	 public Livro addBook(String code, String title, int copiasDisponiveis) {
	     Livro book = new Livro(code, title, copiasDisponiveis);
	     
	     return book;
	    
	 }
}