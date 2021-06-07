package base;
import java.text.DecimalFormat;
import java.util.*;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Jose Valencia
 */

public class app {

    public static void main(String[] args) {
        Scanner newScan = new Scanner(System.in);
        DecimalFormat numFormat = new DecimalFormat("#.00");

        //Input
        System.out.print("What is the order amount? ");
        Double subtotal = Double.parseDouble(newScan.nextLine());

        System.out.print("What is the state? ");
        String state = newScan.nextLine();

        double taxRate = .055;

        //Calculations
        double total = subtotal;
        double tax = 0;

        if(state.equals("WI")){
            tax = subtotal * taxRate;
            total += tax;
        }

        //Output
        System.out.println("The subtotal is $" + subtotal + ".");
        System.out.println("The tax is $" + numFormat.format(tax) + ".");
        System.out.println("The total is $" + numFormat.format(total) + ".");


    }

}
