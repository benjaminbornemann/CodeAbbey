package digitCount;

import java.util.Scanner;


class prime  {
	int zahl;
	
	public int querSumme ()  {
		int  rest, vorne;
				
		rest = 0;
		vorne = zahl;
		
		while (vorne != 0)  {
			rest += (vorne % 10);
			vorne /= 10;
			}
		
		return rest;
	}
	
	
	public int setValue ()  {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Bitte Wert eingeben: ");
		zahl = scan.nextInt();
		scan.close();
		return zahl;
	}
}





public class digitCount {

	public static void main(String[] args) {
		int anz;
		Scanner scan = new Scanner(System.in);
		
		prime quer = new prime();
		
		System.out.println("Wie oft?");
		anz = scan.nextInt();
		quer.setValue();
		System.out.println("Quersumme: " + quer.querSumme());
		
		
		scan.close();
		

	}

}