/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package consolecalc;

import java.util.Scanner;

public class Consolecalc {

    public static void main(String[] args) {
        Scanner read =  new Scanner(System.in);
        System.out.println("Enter your first number: ");
        double num1 = read.nextDouble();
        System.out.println("Enter your second number: ");
        double num2 = read.nextDouble();
        System.out.println("1). +");
        System.out.println("2). -");
        System.out.println("3). x");
        System.out.println("4). /");
        System.out.println("choose an operator: ");
        int operator = read.nextInt();
        switch(operator){
            case 1:
                System.out.println(num1+num2);
                break;
            case 2:
                System.out.println(num1-num2);
                break;
            case 3:
                System.out.println(num1*num2);
                break;
            case 4:
                System.out.println(num1+num2);
                break;
            default:
                System.out.println("operator not found");
                break;
        }
        
        
    }
    
}
