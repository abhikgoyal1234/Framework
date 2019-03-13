package com.learnautomation.com.learnautomation.selenium;

	class ChangeIt{
		static void doIt(int[] z) {
			int [] a = z; 
			a[0]  = 99;
			
		}
	}



public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "Divya";
		String s1 = "Divya";
		
		
		String a = "meow";
		String ab = a+"deal";
		String abc = "meowdeal";
		
		System.out.println(ab);
		System.out.println(abc);
		System.out.println(ab==abc);
		
		int myArray[] = {1,2,3,4,5};
		
		ChangeIt.doIt(myArray);
		
		for(int i =0 ; i<myArray.length ; i++ ) {
			System.out.println(myArray[i]	);
		}
		System.out.println(s==s1	);
	}

}
