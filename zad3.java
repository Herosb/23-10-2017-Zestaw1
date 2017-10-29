import java.util.Scanner;
public class zad3 {

	public static void main(String[] args) {
		   Scanner x = new Scanner(System.in);
	        System.out.println("Podaj wage..");
	        double waga = x.nextDouble();
	        double wzrost = x.nextDouble();
	        double BMI = waga / Math.pow(wzrost, 2);
	        if (BMI < 18.5) {
	            System.out.println("Niedowaga ");
	        } else {
	            if (BMI < 24.9) {
	                System.out.println("Waga Prawid³owa ");
	            }
	            else{
	                System.out.println("Nadwaga ");
	            }
	        }
	    }
    }