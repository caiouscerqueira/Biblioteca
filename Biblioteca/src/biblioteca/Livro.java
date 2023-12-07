package biblioteca;

//Classe representando um livro
class Livro {
 private int codigo;
 private String titulo;
 private int copiasDisponiveis;

 public Livro(int code, String title, int availableCopies) {
     this.codigo = code;
     this.titulo = title;
     this.copiasDisponiveis = availableCopies;
 }

 public Livro() {
	// TODO Auto-generated constructor stub
}

public int getCode() {
     return codigo;
 }

 public String getTitle() {
     return titulo;
 }

 public int getAvailableCopies() {
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
}