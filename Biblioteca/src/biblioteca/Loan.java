package biblioteca;

//Classe representando um empréstimo
class Loan {
 private User user;
 private Book book;
 private int loanDays;
 private String returnDate;

 public Loan(User user, Book book, int loanDays, String returnDate) {
     this.user = user;
     this.book = book;
     this.loanDays = loanDays;
     this.returnDate = returnDate;
 }

 public User getUser() {
     return user;
 }

 public Book getBook() {
     return book;
 }

 public int getLoanDays() {
     return loanDays;
 }

 public String getReturnDate() {
     return returnDate;
 }
}

