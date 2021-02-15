package Streams;

import java.util.ArrayList;

import org.testng.annotations.Test;


public class Test1 {
	
	// Count the number of names starting with alphabet A in the list
	@Test
  public static void main(String args[])
  {
	  ArrayList<String> names = new ArrayList<String>();
	  names.add("Anil");
	  names.add("Badri");
	  names.add("Ansha");
	  names.add("Alekhya");
	  names.add("Ram");
	  int count = 0;
	  for(int i = 0; i<names.size();i++)
	  {
		  String actual = names.get(i);
		  if(actual.startsWith("A"))
			  count++;
	  }
	  System.out.println(count);
  }
}
