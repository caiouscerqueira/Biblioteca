package biblioteca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
	     // Data atual (simulação)
	     LocalDate dataHoje = LocalDate.now();
	     LocalDate dataDevolucao = dataHoje.plusDays(loanDays); 
	     DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd LLLL yyyy");
	     String dataDevolucaoFormatada = "";
	     dataDevolucaoFormatada = dataDevolucao.format(formatter);
	 
	     return dataDevolucaoFormatada;
	 }
	 
	 public void loanBook(Usuario user,  Livro book) {
		 
		 if (user != null && book != null && book.getCopiasDisponiveis() > 0) {
	         
			 String returnDate = calculateReturnDate(user.getLoanDays(user));

	         Emprestimo loan = new Emprestimo(user, book, loanDays, returnDate);
	 
	         book.decreaseAvailableCopies();

	         System.out.println("Empréstimo realizado com sucesso para " + user.getName() +
	                 ". Livro: " + book.getTitle() + ". Data de devolução: " + returnDate);
	     } else {
	         System.out.println("Empréstimo não pode ser realizado. Verifique os dados do usuário e do livro.");
	     }
		
	 }
	  
}

