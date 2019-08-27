package dp.observer;

public class GrabStocks {
	public static void main(String[] args) {
		StockGrabber stockGrabber = new StockGrabber();

		StockObserver observer1 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(197.00);
		stockGrabber.setAAPLPrice(677.60);
		stockGrabber.setGOOGPrice(676.40);
		
		StockObserver observer2 = new StockObserver(stockGrabber);
		stockGrabber.setIBMPrice(131.90);
		stockGrabber.setAAPLPrice(204.50);
		stockGrabber.setGOOGPrice(1169.20);
		
		Runnable getIBM = new GetStock(stockGrabber, 2, "IBM", 197.00);
		Runnable getAAPL = new GetStock(stockGrabber, 2, "AAPL", 197.00);
		Runnable getGOOG = new GetStock(stockGrabber, 2, "GOOG", 197.00);
		
		new Thread(getIBM).start(); // Calls code from getIBM to run.
		new Thread(getAAPL).start(); // Calls code from getIBM to run.
		new Thread(getGOOG).start(); // Calls code from getIBM to run.
	}
}
