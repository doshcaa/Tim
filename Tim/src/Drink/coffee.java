
package Drink;

import java.util.Scanner;


public class coffee extends drink{
    String name;
    
    public coffee(String y,int z,int m){
        super(z,m);
        name=y;
        
    }
    
    public void display(){
        System.out.println("coffee name::  " + name);
        System.out.println("Quantity:: " + amount);
        System.out.println("Price:: " + prise);
    
    } 
    
    public void purchase(){
        int amt;
        Scanner scan = new Scanner(System.in);
        System.out.println("how many " + name + " would you like to buy:: ");
        amt = scan.nextInt();
        System.out.println("That will be " + (prise*amt));
        amount = amount-amt;
    }
}
