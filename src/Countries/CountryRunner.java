package Countries;

import java.awt.desktop.AboutEvent;

public class CountryRunner {

	public static void main(String[] args) {
		System.out.println("Invoking main in class Country");
		Country ref=new Country();
		System.out.println("name of the country:" +ref.name);
		System.out.println("country code:" +ref.code);
		System.out.println("Invoking main in President");
		President ref1=ref.a;
		
		System.out.println("name of the president:" +ref1.name);
		System.out.println("From state:" +ref1.stateFrom);
		System.out.println("Invoking main in securityHead");
		securityHead ref2=ref1.b;
		
		System.out.println("age:" +ref2.age);
		System.out.println("from:" +ref2.from);
		System.out.println("Invoking main in personalAssistance");
		personalAssistance ref3=ref2.c;
		
		System.out.println("duty on:" +ref3.checking);
		System.out.println("expected salary:" +ref3.salary);
		System.out.println("Invoking main in Homeminister");
		HomeMinister ref4=ref3.d;
		
		System.out.println("name of the homeMinister:" +ref4.name);
		System.out.println("call for an:" +ref4.helpLine);
		
		
		

	}

}
