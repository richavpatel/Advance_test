package stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class stream {


	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,6,6);
		System.out.println("List of integer" +list);
		
		//inside map logic of multiply by 3 then print each element
		System.out.println("Multiply by 3:");
	    list.stream()
	        .map(i -> i * 3)
	        .forEach(System.out::println);;
	     
	    
	    System.out.println("Using reduce method will get sum:");
		System.out.println(list.stream()
				                .map(i -> i *3)
				                .reduce(0, Integer:: sum));
		
		System.out.println("Using Filter Method we get only 5 no of sum:");
		
		System.out.println(list.stream()
				               .filter(i -> i % 5 ==0)
				               .reduce(0, Integer:: sum));
		
		// Using Predict 
        Predicate<Integer> p = new Predicate<Integer>() {
           @Override
			public boolean test(Integer t) {
				// TODO Auto-generated method stub
				return t % 5 == 0;}	 };
          System.out.println(list.stream()
	                              .filter(p)
	                              .reduce(0, Integer:: sum));
          
          //stream, filter, map , reduce
          
          System.out.println("USing Map ans will be double: "+list.stream()
	                                                               .filter(i -> i % 5 ==0)
	                                                               .map(i -> i * 2)
	                                                               .reduce(0, Integer:: sum));
          
          System.out.println("OrElse Method:"+ list.stream()
	               .filter(i -> i % 5 ==0)
	               .findFirst()
	               .orElse(0));
          
          
        
        
        
		List<String> s= Arrays.asList("Richa","Vivek","Patel");
		System.out.println("List of String:" +s);
		// using map method to lowercase then print all list od String
	    s.stream().map(ghj -> ghj.toLowerCase()).forEach(System.out::println);
	}

}
