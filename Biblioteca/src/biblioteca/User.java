package biblioteca;

class User implements Usuario {
    private int code;
    private String name;
    private UserType tipo;
    
    public User(int code, String name, UserType tipo) {
        this.code = code;
        this.name = name;
        this.tipo = tipo;
    }

    public User() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getCode() {
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
	
	private Usuario createUser(int code, String name, UserType type) {
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
	public Usuario addUser(int code, String name, UserType type) {
	     Usuario user = createUser(code, name, type);
	     
	     return user;
	 }
}
