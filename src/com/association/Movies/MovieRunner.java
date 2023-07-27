package com.association.Movies;

public class MovieRunner {

	public static void main(String[] args) {
	 System.out.println("Invoking main in movie");
	 Movie ref = new Movie();
	 System.out.println("name of the movie:" +ref.name);
	 System.out.println("prefered movielanguage:" +ref.language);
	 System.out.println("Invoking main in producer");
	 Producer ref1=ref.a;
	 System.out.println("movie budget:" +ref1.budget);
	 System.out.println("no. of the producer:" +ref1.mobileNo);
	 System.out.println("Invoking main in Auditor");
	 Auditor ref2= ref1.b;
	 System.out.println("adhar number:" +ref2.adharNo);
	 System.out.println("Invoking main in Company");
	 Company ref3=ref2.c;
	 System.out.println("Company name as:" +ref3.name);
	 System.out.println("company located in:" +ref3.location);
	 
	 
	 

	}

}
