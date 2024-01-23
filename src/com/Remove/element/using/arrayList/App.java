package com.Remove.element.using.arrayList;

import java.util.ArrayList;
import java.util.List;

public class App {

	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		
		list.add("Asad");
		list.add("Bob");
		list.add("Bob");
		list.add("Player");
		list.add("Bob");
		list.add("Bob");
		
		int i=0;
		
		while(i<list.size()) {
			String str=list.get(i);
			if(str.charAt(1)=='o') {
				list.remove(i);
			}else {i++;}
		}
		
		for(String value:list) {
			System.out.println(value);
		}

	}

}
