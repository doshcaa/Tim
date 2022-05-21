package Food;
import java.util.Scanner;

public class sandwish extends food {
    
    String name;
    
    public sandwish(String n,int a,int p){
        super(p,a);
        name=n;
        
    }
    
    public void display(){
        System.out.println("Sandwich name::  " + name);
        System.out.println("Quantity:: " + amount);
        System.out.println("Price:: " + prise);
    }
    
    public void purchase(){
        int amt;
        Scanner scan = new Scanner(System.in);
        System.out.println("how many " + name + " would you like to buy:: ");
        amt = scan.nextInt();
        if(amt <= amount){
        System.out.println("That will be " + (prise*amt));
        amount = amount-amt;
        }else{
            System.out.println("We Do Not Have That Many Sandwhiches");
        }
    }
    
}
