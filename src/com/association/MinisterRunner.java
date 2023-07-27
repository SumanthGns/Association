package com.association;

public class MinisterRunner {

	public static void main(String[] args) {
		
		System.out.println("Running main in minister");
		Minister ref= new Minister();
		System.out.println(ref.name);
		System.out.println(ref.exp);
		System.out.println("Running main in Constituency");
		Constituency ref1=ref.a;
		System.out.println(ref1.no);
		System.out.println(ref1.population);
		System.out.println("Running main in IndiraCanteen");
		IndiraCanteen ref2=ref1.b;
		System.out.println(ref2.breakFastPrice);
		System.out.println(ref2.lunchPrice);
		
		

	}

}
