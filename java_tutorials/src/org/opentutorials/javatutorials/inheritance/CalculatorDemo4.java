package org.opentutorials.javatutorials.inheritance;
class Calculator {
    int left, right;
 
    public void setOprands(int left, int right) {
        this.left = left;
        this.right = right;
    }
 
    public void sum() {
        System.out.println(this.left + this.right);
    }
 
    public void avg() {
        System.out.println((this.left + this.right) / 2);
    }
}
 
class SubstractionableCalculator extends Calculator {
    public void substract() {
        System.out.println(this.left - this.right);
    }
}

public class CalculatorDemo4 {
	public static void main(String[] args) {
		System.out.println("CalculatorDemo4 Start!");
		SubstractionableCalculator c1 = new SubstractionableCalculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();
        c1.substract();
        System.out.println("CalculatorDemo4 END!");
        System.out.println("CalculatorDemo4 END!!");
    }
}
