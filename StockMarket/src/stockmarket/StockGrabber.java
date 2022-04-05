/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stockmarket;


import java.util.ArrayList;


/**
 *
 * @author Grant
 */
public class StockGrabber implements Subject{
    
   private ArrayList<Observer> observers;
   private double ibmPrice;
   private double aaplPrice;
   private double googPrice;
   private double riskyPrice;
   private double safePrice;
   public StockGrabber(){
       observers = new ArrayList<Observer>();//adds up all the observers we have
   }
    
   
   @Override
    public void register(Observer newO){
        observers.add(newO);
    }
   @Override
    public void unregister(Observer oldO){
        int Index = observers.indexOf(oldO);
        System.out.println("Observer "+(Index+1)+" deleted");
        observers.remove(Index);
    }
   @Override
    public void notifyObserver(){
        for(Observer observer: observers){//this is the function that tells the observer that a change has happened and we should update that. This gets called whenever a price is set
            observer.update(ibmPrice, aaplPrice, googPrice,riskyPrice,safePrice);
        }
    }
    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();
    }
    public void setaaplPrice(double newaaplPrice){
        this.aaplPrice = newaaplPrice;
        notifyObserver();
    }
    public void setgoogPrice(double newgoogPrice){
        this.googPrice = newgoogPrice;
        notifyObserver();
    }
     public void setRiskyPrice(double riskyPrice){
        this.riskyPrice = riskyPrice;
        notifyObserver();
    }
     public void setSafePrice(double safePrice){
        this.safePrice = safePrice;
        notifyObserver();
    }

    
    
}
