package biblioteca;

//Classe representando um empréstimo
class Emprestimo {
 private Usuario user;
 private Livro book;
 private int loanDays;
 private String returnDate;

 public Emprestimo(Usuario user, Livro book, int loanDays, String returnDate) {
     this.user = user;
     this.book = book;
     this.loanDays = loanDays;
     this.returnDate = returnDate;
 }

 public Emprestimo() {
	// TODO Auto-generated constructor stub
}

public Usuario getUser() {
     return user;
 }

 public Livro getBook() {
     return book;
 }

 public int getLoanDays() {
     return loanDays;
 }

 public String getReturnDate() {
     return returnDate;
 }
}

