
package Drink;

import java.util.Scanner;


public class tea extends drink {
    String kind;
    
    public tea(String c,int z,int m){
        super(z,m);
        kind=c;
    }
    
    public void display(){
        System.out.println("tea kind::  " + kind);
        System.out.println("Quantity:: " + amount);
        System.out.println("Price:: " + prise);
    
    }
    
    public void purchase(){
        int amt;
        Scanner scan = new Scanner(System.in);
        System.out.println("how many " + kind + " would you like to buy:: ");
        amt = scan.nextInt();
        System.out.println("That will be " + (prise*amt));
        amount = amount-amt;
    }
}
