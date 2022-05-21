
package Food;

import java.util.Scanner;


public class doughnut extends food {
    String type;
    
    public doughnut(String t,int a,int p){
        super(p,a);
        type=t;
    }
    
    public void display(){
        System.out.println("doughnut type::  " + type);
        System.out.println("Quantity:: " + amount);
        System.out.println("Price:: " + prise);
        
    }  
    public void purchase(){
        int amt;
        Scanner scan = new Scanner(System.in);
        System.out.println("how many " + type + " would you like to buy:: ");
        amt = scan.nextInt();
        System.out.println("That will be " + (prise*amt));
        amount = amount-amt;
    }
}
