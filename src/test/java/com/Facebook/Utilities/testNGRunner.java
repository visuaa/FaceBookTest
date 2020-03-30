package com.Facebook.Utilities;
import java.util.*;

import org.testng.TestNG;

public class testNGRunner 
{
	public static void main(String Args[])
	{
	TestNG objNG=new TestNG();
	
	 List<String> suites = new ArrayList<String>();
	 
	 
		 suites.add("F:\\Assignment\\Testing\\testng2.xml");
		 
		 suites.add("F:\\Assignment\\Testing\\testng1.xml");
		 
	     objNG.setTestSuites(suites);
	     
	     objNG.run();
	
	

}
}
