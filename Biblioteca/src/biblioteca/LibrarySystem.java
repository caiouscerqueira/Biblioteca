package biblioteca;

import java.util.*;

//Classe principal que gerencia o sistema da biblioteca
public class LibrarySystem {
 private Map<Integer, Livro> books = new HashMap<>();
 private Map<Integer, Usuario> users = new HashMap<>();
 private List<Emprestimo> loans = new ArrayList<>();
 private List<Reserva> reservations = new ArrayList<>();
 private Map<Integer, List<Observar>> bookObservers = new HashMap<>();

 // Métodos para adicionar livro e usuário
 
  
 public void addBook(int code, String title, int availableCopies) {
	 Livro book = Fabrica.criarLivro().addBook(code, title, availableCopies);
     books.put(code, book);
     bookObservers.put(code, new ArrayList<>());
 }

 public void addUser(int code, String name, UserType type) {
    Usuario user = Fabrica.criarUsuario().addUser(code, name, type);
     users.put(code, user);
 }
 
 public void loanBook(int userCode, int bookCode) {
     Usuario user = users.get(userCode);
     Livro book = books.get(bookCode);

     if (user != null && book != null && book.getCopiasDisponiveis() > 0) {
         int loanDays = getLoanDays(user);

         String returnDate = calculateReturnDate(loanDays);

         Emprestimo loan = new Emprestimo(user, book, loanDays, returnDate);
         loans.add(loan);

         book.decreaseAvailableCopies();

         System.out.println("Empréstimo realizado com sucesso para " + user.getName() +
                 ". Livro: " + book.getTitle() + ". Data de devolução: " + returnDate);
     } else {
         System.out.println("Empréstimo não pode ser realizado. Verifique os dados do usuário e do livro.");
     }
 }
 
 public void returnBook(int userCode, int bookCode) {
     Usuario user = users.get(userCode);
     Livro book = books.get(bookCode);

     if (user != null && book != null) {
         Emprestimo loan = findLoan(user, book);

         if (loan != null) {
             loans.remove(loan);
             book.increaseAvailableCopies();

             System.out.println("Devolução realizada com sucesso por " + user.getName() +
                     ". Livro: " + book.getTitle());
         } else {
             System.out.println("Devolução não pode ser realizada. Livro não foi emprestado para este usuário.");
         }
     } else {
         System.out.println("Devolução não pode ser realizada. Verifique os dados do usuário e do livro.");
     }
 }
 
 private int getLoanDays(Usuario user) {
     // Definir os dias de empréstimo com base no tipo de usuário
     if (user != null) {
         if (user instanceof UndergraduateStudent) {
             return 3;
         } else if (user instanceof PostgraduateStudent) {
             return 4;
         } else if (user instanceof Professor) {
             return 7;
         }
     }
     return 0;
 }
 
 private String calculateReturnDate(int loanDays) {
     // Lógica para calcular a data de devolução com base nos dias de empréstimo
     
	 String retornoEmprestimo = Fabrica.criarEmprestimo().calculateReturnDate(loanDays);
	 	 
     return retornoEmprestimo;
 }
 
 private Emprestimo findLoan(Usuario user, Livro book) {
     // Procura se há um empréstimo ativo para o usuário e livro específicos
     for (Emprestimo loan : loans) {
         if (loan.getUser().equals(user) && loan.getBook().equals(book)) {
             return loan;
         }
     }
     return null;
 }

 

 // Método principal para processar comandos
 public void processCommand(String command) {
     String[] parts = command.split(" ");
     String action = parts[0];

     switch (action) {
         case "emp":
             processLoan(parts);
             break;
         case "dev":
             processReturn(parts);
             break;
         case "res":
             processReservation(parts);
             break;
         case "obs":
             processObserver(parts);
             break;
         case "liv":
             processBookInfo(parts);
             break;
         case "usu":
             processUserInfo(parts);
             break;
         case "ntf":
             processNotificationCount(parts);
             break;
         case "sai":
             System.out.println("Saindo do sistema.");
             System.exit(0);
             break;
         default:
             System.out.println("Comando inválido.");
     }
 }

 // Métodos para processar comandos específicos
 private void processLoan(String[] parts) {
     // Implementar lógica para processar empréstimo
     // ...
 }

 private void processReturn(String[] parts) {
     // Implementar lógica para processar devolução
     // ...
 }

 private void processReservation(String[] parts) {
     // Implementar lógica para processar reserva
     // ...
 }

 private void processObserver(String[] parts) {
     // Implementar lógica para registrar observador
     // ...
 }

 private void processBookInfo(String[] parts) {
     // Implementar lógica para obter informações do livro
     // ...
 }

 private void processUserInfo(String[] parts) {
     // Implementar lógica para obter informações do usuário
     // ...
 }

 private void processNotificationCount(String[] parts) {
     // Implementar lógica para obter contagem de notificações
     // ...
 }

 // Método principal (main) para demonstração do sistema
 public static void main(String[] args) {
	 // Exemplo de uso do sistema
	 LibrarySystem librarySystem = new LibrarySystem();
	 
	 // Adiciona livros
     librarySystem.addBook(1, "Introduction to Java", 5);
     librarySystem.addBook(2, "Data Structures and Algorithms", 3);
     
     // Adiciona usuários
     librarySystem.addUser(101, "John Doe", UserType.UNDERGRADUATE);
     librarySystem.addUser(102, "Jane Smith", UserType.POSTGRADUATE);
     librarySystem.addUser(201, "Professor Johnson", UserType.PROFESSOR);

     // Simulação de comandos (substitua com entrada real do usuário)
     
     // Realiza empréstimos
     librarySystem.loanBook(101, 1);
     librarySystem.loanBook(102, 2);
     librarySystem.loanBook(201, 1);

     // Tenta realizar um empréstimo inválido
     librarySystem.loanBook(101, 2);

     // Realiza devoluções
     librarySystem.returnBook(101, 1);
     librarySystem.returnBook(102, 2);
     librarySystem.returnBook(201, 1);

     // Tenta realizar uma devolução inválida
     librarySystem.returnBook(101, 1);
     
     librarySystem.processCommand("emp 101 1");
     librarySystem.processCommand("emp 102 2");
     librarySystem.processCommand("emp 201 1");
     
     librarySystem.processCommand("res 101 2");

     librarySystem.processCommand("liv 1");

     librarySystem.processCommand("usu 101");

     librarySystem.processCommand("ntf 201");

     librarySystem.processCommand("sai");
 }
}
