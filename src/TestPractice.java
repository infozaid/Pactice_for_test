import java.util.LinkedHashSet;
import java.util.Set;

public class TestPractice {

	public static void main(String[] args) {
		String prt="aaabbbcccdddeeefffggghhoookklll";
		
		char [] ch=prt.toCharArray();
		
		Set<Character> charset=new LinkedHashSet<>();
		
		for(char c:ch) {
			charset.add(c);
		}
		
		StringBuilder sb =new StringBuilder();
		
		for(Character charc:charset) {
			sb.append(charc);
		}
		System.out.println(sb.toString());
		
		System.out.println("______NEW PROGRAM______");
		
		int arr[] = {1,2,3,4,5,6,7,8,9,10};
		int tot=arr.length;
		for(int i=0;i<arr.length;i++)
		{
			tot+=i;
		}
		System.out.println(arr.length);
		System.out.println("Here is total:  "+tot);
		
		System.out.println("_____Program for 2D Array_____");
		
		int [][] arr1 = new int[6][6]; 
		int count = 0;
		for(int i=1;i<arr1.length;i++) {
			for(int j=1;j<arr1.length;j++) {
				count++;
				arr1[i][j]=i*j;
				System.out.print(arr1[i][j]+"  ");
			}
			System.out.println();
		}
		
		System.out.println(".............Check Out for new Program...............");

		String str1="123456799";
		String str2="9";
		
		boolean chdup = false;
		for (int i = 0; i < str1.length(); i++) {
			for (int j = i + 1; j < str1.length(); j++) {
				if (str1.charAt(i) == str1.charAt(j)) {
					chdup=str1.charAt(i)==str1.charAt(j);
					
				}
			}
		}
		if (chdup) {
			System.out.println("duplicate");
		}else {
			System.out.println("Unique");
		}
		
		
	}
	

}
