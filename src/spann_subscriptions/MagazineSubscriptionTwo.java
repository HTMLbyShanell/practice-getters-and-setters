/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_subscriptions;

/**
 * @author Shanell A. Spann
 * Logic & Problem Solving
 * ITDEV117 - Due 11/11/19
 */
public class MagazineSubscriptionTwo 
{
    private String subscriberName;
    private String magazineName;
    private int monthsRemaining;
    
    public void setSubscriberName(String Name)
    {
       this.subscriberName = Name;
    }
    
    public String getSubscriberName()
    {
        return subscriberName;
    }
    
    public void setMagazineName(String magName)
    {
       this.magazineName = magName;
    }
    
    public String getMagazineName()
    {
        return magazineName;
    }
    
    public void setMonthsRemaining(int months)
    {
       this.monthsRemaining = months;
    }
    
    public int getMonthsRemaining()
    {
        return monthsRemaining;
    }   
    
}
