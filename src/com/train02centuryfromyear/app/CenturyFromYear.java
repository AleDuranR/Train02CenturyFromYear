package com.train02centuryfromyear.app;

public class CenturyFromYear {

	public static void main(String[] args) {
		/*
		 *      ================ C E N T U R Y ================
		 * Given a year, return the century it is in. The first century 
		 * spans from the year 1 up to and including the year 100, the 
		 * second - from the year 101 up to and including the year 200, 
		 * etc.
		 */
		int year = 2000;
		System.out.println(centuryFromYear(year));
		System.out.println(centuryFromYearSecond(year));
	}
	public static int centuryFromYear(int year) {
		int century = 0;
	    if(year >= 1 && year <= 2005){
	        for(int i=1; i<2005; i+=100){
	        	century ++;
	            if(year >= i && year <= i+99){ 
	                return century;           
	            } 
	        }
	    }
	    return 0;
	}
	public static int centuryFromYearSecond(int year) {
		return (int) ((year+99)/100);
	}
}
