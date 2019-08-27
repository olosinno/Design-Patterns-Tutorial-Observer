package dp.observer;

public interface Subject {
	public void register(Observer o);
	public void deregister(Observer o);
	public void notifyObserver();
}
