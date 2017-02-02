/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project1;

import java.util.Scanner;

/**
 *
 * @author My Laptop
 */
public class Project1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a;
        int b;
        String operation;
        int answer;
        Scanner s=new Scanner(System.in);
        System.out.println("Welcome to my calculator! ");
        System.out.println("Enter the first number: ");
        a=s.nextInt();
        System.out.println("Enter the second number: ");
        b=s.nextInt();
        System.out.println("Enter operation: ");
        operation=s.next();
        if (operation.equals("+")){
            answer=add(a,b);
            System.out.println("Answer is: "+answer);
        }
        else{
            System.out.println("Unsupported operation");}
        
    
}
    private static int add(int a,int b){
            return a+b;
        }
}
