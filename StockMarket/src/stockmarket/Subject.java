/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stockmarket;

import stockmarket.Observer;

/**
 *
 * @author Grant
 */
public interface Subject {
    public void register(Observer o);//the options that an observer can do
    public void unregister(Observer o);
    public void notifyObserver();
}
