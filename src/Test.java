import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		int arr[][] = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		for (int col = 0; col < arr.length; col++) {
			for (int row = 0; row < arr[col].length; row++) {
				System.out.print(arr[col][row] + "\t");
			}
			System.out.println();
		}

		System.out.println("-----------For Average---------------");
		
		Scanner a=new Scanner(System.in);
		int count=0;
		int total=0;
		System.out.println("Please input your average number:");
		int avg=a.nextInt();
		
		for(count=1;count<=avg;count++) {
			total+=count;
		}

		System.out.println("Average of : "+avg+" is: "+total/avg);
	}

}