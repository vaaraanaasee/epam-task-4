package com.code.SimpleandCompoundInterest;

public class SimpleandCompoundInterest {
	// Simple Interest

		public double simpleInterest(double principal,double rate,double time) {

			return (principal*rate*time)/100;

		}

		

		// Compound Interest

		public double compoundInterest(double principal,double rate,double time) {

			return principal*(Math.pow(1+rate/100, time)-1);

		}
}
