package com.randomstrings;

import java.util.Random;

public class GenerateStrings {

	final String alpha="ABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
	final Random rand= new Random();

	public String myUID() {
	    int i = 8;
	    String uid="";
	    while (i-- > 0) {
	        uid+=alpha.charAt(rand.nextInt(26));
	    }
	    System.out.println(uid);
	    return uid;
	}

}
