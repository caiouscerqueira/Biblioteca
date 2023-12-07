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
 
 public String calculateReturnDate(int loanDays) {
     // Lógica para calcular a data de devolução com base nos dias de empréstimo
     // (Implementação simplificada)
     // Aqui você pode usar bibliotecas de manipulação de datas para uma implementação mais robusta.

     // Data atual (simulação)
     String currentDate = "01/01/2023";
     
     // Lógica para calcular a data de devolução (adicionando dias ao atual)
     // (Implementação simplificada)
     
     
     // Aqui você pode usar bibliotecas de manipulação de datas para uma implementação mais robusta.

     return currentDate;
 }
  
}

