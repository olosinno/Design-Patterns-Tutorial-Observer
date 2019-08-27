package dp.observer;

import java.util.ArrayList;

public class StockGrabber implements Subject {

	private ArrayList<Observer> observers;
	private double ibmPrice;
	private double aaplPrice;
	private double googPrice;
	
	public StockGrabber() {
		observers = new ArrayList<Observer>();
	}
	@Override
	public void register(Observer newObserver) {
		observers.add(newObserver); 
	}

	@Override
	public void deregister(Observer deleteObserver) {
		int observerIndex = observers.indexOf(deleteObserver);
		observers.remove(observerIndex);
		System.out.println("Observer " + (observerIndex + 1) + "deleted.");
		
	}

	@Override
	public void notifyObserver() {
		for (Observer observer: observers) {
			observer.update(ibmPrice, aaplPrice, googPrice);
		}
	}
	public void setIBMPrice(double newIBMPrice) {
		this.ibmPrice = newIBMPrice;
		notifyObserver();
	}
	public void setAAPLPrice(double newAAPLPrice) {
		this.aaplPrice = newAAPLPrice;
		notifyObserver();
	}
	public void setGOOGPrice(double newGOOGPrice) {
		this.googPrice = newGOOGPrice;
		notifyObserver();
	}
	
}
