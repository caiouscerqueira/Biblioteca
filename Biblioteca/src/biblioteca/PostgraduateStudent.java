package biblioteca;

class PostgraduateStudent extends User {
	
	private final static int DIAS_EMPRESTIMO = 4;
	
    public PostgraduateStudent(String code, String name, UserType tipo) {
        super(code, name, tipo);
    }
}
