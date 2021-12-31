package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
		System.out.print("Enter number the product: ");
		int number = sc.nextInt();
		for(int i=1;i<=number;i++) {
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			double price = sc.nextDouble();
			System.out.print("inicialized Validate (dd/MM/yyyy):");
			Date valiDate = sdf.parse(sc.next());
			
			
		}
		
		
		sc.close();
	
	}
}
