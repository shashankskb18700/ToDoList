package com.company;

import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static  ToDo li = new ToDo();
    public static void main(String[] args) {


        while(true){
            System.out.print("Command: ");
            String a   = scan.nextLine();
            if(a.equals("stop")){
                break;
            }
            switch (a){
                case "add":
                    System.out.println("Task: ");
                    String ac = scan.nextLine();
                    addo(ac);
                    break;

                case "list":
                    listo();
                    break;
                case "completed":
                    System.out.print("Which task was completed: ");
                    int ag = scan.nextInt();
                    complete(ag);
                    break;

                default:System.out.println("enter add, complete, or stop");

            }

        }

    }

    public static void addo(String a){
        li.addc(a);
    }
    public static void listo(){
        li.printAll();
    }
    public static void complete(int a){
        li.removee(a);
    }
}
