/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spann_subscriptions;

/**
 * @author Shanell A. Spann
 * Logic & Problem Solving
 * Assignment # 8 EXTRA CREDIT
 * ITDEV117 - Due 11/11/19
 */
public class Spann_Subscriptions {

    /**
     * @param args the command line arguments
     */
    static String magName;
    static String Name;
    static int months;
    
    
    public static void main(String[] args) throws InterruptedException {
        
        MagazineSubscriptionOne m1 = new MagazineSubscriptionOne();
        MagazineSubscriptionTwo m2 = new MagazineSubscriptionTwo();
        
        m1.setSubscriberName("Beyonce Knowles");
        m1.setMagazineName("Vogue");
        m1.setMonthsRemaining(6);
        
        m2.setSubscriberName("Oprah Winfrey");
        m2.setMagazineName("Life & Style");
        m2.setMonthsRemaining(10);
        
        System.out.print("Below are the details for MAGAZINE #1: ");
        System.out.println("\t\t\tBelow are the details for MAGAZINE #2: ");
        Thread.sleep(2500);
        System.out.print("\tSubscriber Name: " + m1.getSubscriberName());
        System.out.println("\t\t\tSubscriber Name: " + m2.getSubscriberName());
        System.out.print("\tMagazine Name: " + m1.getMagazineName());
        System.out.println("\t\t\t\t\tMagazine Name: " + m2.getMagazineName());
        System.out.print("\tMonths remaining: " + m1.getMonthsRemaining());
        System.out.println("\t\t\t\t\tMonths remaining: " + m2.getMonthsRemaining());   
        
    }  
}
