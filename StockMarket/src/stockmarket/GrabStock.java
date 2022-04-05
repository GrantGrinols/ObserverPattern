/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stockmarket;

/**
 *
 * @author Grant
 */
public class GrabStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       StockGrabber stockGrabber = new StockGrabber();
       StockObserver observer1 = new StockObserver(stockGrabber);//the screen updates each time the stockGrabber sets
       stockGrabber.setIBMPrice(197.00);
       stockGrabber.setaaplPrice(500.00);
       stockGrabber.setgoogPrice(612.00);
       stockGrabber.setRiskyPrice(222.00);
       stockGrabber.setSafePrice(513.34);
       StockObserver observer2 = new StockObserver(stockGrabber);//we can have more than one observer to look at the prices
       stockGrabber.unregister(observer1);
        stockGrabber.setIBMPrice(200.00);
       stockGrabber.setaaplPrice(421.13);
       stockGrabber.setgoogPrice(640.67);
       
       Runnable getIBM = new GetTheStock(stockGrabber,2,"IBM");//this parts gets the stock of 5 different companies in real time
       Runnable getAAPL = new GetTheStock(stockGrabber,2,"AAPL");
       Runnable getGOOG = new GetTheStock(stockGrabber,2,"GOOG");
       Runnable getGOOD = new GetTheStock(stockGrabber,2,"TWTR");
       Runnable getBAD = new GetTheStock(stockGrabber,2,"AMZN");
       
       new Thread(getIBM).start();
       new Thread(getAAPL).start();
       new Thread(getGOOG).start();
       new Thread(getGOOD).start();
       new Thread(getBAD).start();
       
    }
    
}
