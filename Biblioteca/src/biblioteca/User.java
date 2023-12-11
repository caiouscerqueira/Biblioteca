package biblioteca;

public class User implements Usuario {
    private String code;
    private String name;
    private UserType tipo;
    
    public User(String code, String name, UserType tipo) {
        this.code = code;
        this.name = name;
        this.tipo = tipo;
    }

    public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getCode() {
        return code;
    }

    @Override
	public String getName() {
        return name;
    }

	@Override
	public UserType getTipo() {
		return tipo;
	}

	@Override
	public void setTipo(UserType tipo) {
		this.tipo = tipo;
	}

    // Outros métodos e atributos necessários
	
	private Usuario createUser(String code, String name, UserType type) {
	     switch (type) {
	         case UNDERGRADUATE:
	             return new UndergraduateStudent(code, name, type);
	         case POSTGRADUATE:
	             return new PostgraduateStudent(code, name, type);
	         case PROFESSOR:
	             return new Professor(code, name, type);
	         default:
	             throw new IllegalArgumentException("Invalid user type");
	     }
	 }
	
	@Override
	public Usuario addUser(String code, String name, UserType type) {
	     Usuario user = createUser(code, name, type);
	     
	     return user;
	 }
	@Override
	public int getLoanDays(Usuario user) {
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

	@Override
	public int getLoanDays(User user) {
		// TODO Auto-generated method stub
		return 0;
	}
}
