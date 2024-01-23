package com.gettersandsetters;

import java.util.ArrayList;
import java.util.List;

public class StoreSessionList {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Umer");
		list.add("Asad");
		list.add("Salman");
		list.add("Zubair");
		list.add("Jawad");
		
		List<String> list2=new ArrayList<>();
		
		list2.addAll(list);
		
		System.out.println(list2);

	}

}
