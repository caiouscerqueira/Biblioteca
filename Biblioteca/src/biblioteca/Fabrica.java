package biblioteca;

public class Fabrica {
	public static Livro criarLivro() {
		return new Livro();
	}
	public static Usuario criarUsuario() {
		return new User( );
	}
	
	public static Emprestimo criarEmprestimo() {
		return new Emprestimo();
	}
	public static Reserva criarReserva() {
		return new Reserva();
		
	}
}
