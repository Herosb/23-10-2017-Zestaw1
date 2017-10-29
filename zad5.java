import java.util.Scanner;
public class zad5 {


	public static void main(String[] args) {
        System.out.println("Program sprzedazy ratalnej!");
        System.out.print("Podaj kwote: ");
        double kwota;
        Scanner odczyt = new Scanner(System.in);
        kwota = odczyt.nextDouble();
        if(kwota<100 || kwota>10000){
			System.out.println("Zle dane");
			System.out.println("Kredy od 100zl do 10tys zl");
        }
			System.out.println("iloœæ rat ");
        int rata;
        Scanner odczytRaty = new Scanner(System.in);
        rata = odczytRaty.nextInt();
        if(rata < 6 || rata > 48){
        System.out.println("Zle dane. Raty roz³ozone 6 do 48");
        }
        if (rata >=6 && rata <=12 ) {
        	double odsetki = kwota+ (kwota * 0.025);
        	System.out.println ("Rata wynosi: " +odsetki);
        }
        	else if (rata >=13 && rata <=24 ) {
        		double odsetkix = kwota+ (kwota * 0.05);
            	System.out.println ("Rata: " +odsetkix);	
        	}
            	else if (rata >=25 && rata <=48 ) {
            		double odsetkiy = kwota+ (kwota * 0.1);
                	System.out.println ("Rata: " +odsetkiy);
            	}
            	else {
            		System.out.println("Zle dane");
            	}
	}
}