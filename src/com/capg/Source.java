package com.capg;
public class Source {
     public static void main(String[] args) {
    	 ICalculator obj =new ICalculator() {
    		 public void addition() {
    			System.out.println(4+5);
    		 }
    		 
    	 };
    	 obj.addition();
    	 
     }
}
