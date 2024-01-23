package com.stringToInt;

public class App {
	
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    

    public static String encrypt(String plainText, int shiftKey)

    {

        plainText = plainText.toLowerCase();

        String cipherText = "";

        for (int i = 0; i < plainText.length(); i++)

        {

            int charPosition = ALPHABET.indexOf(plainText.charAt(i));

            int keyVal = (charPosition - shiftKey ) % 26;

            char replaceVal = ALPHABET.charAt(keyVal);

            cipherText += replaceVal;

        }

        return cipherText;

    }

	public static void main(String[] args) {
		
		String message="love";
		int key=4;
		System.out.println(encrypt(message, key));
		String cipherttext="";
		String str="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String text="love";
		text=text.toUpperCase();
		int shiftkey=4;
		for(int i=0;i<text.length();i++) {
		int charposition = str.indexOf(text.charAt(i));
		int keyval=(charposition-shiftkey)%26;
		char replaceval=str.charAt(keyval);
		cipherttext+=replaceval;
		}
		System.out.println(cipherttext);
		 

	
	}

}
