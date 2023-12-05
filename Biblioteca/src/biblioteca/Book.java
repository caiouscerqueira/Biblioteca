package biblioteca;

//Classe representando um livro
class Book {
 private int code;
 private String title;
 private int availableCopies;

 public Book(int code, String title, int availableCopies) {
     this.code = code;
     this.title = title;
     this.availableCopies = availableCopies;
 }

 public int getCode() {
     return code;
 }

 public String getTitle() {
     return title;
 }

 public int getAvailableCopies() {
     return availableCopies;
 }
 
 public void decreaseAvailableCopies() {
     if (availableCopies > 0) {
         availableCopies--;
     }
 }

 public void increaseAvailableCopies() {
     availableCopies++;
 }

 // Outros métodos e atributos necessários
}