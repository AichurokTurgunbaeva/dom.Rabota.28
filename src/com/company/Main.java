package com.company;

public class Main {

    public static void main(String[] args) {
	UnaryOperator<Double> unaryOperator = (x) -> System.out.println(Math.sqrt(x));

    unaryOperator.method(64.0);
    
    }
}
