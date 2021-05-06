package day5;

import java.util.ArrayList;

public class ArrayDemo {

	public static void main(String[] args) {
		int []marks =new int[3];
		 marks[0]=12;
		 marks[1]=19;
		 marks[2]=18;
		 
		System.out.println(marks[2]);
		
		
		
		
		String name[] =  {"cheena","megha","raghav"};
		System.out.println(name[1]);
		
		
		int marks1[] = {25,45,67,89};
		System.out.println(marks1[2]);
		
		
		
		
		for ( int i : marks1) {
			System.out.println(i);
			
			
		}
		
		
		for(String s:name)
		{
			System.out.println(s);
			
		}
		
		
		ArrayList<Object>ob2 = new ArrayList<>();

		ob2.add("Aarav");
		ob2.add("10");
		ob2.add("Fortnight");
		ob2.add("89");
		
	}

	
	
	
	
}
