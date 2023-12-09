package biblioteca;

public interface Observer {
	public void update(LivrosObservados livro);
}
=========================================
  
  
public interface Subject {
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}

================================================

public class LivrosObservados implements Subject {
	private ArrayList<Observer> observers;
	
	
public LivrosObservados() {
		observers = new ArrayList<Observer>();
	}
	
	public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		int i = observers.indexOf(o);
		if (i >= 0) {
			observers.remove(i);
		}
	}
	
	public void notifyObservers() {
		for (int i = 0; i < observers.size(); i++) {
			Observer observer = observers.get(i);
			observer.update(this);
		}
	}
	
===================================================

  
public class ProfessoresObservadores implements Observer
 {

   
	public void update(LivrosObservados livros) {
	
	}
}
