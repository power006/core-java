package com.corejava;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test3 {

	public static void main(String[] args) {
		List<String> names=new ArrayList();
		names.add("swamy");
		names.add("gangadhar");
		names.add("bandaru");
		names.add("sathibabu");
		names.add("taragalla");
		names.add("swamy");
		//names.stream().filter((String name) - > name.length()> 5).forEach(System.out::println);
		
        
//names.stream().filter((String name) -> name.length() > 5).forEach(System.out::println);

//names.stream().distinct().forEach(System.out::println);
		
		//names.stream().skip(2).forEach(System.out::println);
		
		//names.stream().limit(4).forEach(System.out::println);
		
		
		//names.stream().sorted().distinct().forEach(System.out::println);
		
		
	//	names.stream().forEach(System.out::println);
		List<String>  first3names=names.stream().limit(3).collect(Collectors.toList());
		System.out.println(first3names);

	      
	}
	
}
