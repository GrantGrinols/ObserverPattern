/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package stockmarket;

/**
 *
 * @author Grant
 */
public interface Observer {
    public void update( double ibmPrice, double aaplPrice, double googPrice,double riskyPrice, double safePrice);//the 'middle' man that passes the price arguments
}
