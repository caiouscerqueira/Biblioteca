package biblioteca;

public class Reserva {
	private Livro livro;
	private Usuario user;
	public Reserva(Livro livro2) {
		// TODO Auto-generated constructor stub
	}
	
	public Reserva() {
		// TODO Auto-generated constructor stub
	}
	
	public Livro getLivro() {
		return livro;
	}
	public void setLivro(Livro livro) {
		this.livro = livro;
	}
	public Usuario getUser() {
		return user;
	}
	public void setUser(Usuario user) {
		this.user = user;
	}
	
	public Reserva consultarReserva(Livro livro) {
		livro = getLivro();
		Reserva res = new Reserva(livro);
		
		return null;
	}
}
