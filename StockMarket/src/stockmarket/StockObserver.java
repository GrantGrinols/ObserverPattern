/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockmarket;

/**
 *
 * @author Grant
 */
public class StockObserver implements Observer{
private double ibmPrice;
   private double aaplPrice;
   private double googPrice;
    private double riskyPrice;
   private double safePrice;
   private static int observertracker = 0;
   private int observerID;
   private Subject stockGrabber;
   public StockObserver(Subject stockGrabber){
       this.stockGrabber = stockGrabber;
       this.observerID = ++observertracker;
       System.out.println("New Observer: "+this.observerID);
       stockGrabber.register(this);
   }
    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice,double riskyPrice, double safePrice) {
        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;//this updates each of the prices. Because we are setting the prices one at a time at the grabstock class, this update function always affect one output at a time
        this.googPrice = googPrice;
         this.riskyPrice = riskyPrice;
         this.safePrice = safePrice;
        printthePrice();
    }
    public void printthePrice(){
        System.out.println(observerID+"\nIBM: "+ibmPrice + "\nAAPL: "+ aaplPrice+"\nGOOG:"+googPrice+"\n"+"AMZN:"+riskyPrice+"\nTWTR: "+ safePrice+"\n");//prints the results
    }
}
