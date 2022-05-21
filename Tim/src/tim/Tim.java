package tim;
import java.util.Scanner;
import Food.*;
import Drink.*;

public class Tim {

    
    public static void main(String[] args) {
        
        sandwish[] slist = new sandwish[1]; 
        doughnut[] dlist = new doughnut[1];
        coffee[] clist = new coffee[1];
        tea[] tlist = new tea[1];
        
        int numS=0, numD=0, numC=0, numT=0;
        
        String name, kind;
        int amount, prise;
                
        int Choice, select, option;
        Scanner scan= new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("1.Employee commands");
            System.out.println("2.Order drinks");
            System.out.println("3.Order foods");
            System.out.println("4.Done proccess");
            Choice= scan .nextInt();
            
            switch(Choice){
                case 3:
                    System.out.println("1.sandwish");
                    System.out.println("2.doughnut ");
                    select =scan.nextInt();
                    switch(select){
                        case 1:
                            for(int i=0; i<numS; i++){
                                System.out.println("========"+(i+1)+"========");
                                slist[i].display();
                            }
                            System.out.println("Which sandwich would you like to buy:: ");
                            option = scan.nextInt();
                            slist[option-1].purchase();
                            break;
                    
                        case 2:
                            for(int i=0;i<numD;i++){
                               System.out.println("========"+(i+1)+"========");
                                 dlist[i].display();
                                
                            }
                            System.out.println("Which doughnut would you like to buy:: ");
                            option = scan.nextInt();
                            dlist[option-1].purchase();
                            
                            break;  
                    }
                    break;
                case 2:
                   System.out.println("1.coffee");
                    System.out.println("2.tea ");
                    select =scan.nextInt();  
                    switch(select){
                        case 1:
                       for(int i=0; i<numC; i++){
                                System.out.println("========"+(i+1)+"========");
                                clist[i].display();
                            }
                            System.out.println("Which coffee would you like to buy:: ");
                            option = scan.nextInt();
                            clist[option-1].purchase();
                            break;
                    
                        case 2:
                            for(int i=0;i<numT;i++){
                               System.out.println("========"+(i+1)+"========");
                                 tlist[i].display();
                                
                            }
                            System.out.println("Which tea would you like to buy:: ");
                            option = scan.nextInt();
                            tlist[option-1].purchase();  
                            break;
                    }
                    
                    break;
                case 1:
                    System.out.println("1.To edit sandwich list./n");
                    System.out.println("2.To edit doughnut list./n");
                    System.out.println("3.To edit coffee list./n");
                    System.out.println("4.To edit tea list./n");
                    System.out.println("5.Display stock");
                    select = scan.nextInt();
                    switch(select){
                        case 1:
                            System.out.println("Enter the number of types of sandwich::");
                            numS = scan.nextInt();
                            slist = new sandwish[numS];
                            for(int i =0; i<numS; i++){
                                System.out.println("Enter name of sandwich::");
                                name = sc.nextLine();
                                System.out.println("Enter the amount of sandwich::");
                                amount=scan.nextInt();
                                System.out.println("Enter the price of sandwich::");
                                prise=scan.nextInt();
                                slist[i] = new sandwish(name, amount, prise);
                                
                            }
                            break;
                        case 2:
                            System.out.println("Enter the number of types of doughnut::");
                            numD=scan.nextInt();
                            dlist=new doughnut[numD];
                            for(int i=0;i<numD;i++){
                             System.out.println("Enter name of doughnut::");
                                name = sc.nextLine();
                                System.out.println("Enter the amount of doughnut::");
                                amount=scan.nextInt();
                                System.out.println("Enter the price of doughnut::");
                                prise=scan.nextInt();
                                dlist[i] = new doughnut(name, prise,amount);   
                            }
                            break;
                        case 3:
                            System.out.println("Enter the number of types of coffee::");
                            numC=scan.nextInt();
                            clist=new coffee[numC];
                            for(int i=0;i<numC;i++){
                                System.out.println("Enter type of coffee::");
                                name = sc.nextLine();
                                System.out.println("Enter the amount of cups of coffee::");
                                amount=scan.nextInt();
                                System.out.println("Enter the price of coffee::");
                                prise=scan.nextInt();
                                clist[i] = new coffee(name, prise,amount);
                            }
                                break;
                        case 4:
                                System.out.println("Enter the number of types of tea::");
                            numT=scan.nextInt();
                            tlist=new tea[numT];
                            for(int i=0;i<numT;i++){
                             System.out.println("Enter kind of ::");
                                kind = sc.nextLine();
                                System.out.println("Enter the amount of cups of tea::");
                                amount=scan.nextInt();
                                System.out.println("Enter the price of tea::");
                                prise=scan.nextInt();
                                tlist[i] = new tea(kind, amount, prise);
                            }
                                break;
                            
                        case 5:
                            for(int i = 0; i<numS ; i++){
                                slist[i].display();
                               
                            }
                            for(int i = 0; i<numD ; i++){
                                
                                dlist[i].display();
                                
                            }
                            for(int i = 0; i<numC ; i++){
                                
                                clist[i].display();
                                
                            }
                            for(int i = 0; i<numT ; i++){
                                
                                tlist[i].display();
                            }
                            break;
                  
                            
                    }
                    break; 
                case 4:
                    break;
                default:
                    System.out.println("Wrong input.");
                    break;
            }
        }while(Choice !=4);
        
        
        
        
        
        
        
        
        
    }
    
}
