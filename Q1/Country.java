package Q1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Country {
	HashMap<String,String>map=new HashMap<String,String>();

	public Country() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void saveCountryCapital(String countryName,String countryCapital)
	{
		map.put(countryName, countryCapital);
	}
	public Map<String,String> getmap()
	{
		return map;
	}
	
	
	
	public String getCapital(String countryName) {
		Set<Entry<String,String>>set1=map.entrySet();
		Iterator<Entry<String,String>> itr=set1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> k=itr.next();
			if(k.getKey().equals(countryName)) 
			{
			    return k.getValue()+ " is found";
			}
		}
		return countryName +" is not found";
		}
	
	public String getCountry(String countryCapital)
	{
		Set<Entry<String,String>>set1=map.entrySet();
		Iterator<Entry<String,String>> itr=set1.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String,String> k=itr.next();
			if(k.getValue().equals(countryCapital)) 
			{
			    return k.getKey()+ " is found";
			}
		}
		return countryCapital +" is not found";
	}
	HashMap<String,String> M2=new HashMap<>();
	  void KeyValueReverse() {
		  Set<Entry<String,String>> set=map.entrySet();
		  Iterator<Entry<String,String>> itr=set.iterator();
		  while(itr.hasNext())
		  {
			  Map.Entry<String, String> k=itr.next();
			  M2.put(k.getValue(), k.getKey());
		  }
		  displayM2();
	  }
	  void displayM2() {
			Set<Entry<String,String>>set=M2.entrySet();
			Iterator<Entry<String,String>> itr1=set.iterator();
			while(itr1.hasNext())
			{
				Map.Entry<String,String>k=itr1.next();
				System.out.println(k.getKey()+ " "+k.getValue());
			}
	  }
	  void dis() {
			Set<Entry<String,String>>set=map.entrySet();
			Iterator<Entry<String,String>> itr1=set.iterator();
			while(itr1.hasNext())
			{
				Map.Entry<String,String>k=itr1.next();
				System.out.println(k.getKey()+ " "+k.getValue());
			}
		}
	  ArrayList<String>cname=new ArrayList<>();
	  ArrayList<String> AddCountry(){
	 	 Set<Entry<String,String>>set=map.entrySet();
	 	 Iterator<Entry<String,String>> itr=set.iterator();
	 	 while(itr.hasNext())
	 	 {
	 		 Map.Entry<String, String>m=itr.next();
	 		 cname.add(m.getKey());
	 	 }
	 	 return cname;
	  }
}
	