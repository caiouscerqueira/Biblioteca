package biblioteca;

public interface Usuario {

	String getCode();

	String getName();

	UserType getTipo();

	void setTipo(UserType tipo);

	Usuario addUser(String code, String name, UserType type);

	int getLoanDays(User user);

	int getLoanDays(Usuario user);
	
	String consultarUser(String code);
}