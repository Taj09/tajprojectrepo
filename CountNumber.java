import java.util.Scanner;

public class CountNumber {
		public static void main(String[] args) {
		int Number, Count=0;
		Scanner sc= new Scanner(System.in);		
		System.out.println("Enter any Number: ");
		Number = sc.nextInt();
		
		while(Number > 0) {
			Number = Number / 10;
			Count = Count + 1; 
		}
		System.out.println("Number of Digits in a Given Number = ");
		System.out.println(Count);
	}
}