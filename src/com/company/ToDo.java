package com.company;

import java.util.ArrayList;


public class ToDo {
    private ArrayList<String> arr ;

    public ToDo(){
        this.arr = new ArrayList<>();
    }

    public void addc(String a ){
        this.arr.add(a);
    }
    public void removee(int i){
        this.arr.remove(i-1);
    }
    public void printAll(){
        for(String a: arr){
            System.out.println(a);
        }
    }

}
