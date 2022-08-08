package Q1;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
public static void main(String[] args) {
	Country c= new Country();
//	 insertion
	
	c.saveCountryCapital("India","Delhi");
	c.saveCountryCapital("Japan","Tokyo");
	
//	for printing All Details of above
	c.dis();
	
// 	for finding Capitals
	System.out.println("***************************************");
	System.out.println("Find the Capital");
	System.out.println(c.getCapital("India"));
	System.out.println(c.getCapital("Britian"));
//	for finding Country
	System.out.println("***************************************");
	System.out.println("Find the Country ");
	System.out.println(c.getCountry("Tokyo"));
	System.out.println(c.getCountry("Britian"));
	
//	 for converting MAp to another Map Using Value  and Key;
	System.out.println("***************************************");
	System.out.println();
	System.out.println("After Converting into Key to value and avalue to Key");
	System.out.println("***************************************");
	c.KeyValueReverse();
// for Printing ArrayList
	System.out.println();
	ArrayList<String>st=c.AddCountry();
	
	System.out.println("Printing ArrayList");
	System.out.println("***************************************");
	Iterator itr=st.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	
}
}
